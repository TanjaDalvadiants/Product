package domain;

public class Book extends Product {
    private String author;

    public Book(int id, String name, int price) {
        super(id, name, price);
        this.author = getAuthor();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

