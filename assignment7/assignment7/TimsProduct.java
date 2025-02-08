package assignment7;

/**
 * Implementation of TimsProduct class
 * This class creates a product and can be used to create a more specific product
 * @author Danilo Nakai
 */
public class TimsProduct implements Commodity{
    /** Name **/
    private String name;

    /** Cost **/
    private double cost;

    /** Price **/
    private double price;

    /**
     * Constructor method
     * @param name The product's name
     * @param cost The product's cost
     * @param price The product's price
     **/
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * Get the name
     * @return The product's name
     **/
    public String getName() {
        return name;
    }

    /**
     * Get the production cost
     * @return The product's production cost
     **/
    public double getProductionCost() {
        return cost;
    }

    /**
     * Get the retail price
     * @return The product's retail price
     **/
    public double getRetailPrice() {
        return price;
    }

    /**
     * Convert products information to string
     **/
    @Override
    public String toString() {
        return "TimsProduct{" +
                "name='" + name + ", " +
                ", cost=" + cost + ", " +
                ", price=" + price +
                '}';
    }
}
