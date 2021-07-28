package collection;

import iterator.PublishersIterator;

public interface Publishers {
    PublishersIterator createPoliticsNewsIterator();
    PublishersIterator createMoscowNewsIterator();
}
