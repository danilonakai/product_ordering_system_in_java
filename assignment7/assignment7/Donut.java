package assignment7;

import java.util.Scanner;

/**
 * Implementation of Donut class
 * This class creates a specific product Donut extending the parent class TimsProduct
 * @author Danilo Nakai
 */
public class Donut extends TimsProduct implements Consumable{
    /** Description **/
    private String description;

    /** Calories **/
    private int calorieCount;

    /**
     * Constructor method
     * @param name The product's name
     * @param description The product's description
     * @param cost The product's cost
     * @param price The product's price
     * @param calories The product's calories
     **/
    private Donut(String name, String description, double cost, double price, int calories) {
        super(name,cost,price);
        this.description = description;
        this.calorieCount = calories;
    }

    /**
     * Create
     * @return The donut created
     **/
    public static Donut create() {
        Scanner input = new Scanner(System.in);
        System.out.println("What's the name of the donut?");
        String  name = input.nextLine();
        System.out.println("What's the description of the donut?");
        String description = input.nextLine();
        System.out.println("What's the cost of the donut?");
        double cost = input.nextDouble();
        System.out.println("What's the price of the donut?");
        double price = input.nextDouble();
        System.out.println("What's the calories of the donut?");
        int calories = input.nextInt();

        System.out.print("Your donut was created!\n");

        return new Donut(name,description,cost,price,calories);
    }

    /**
     * Get the description
     * @return The product's description
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Get the calories
     * @return The product's calories
     **/
    public int getCalorieCount() {
        return calorieCount;
    }

    /**
     * Get the consumption method
     * @return The product's consumption method
     **/
    public String getConsumptionMethod(){
        return "Eat it";
    }

    /**
     * Convert products information to string
     **/
    @Override
    public String toString() {
        return "Donut{" +
                "name=" + super.getName() + ", " +
                "cost=" + super.getProductionCost() + ", " +
                "price=" + super.getRetailPrice() + ", " +
                "description=" + description + ", " +
                "calories=" + calorieCount +
                '}';
    }
}
