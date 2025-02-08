package assignment7;

import javafx.scene.paint.Color;
import java.util.Scanner;

/**
 * Implementation of Mug class
 * This class creates a specific product Mug extending the parent class TimsProduct
 * @author Danilo Nakai
 */
public class Mug extends TimsProduct{
    /** Color **/
    private Color color;

    /**
     * Constructor method
     * @param name The product's name
     * @param color The product's color
     * @param cost The product's cost
     * @param price The product's price
     **/
    private Mug(String name, Color color, double cost, double price) {
        super(name,cost,price);
        this.color = color;
    }


    /**
     * Create
     * @return The mug created
     **/
    public static Mug create() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the name of the mug?");
        String name = input.nextLine();
        System.out.println("What's the color of the mug?");
        String color = input.nextLine();
        System.out.println("What's the cost of the mug?");
        double cost = input.nextDouble();
        System.out.println("What's the price of the mug?");
        double price = input.nextDouble();

        System.out.print("Your mug was created!\n");
        return new Mug(name,Color.web(color),cost,price);
    }

    /**
     * Get the color
     * @return The mug's color
     **/
    public Color getColor() {
        return color;
    }

    /**
     * Convert mug information to string
     **/
    @Override
    public String toString() {
        return "Mug{" +
                "name=" + super.getName() + ", " +
                "cost=" + super.getProductionCost() + ", " +
                "price=" + super.getRetailPrice() + ", " +
                "color=" + color +
                '}';
    }
}
