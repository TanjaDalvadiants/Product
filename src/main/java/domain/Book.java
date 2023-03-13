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
    public boolean matches(String search) {
        if (super.matches(search)) { // вызов метода matches в версии описанной в Product
            return true;
        }
        if (super.matches(search)) { // вызов метода matches в версии описанной в Product
            return false;...;
    }
}

