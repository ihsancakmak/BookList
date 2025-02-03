public class Book {
    String name;
    int pageNum;
    String author;
    String pubDate;

    public Book(String name, String author, int pageNum, String pubDate) {
        this.name = name;
        this.author = author;
        this.pageNum = pageNum;
        this.pubDate = pubDate;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getPubDate() {
        return pubDate;
    }
}
