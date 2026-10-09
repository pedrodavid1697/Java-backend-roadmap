class Person{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0 && age <= 120) {
            this.age = age;
        }
        else{
            System.out.println("Invalid Age: "+age);
        }
    }
}


public class AgeValidation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(42);
        System.out.println("Age: "+p1.getAge());
        p1.setAge(130);
        System.out.println("Age: "+p1.getAge());
    }
}
