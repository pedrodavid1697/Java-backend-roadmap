class DisplayInfo {
    void display(int value){
        System.out.println("Value: "+value);
    }
    void display(String value){
        System.out.println("Value: "+value);
    }
    void display(double value){
        System.out.println("Value: "+value);
    }
    void display(boolean value){
        System.out.println("Value: "+value);
    }
}

public class OverloadingDiffDatatypes {
    public static void main(String[] args) {
        DisplayInfo displayInfo = new DisplayInfo();
        displayInfo.display(12);
        displayInfo.display("Jack");
        displayInfo.display(23.4);
        displayInfo.display(true);
    }
}
