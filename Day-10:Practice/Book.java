public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    double applyDiscount(double percentage){
        double discount=0;
        if(price >=500) {
            discount = (price * percentage)/100;
        }
        return price - discount;
    }

    void displayDetails() {
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("After eligible discount, Final Price:"+applyDiscount(10));}
    public static void main(String[] args) {
        Book book1 = new Book("Bloody Marry", "Shrikant", 600);
        Book book2 = new Book("Half Girlfriend", "chetan bhagat", 300);

        book1.displayDetails();
        book2.displayDetails();
    }
}
