public class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalPrice() {
        return price* quantity;
    }

    void displayProductDetails() {
        System.out.println("Product: "+name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Price: "+calculateTotalPrice());
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000, 2);
        Product p2 = new Product("Mouse", 1000, 3);

        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
