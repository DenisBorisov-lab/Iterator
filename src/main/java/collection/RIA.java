package collection;

import information.News;
import iterator.PublishersIterator;
import iterator.NewsType;
import iterator.RIAPublishersIterator;

import java.util.ArrayList;
import java.util.List;

public class RIA implements Publishers {
    private List<News> news;

    public RIA(List<News> news) {
        if (news.size() == 0){
            this.news = new ArrayList<>();
        }else{
            this.news = news;
        }
    }

    public List<String> requestNews(NewsType type){
        List<String> data = new ArrayList<>();
        for (News target : news){
            if (target.getType() == type){
                data.add(target.getMessage());
            }
        }
        return data;
    }

    @Override
    public PublishersIterator createPoliticsNewsIterator() {
        return new RIAPublishersIterator(this, NewsType.POLITICS);
    }

    @Override
    public PublishersIterator createMoscowNewsIterator() {
        return new RIAPublishersIterator(this, NewsType.MOSCOW);
    }
}
