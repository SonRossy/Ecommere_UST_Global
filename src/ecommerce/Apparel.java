package ecommerce;

/**
 * @author tristesse08
 */
public class Apparel extends Product{

    private char size;
    private String color;
    
    public Apparel(String name, double price, int quantity,char size,String color) {
        super(name, price, quantity);
        size=this.size;
        color=this.color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apparel{" + "size=" + size + ", color=" + color + '}';
    }

    @Override
    void getDetails() {
        System.out.println("We sell different kinds of business clothes for both men and women");
        
    }
    
}
