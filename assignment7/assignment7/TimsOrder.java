package assignment7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Implementation of TimsOrder class
 * This class creates an order with one or more products
 * @author Danilo Nakai
 */
public class TimsOrder {
    /** Size **/
    private int size;

    /** Name **/
    private String name;

    /** Order List **/
    private static ArrayList<TimsProduct> orderList = new ArrayList();

    /**
     * Constructor method
     * @param name The order's name`
     * @param size The order's size
     **/
    private TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Create
     * @return The order created
     **/
    public static TimsOrder create() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("How many products do you want?");
        int amountOfProducts = input.nextInt();

        for(int i = 0; i < amountOfProducts; i++){
            System.out.println("Select a product by typing the number: 1.Mug  2.Donut  3.Coffee  4.Shirt");
            int selectedProduct = input.nextInt();

            switch(selectedProduct){
                case 1:
                    orderList.add(Mug.create());
                break;

                case 2:
                    orderList.add(Donut.create());
                break;

                case 3:
                    orderList.add(Coffee.create());
                break;

                case 4:
                    orderList.add(Shirt.create());
                break;
            }
        }

        System.out.println("Your order was created!");

        return new TimsOrder(name,amountOfProducts);
    }

    /**
     * Get the amount due
     * @return The amount due
     **/
    public double getAmountDue() {
        double total = 0;

        for(int i = 0; i < size; i++){
            total = total + orderList.get(i).getRetailPrice();
        }

        return total;
    }

    /**
     * Convert order information to string
     **/
    @Override
    public String toString() {
        String products = "";

        for(int i = 0; i < size; i++){
            if(i == (size - 1)){
                products += orderList.get(i).toString();
            }else{
                products += orderList.get(i).toString() + ", ";
            }
        }

        return "TimsOrder{" +
                "name='" + name + ", " +
                products +
                '}';
    }
}
