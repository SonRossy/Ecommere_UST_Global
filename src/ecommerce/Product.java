package ecommerce;

/**
 * this is quiz 5
 *
 * @author Son-Rossy Dorvil
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    
    //attributes
    private String name;
    private double price;
    private String category;
    private int quantity;
    private char size;
    private String author;
    private String color;

    //constructors
    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public Product(String name, double price, String category, int quantity, String author) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.author = author;
    }

    public Product(String name, double price, String category, int quantity, char size, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + price + ", category=" + category + ", quantity=" + quantity + ", size=" + size + ", author=" + author + ", color=" + color + '}';
    }

    //setters and getters
    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //instant methods
    boolean buy(){
        if(this.quantity>0){
            this.quantity--;
            return true;
        }
        return false;
    }

}
