package assignment7;

import javafx.scene.paint.Color;
import java.util.Scanner;

/**
 * Implementation of Shirt class
 * This class creates a specific product Shirt extending the parent class TimsProduct
 * @author Danilo Nakai
 */
public class Shirt extends TimsProduct{
    /** Color **/
    private Color color;

    /**
     * Constructor method
     * @param name The product's name
     * @param color The product's color
     * @param cost The product's cost
     * @param price The product's price
     **/
    private Shirt(String name, Color color, double cost, double price) {
        super(name,cost,price);
        this.color = color;
    }

    /**
     * Create
     * @return The shirt created
     **/
    public static Shirt create() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the name of the shirt?");
        String name = input.nextLine();
        System.out.println("What's the color of the shirt?");
        String color = input.nextLine();
        System.out.println("What's the cost of the shirt?");
        double cost = input.nextDouble();
        System.out.println("What's the price of the shirt?");
        double price = input.nextDouble();

        System.out.print("Your shirt was created!\n");
        return new Shirt(name,Color.web(color),cost,price);
    }

    /**
     * Get the color
     * @return The product's color
     **/
    public Color getColor() {
        return color;
    }

    /**
     * Convert products information to string
     **/
    @Override
    public String toString() {
        return "Shirt{" +
                "name=" + super.getName() + ", " +
                "cost=" + super.getProductionCost() + ", " +
                "price=" + super.getRetailPrice() + ", " +
                "color=" + color +
                '}';
    }
}
