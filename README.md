# Tim's Product Ordering System
This project implements a Java application that models an ordering system for a fictional café called Tim's. The assignment demonstrates the use of **Polymorphism**, **Abstract Classes**, and **Interfaces** in Java. The system simulates different products available for purchase, some of which are consumable, and others are not. Additionally, it handles customer orders and calculates the total price of the order. 
The app also demonstrates core Java concepts including **Encapsulation**, **Inheritance**, and **Polymorphism**. It allows users to interact with the system to customize product orders and compute the total cost of the order.

## Features
- **Polymorphism**: The system leverages polymorphism to handle various types of products, such as consumables (e.g., drinks, food) and non-consumables, in a unified manner.
- **Abstract Classes & Interfaces**: The system uses abstract classes and interfaces to define a blueprint for products and enforce consistency in the product model.
- **Static Create Methods**: Instead of directly using constructors, static `create()` methods are used to instantiate objects. These methods include dialogs for user input.
- **Order Calculation**: The system calculates the total cost of a customer's order by summing the prices of all the products included in the order.
- **Interactive User Interface**: Through dialogs, users can specify the products they wish to purchase, as well as the relevant details (e.g., color for mugs, description for donuts).

## Development Environment
- **Java Version**: 15 (Liberica JDK 15) or higher
- **IDE**: IntelliJ IDEA (Community Edition)

## Class Structure

### `TimsProduct`
The base class for all products. Implements the `Commodity` interface. This class defines the general structure for all product types.

### `Commodity` (Interface)
This interface defines the common structure that all products must adhere to. It includes methods that are implemented by all product types.

### `Consumable` (Interface)
An interface that extends `Commodity`. It represents products that can be consumed (like food or drinks).

### `Coffee` (Class)
A concrete class that implements both `TimsProduct` and `Consumable`. It represents a coffee product.

### `Donut` (Class)
A concrete class that implements both `TimsProduct` and `Consumable`. It represents a donut product.

### `Mug` (Class)
A concrete class that implements `TimsProduct` and `Consumable`. It represents a mug product.

### `Shirt` (Class)
A concrete class that implements `TimsProduct` but is **not** consumable. It represents a shirt product.

### `TimsOrder` (Class)
Represents a customer's order. This class contains an array of `TimsProduct` objects, and the method `getAmountDue()` calculates the total price of the order. The `create()` method initiates a dialog with the user to gather the order details and create a `TimsOrder` object.

### `TestClass` (Class)
This class contains the `main` method, which runs the application. It calls `TimsOrder.create()` to create an order, and then prints the details of the order along with the total price.

## How to Use
1. Clone the repository to your local machine.
2. Open the project in IntelliJ IDEA (Community Edition).
3. Ensure that you are using Java 15 (Liberica JDK 15).
4. Run the `TestClass.java` file to interact with the order system.
5. The program will prompt you for your name, the number of products you want to order, and the type of products. You will be asked to provide details such as color for mugs and description for donuts.
6. Once the order is complete, the system will display the full order details and the total price, rounded to two decimal places.

### Sample Output:
![image](https://github.com/user-attachments/assets/0467af81-cdf8-4d8e-b5f7-91d52a709182)

## Implementation Notes
- The `create()` methods in classes like `Mug`, `Donut`, `Coffee`, and `Shirt` interact with the user to collect input, making the system highly interactive.
- The `getConsumptionMethod()` method in consumable products (e.g., `Mug`, `Donut`, `Coffee`) defines how each product is consumed.
- The system calculates the total cost of an order by summing up the prices of all products in the order.

## Files in this Repository
- `TimsProduct.java`: Base class for all products.
- `Commodity.java`: Interface for all products.
- `Consumable.java`: Interface for consumable products.
- `Coffee.java`: Class representing a Coffee product.
- `Donut.java`: Class representing a Donut product.
- `Mug.java`: Class representing a Mug product.
- `Shirt.java`: Class representing a Shirt product.
- `TimsOrder.java`: Class representing a customer order.
- `TestClass.java`: Entry point to run the program and test the system.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
