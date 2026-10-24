import java.util.HashMap;
import java.util.Map;

public class InventoryManagement {

    //Inventory Map
    private static final
    HashMap<String, Integer> inventory = new HashMap<>();
    //initialize inventory with default products
    static{
        inventory.put("Laptop", 10);
        inventory.put("Mouse", 25);
        inventory.put("Keyboard", 15);
        inventory.put("Monitor", 8);
    }

    //1.Add a new product
    public static void addProduct(String product, int quantity) {
        validateQuantity(quantity);

        if (inventory.containsKey(product)) {
            throw new IllegalArgumentException("Product already exists: "+ product);
        }
        inventory.put(product, quantity);
        System.out.println("Product added: "+product);
    }

    //2. update the quantity of an existing product
    public static void updateQuantity(String product, int quantity) {
        validateQuantity(quantity);
        if (!inventory.containsKey(product)) {
            throw new IllegalArgumentException("Product not found: "+product);
        }
        inventory.put(product, quantity);
        System.out.println("Product updated: "+product);
    }

    //3. Remove a product
    public static void removeProduct(String product) {
        if (!inventory.containsKey(product)) {
            throw new IllegalArgumentException("product not found: "+product);
        }
        inventory.remove(product);
        System.out.println("Product removed: "+product);
    }

    //4. Display all products and quantity
    public static void displayInventory() {
        System.out.println("\nCurrent inventory: ");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }

    //5. Check whether a product exist
    public static boolean productExists(String product) {
        return inventory.containsKey(product);
    }

    //6. Calculate total quantity of all products
    public static int getTotalQuantity() {
        int total =0;
        for(int quantity : inventory.values()) {
            total+=quantity;
        }
        return total;
    }

    //7. Reject negative quantities
    public static void validateQuantity(int quantity) {
        if (quantity < 0 ) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
    }

    public static void main(String[] args) {

        //Add headphones
        try{
            addProduct("Headphones", 12);
        }
        catch(IllegalArgumentException e ) {
            System.out.println("Error :"+e.getMessage());
        }

        //update mouse quantity
        try{
            updateQuantity("Mouse", 20);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Error :"+e.getMessage());
        }

        //Remove quantity
        try{
            removeProduct("Keyboard");
        }
        catch(IllegalArgumentException e) {
            System.out.println("Error :"+e.getMessage());
        }

        //try adding webcam with negative quantity
        try{
            addProduct("Webcam", -5);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Error :"+e.getMessage());
        }

        //Check Whether laptop exists
        System.out.println("Laptop exists: "+productExists("Laptop"));

        //Display final inventory
        displayInventory();

        //Display total inventory quantity
        System.out.println("\nTotal inventory quantity: "
        + getTotalQuantity());

    }
}
