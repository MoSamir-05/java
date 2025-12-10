class Product {

    String name;
    String productCode;
    String manufacturer;

    Product() {
        name = "Not Given";
        productCode = "0000";
        manufacturer = "Unknown";
    }

    Product(String name, String productCode, String manufacturer) {
        this.name = name;
        this.productCode = productCode;
        this.manufacturer = manufacturer;
    }

    void display() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Code: " + productCode);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("-----------------------------");
    }
}
public class TestProduct_Q9 {
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.display();

        Product p2 = new Product("Laptop", "LP1001", "Dell");
        p2.display();

        Product p3 = new Product("Mobile", "MB250", "Samsung");
        p3.display();
    }
}
