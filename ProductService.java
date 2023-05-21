import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
    private List<Product> productList;

    public ProductService() {
        productList = new ArrayList<>();
    }

    public void addProduct(String name, String type, String place, String color, boolean isOutOfWarranty) {
        Product product = new Product(name, type, place, color, isOutOfWarranty);
        productList.add(product);
        System.out.println("Product added successfully!");
    }

    public void displayProducts() {
        productList.forEach(product -> {
            System.out.println("Name: " + product.getName());
            System.out.println("Type: " + product.getType());
            System.out.println("Place: " + product.getPlace());
            System.out.println("Color: " + product.getColor());
            System.out.println("Warranty Status: " + (product.isOutOfWarranty() ? "Out of Warranty" : "In Warranty"));
            System.out.println();
        });
    }

    public List<Product> searchByType(String type) {
        return productList.stream()
                .filter(product -> product.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    public List<Product> searchByWarrantyStatus(boolean isOutOfWarranty) {
        return productList.stream()
                .filter(product -> product.isOutOfWarranty() == isOutOfWarranty)
                .collect(Collectors.toList());
    }

    public List<Product> searchByPlace(String place) {
        return productList.stream()
                .filter(product -> product.getPlace().equalsIgnoreCase(place))
                .collect(Collectors.toList());
    }

    public List<Product> searchByColor(String color) {
        return productList.stream()
                .filter(product -> product.getColor().equalsIgnoreCase(color))
                .collect
