package demo;

import collection.Publishers;
import iterator.PublishersIterator;

public class Client {
    public Publishers publishers;
    public PublishersIterator publishersIterator;

    public Client(Publishers publishers) {
        this.publishers = publishers;
    }

    public void publishPoliticsNews() {
        System.out.println("\nThe introduction of the Politics news...\n");
        publishersIterator = publishers.createPoliticsNewsIterator();
        publish();
    }

    public void publishMoscowNews() {
        System.out.println("\nThe introduction of the Moscow news...\n");
        publishersIterator = publishers.createMoscowNewsIterator();
        publish();

    }

    public void publish(){
        int i = 1;
        while (publishersIterator.hasNext()) {
            System.out.println(i + ". " + publishersIterator.next());
            i++;
        }
    }


}
