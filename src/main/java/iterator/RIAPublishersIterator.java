package iterator;

import collection.RIA;

import java.util.ArrayList;
import java.util.List;

public class RIAPublishersIterator implements PublishersIterator {

    private RIA ria;
    private int currentPosition = 0;
    private List<String> todayNews = new ArrayList<>();
    private NewsType type;

    public RIAPublishersIterator(RIA ria, NewsType type){
        this.ria = ria;
        this.type = type;
    }

    @Override
    public boolean hasNext() {
        if (todayNews.size() == 0){
            todayNews = ria.requestNews(this.type);
        }
        return currentPosition < todayNews.size();
    }

    @Override
    public String next() {
        if (hasNext()){
            String result = todayNews.get(currentPosition);
            currentPosition++;
            return result;
        }
        return null;
    }
}
