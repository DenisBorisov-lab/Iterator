package information;

import iterator.NewsType;

public class News {
    private String message;
    private NewsType type;

    public News(String message, NewsType type) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public NewsType getType() {
        return type;
    }
}
