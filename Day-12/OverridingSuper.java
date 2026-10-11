class Employee13 {
    void displayRole(){
        System.out.println("Employee");
    }
}
class Manager extends Employee13 {
    @Override
    void displayRole(){
        super.displayRole();
        System.out.println("Manager");
    }
}

public class OverridingSuper {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.displayRole();
    }
}
