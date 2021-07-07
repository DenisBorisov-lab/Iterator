package iterator;

import collection.YandexNews;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

public class YandexPublishersIterator implements PublishersIterator {
    private Deque<String> news = new ArrayDeque<>();
    private int currentPosition;
    private YandexNews yandexNews;
    private NewsType type;
    private int value = 0;

    public YandexPublishersIterator(YandexNews yandexNews, NewsType type) {
        this.yandexNews = yandexNews;
        this.type = type;
    }

    @Override
    public boolean hasNext() {
         if (news.size() == 0){
              news = yandexNews.requestYandexNews(type);
              value = news.size();
         }

        return currentPosition < value;
    }

    @Override
    public String next() {
        if (hasNext()) {
             currentPosition++;
             String result = news.element();
             news.remove();
            return result;
        }
        return null;
    }
}
