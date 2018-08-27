
package ecommerce;

/**
 * @author tristesse08
 */
public class Bath extends Product{

    public Bath(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    void getDetails() {
        System.out.println("We sell organic bath products!");
    }
    
}
