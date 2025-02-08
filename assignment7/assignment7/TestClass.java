package assignment7;

/**
 * Implementation of TestClass
 * This class is created to test the system
 * @author Danilo Nakai
 */
public class TestClass {
    /**
     * A method to test the object
     * @param args unused
     **/
    public static void main(String[] args) {
        TimsOrder t = TimsOrder.create();
        System.out.println(t);
        System.out.printf("Total Price: $%.2f\n", t.getAmountDue());
    }
}