# telusko-assignment-2-
# Product Management System

This is a Java project that implements a product management system. The system allows you to add products and display them based on various criteria such as type, warranty status, place, and color. The project is divided into three files: `Main.java`, `Product.java`, and `ProductService.java`.

## Main.java

The `Main` class contains the main method and serves as the entry point for the program. In this file, we create an instance of the `ProductService` class and demonstrate the functionality by adding products and displaying them.

## Product.java

The `Product` class represents a product with properties such as name, type, place, color, and warranty status. It provides getters and setters for these properties to allow manipulation of product information.

## ProductService.java

The `ProductService` class provides the core functionality of the product management system. It contains methods for adding products, displaying products, and searching for products based on different criteria. It uses the Stream API to perform operations such as filtering and sorting on the product list.

### Methods

- `addProduct(String name, String type, String place, String color, boolean isOutOfWarranty)`: Adds a new product with the provided information to the product list.

- `displayProducts()`: Displays all the products in a formatted manner.

- `searchByType(String type)`: Searches for products with the specified type and returns a list of matching products.

- `searchByWarrantyStatus(boolean isOutOfWarranty)`: Searches for products based on the specified warranty status (in or out of warranty) and returns a list of matching products.

- `searchByPlace(String place)`: Searches for products with the specified place and returns a list of matching products.

- `searchByColor(String color)`: Searches for products with the specified color and returns a list of matching products.

## Usage

To use the product management system, follow these steps:

1. Compile the Java files:

2. Run the Main class:

3. The program will display a menu-driven interface where you can choose options to add products and display them based on various criteria.

4. Follow the on-screen prompts to add products and perform different operations.

## Contributing

Contributions to the project are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
Feel free to customize the README.md file according to your project's specific details and requirements.
