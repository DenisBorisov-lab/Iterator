package collection;

import information.News;
import iterator.PublishersIterator;
import iterator.NewsType;
import iterator.YandexPublishersIterator;

import java.util.*;

public class YandexNews implements Publishers {
    private List<News> news;

    public YandexNews(List<News> news) {
        if (news.size() == 0){
            this.news = new ArrayList<>();
        }else{
            this.news = news;
        }
    }

    public Deque<String> requestYandexNews(NewsType type){
        Deque<String> queue = new ArrayDeque<>();
        for (News target : news){
            if (target.getType() == type){
                queue.add(target.getMessage());
            }
        }
        return queue;
    }

    @Override
    public PublishersIterator createPoliticsNewsIterator() {
        return new YandexPublishersIterator(this, NewsType.POLITICS);
    }

    @Override
    public PublishersIterator createMoscowNewsIterator() {
        return new YandexPublishersIterator(this, NewsType.MOSCOW);
    }
}
