package ecommerce;

/**
 * @author tristesse08
 */
public class Book extends Product {

    private String author;
    private String genre;
    private String isbn;

    public Book(String name, double price, int quantity, String author) {
        super(name, price, quantity);
        author = this.author;
    }

    public Book(String name, double price, int quantity, String author, String genre, String isbn) {
        super(name, price, quantity);
        author = this.author;
        genre = this.genre;
        isbn = this.isbn;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "author=" + author + ", genre=" + genre + ", isbn=" + isbn + '}';
    }

    @Override
    void getDetails() {
        System.out.println("We sell books that’ll make you smarter at programming");
    }

}
