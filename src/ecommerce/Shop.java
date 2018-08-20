package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this the main class where the logic happen
 *
 * @author Son-Rossy Dorvil
 */
public class Shop {

    static boolean isShopOpen = true;
    static double totalAmount = 0.0;
    static int userInput = 9;

    static Product inventory[] = {new Product("Business Ritual Women’s Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue"),
        new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth"),
        new Product("Men’s Business Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal"),
        new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty", 1),
        new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman")};

    public static void main(String[] args) {
        /* // here is our invetory
        Product inventory[] = new Product[5];
        //initialize our array of products
        inventory[0] = new Product("Business Ritual Women’s Long Sleeve Top", 65.39, "Apparel", 4, 'L', "Blue");
        inventory[1] = new Product("The Art of Computer Programming", 190.54, "Books", 9, "Donald E. Knuth");
        inventory[2] = new Product("Men’s Business Casual Shirt", 57.10, "Apparel", 2, 'M', "Teal");
        inventory[3] = new Product("Organic Turmeric Soap", 11.25, "Bath & Beauty", 1);
        inventory[4] = new Product("Head First Design Pattern", 37.35, "Books", 3, "Eric Freeman");*/

        Scanner scanner = new Scanner(System.in);

        //check if shop open
        if (!isShopOpen) {
            System.out.println("Sorry the Shop is close");
        } else {
            while (true) {
                System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4: ");
                //list our menu
                int index = 0;//so i could achieve the extra credit. last time i didnt get the extra credit.
                for (Product product : inventory) {
                    System.out.println(index + ": " + product.getName());
                    index++;
                }
                //getting user input to buy from the inventory
                try {
                    userInput = scanner.nextInt();
                    if (inventory[userInput].buy()) {
                        System.out.println("Your purchase was successful");
                        totalAmount += inventory[userInput].getPrice();
                    } else {
                        System.out.println("Sorry! This product is out of stock ");
                    }
                    /*if (userInput > -1 && userInput < 5) {
                        if (inventory[userInput].buy()) {
                            System.out.println("Your purchase was successful");
                            totalAmount += inventory[userInput].getPrice();
                        } else {
                            System.out.println("Sorry! This product is out of stock ");
                        }
                        
                    } else {
                        System.out.println("Thank you for shopping with us! The total amount is $" + totalAmount);
                        break;
                    }*/
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Thank you for shopping with us! The total amount is $" + totalAmount);
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, exiting the shopping cart! Your total amount is $" + totalAmount);
                    break;
                }
            }
            scanner.close();

        }

    }

}
