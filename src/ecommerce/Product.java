package ecommerce;

/**
 * this is quiz 5
 *
 * @author Son-Rossy Dorvil
 */
public abstract class Product {

    /**
     * @param args the command line arguments
     */
    //attributes
    private String name;
    private double price;
    private int quantity;

    //constructors
    public Product(String name, double price,int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //instant methods
    abstract void getDetails();

    boolean buy() {
        if (this.quantity > 0) {
            this.quantity--;
            return true;
        }
        return false;
    }

}
