package demo;

import collection.Publishers;
import collection.RIA;
import collection.YandexNews;
import information.News;
import iterator.NewsType;

import java.util.*;

public class Demo {
    private static Publishers publishers;

    public static void main(String[] args) {
        System.out.println("Choose the publisher");
        System.out.println("1. RIA News");
        System.out.println("2. Yandex News");
        System.out.print("Choose the number: ");
        int publisher = new Scanner(System.in).nextInt();
        if (publisher == 1) {
            publishers = new RIA(createRIANews());
        } else if (publisher == 2) {
            publishers = new YandexNews(createYandexNews());
        }

        Client client = new Client(publishers);
        client.publishPoliticsNews();
        client.publishMoscowNews();
    }

    public static List<News> createRIANews() {
        List<News> data = new ArrayList<>();
        data.add(new News("В Кремле пообещали ответить на любую попытку Британии нарушить российскую границу", NewsType.MOSCOW));
        data.add(new News("Президента Гаити убили при нападении на резиденцию", NewsType.POLITICS));
        data.add(new News("Глава Минпромторга получил высшую госнаграду Венгрии для иностранцев", NewsType.POLITICS));
        data.add(new News("Литва построит стену на границе с Белоруссией", NewsType.ECONOMICS));
        data.add(new News("Спасатели нашли тела 19 человек, погибших при крушении Ан-26 на Камчатке", NewsType.MOSCOW));
        return data;
    }

    public static List<News> createYandexNews() {
        List<News> data = new ArrayList<>();
        data.add(new News("Мишустин поручил актуализировать модель вакцинации для достижения коллективного иммунитета", NewsType.MOSCOW));
        data.add(new News("«Яндекс» запустит в трех районах Москвы сервис аренды электросамокатов", NewsType.MOSCOW));
        data.add(new News("Литва построит стену на границе с Белоруссией для сдерживания мигрантов", NewsType.POLITICS));
        data.add(new News("Путин поручил до 1 августа реализовать меры по ежемесячным выплатам на детей до семи лет", NewsType.SOCIETY));
        data.add(new News("Путин поручил правительству повысить доступность льготного кредитования для малого бизнеса", NewsType.ECONOMICS));
        data.add(new News("Сборная России проведет матч отборочного турнира ЧМ-2022 против Словакии в Казани", NewsType.SPORT));
        data.add(new News("Международный Каннский фестиваль открылся во Франции", NewsType.CULTURE));
        return data;
    }
}
