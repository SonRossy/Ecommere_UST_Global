package ecommerce;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author tristesse08
 */
public class Online {

    static ArrayList<Product> items = new ArrayList();
    static double totalAmount = 0.0;
    static int userInput = 9;

    public static void main(String[] args) {
        items.add(new Apparel("Business Ritual Women's Long Sleeve To", 65.39, 4, 'L', "Blue"));
        items.add(new Book("The Art of Computer Programming", 190.54, 9, "Donal E Knuth", "Education", "9788-429-1266-48"));
        items.add(new Apparel("Men’s Business Casual Shirt", 57.10, 2, 'M', "Teal"));
        items.add(new Bath("Organic Turmeric Soap", 11.25, 1));
        items.add(new Book("Head First Design Pattern", 37.34, 3, "Eric Freeman"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4: ");
            //list our menu
            int index = 0;//so i could achieve the extra credit. last time i didnt get the extra credit.
            for (Product product : items) {
                System.out.println(index + ": " + product.getName());
                index++;
            }
            //getting user input to buy from the inventory
            try {
                userInput = scanner.nextInt();
                if (items.get(userInput).buy()) {
                    System.out.println("Your purchase was successful");
                    totalAmount += items.get(userInput).getPrice();
                } else {
                    System.out.println("Sorry! This product is out of stock ");
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Thank you for shopping with us! The total amount is $" + totalAmount);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, exiting the shopping cart! Your total amount is $" + totalAmount);
                break;
            } finally {
                //scanner.close();
            }
        }
        scanner.close();

    }

}
