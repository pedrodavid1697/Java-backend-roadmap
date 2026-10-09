class Product1{
    private String name = "Kit Kat";
    private double price;

    String getName(){
        return name;
    }
    double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}


public class ReadOnlyProperty {
    public static void main(String[] args) {
        Product1 product = new Product1();

        System.out.println("Product: "+ product.getName());
        product.setPrice(342);
        System.out.println("Price: "+product.getPrice());
    }
}
