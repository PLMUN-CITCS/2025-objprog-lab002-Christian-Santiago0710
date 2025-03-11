class Student {
    private String name;
    private int age;
    private double itemPrice;
    private int counter;

    public Student(String name, int age, double itemPrice, int counter) {
        this.name = name;
        this.age = age;
        this.itemPrice = itemPrice;
        this.counter = counter;
    }

    public double calculateTotalPrice() {
        return itemPrice * counter;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Number of Items: " + counter);
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
}

public class StudentPurchaseOOP {
    public static void main(String[] args) {
        int studentAge = 15;
        double itemPrice = 29.99;
        String studentName = "Alice";
        int counter = 10;
        int counterDifferentCase = 20;

        Student alice = new Student(studentName, studentAge, itemPrice, counter);
        alice.displayInfo();
        System.out.println("Counter (Different Case): " + counterDifferentCase);
    }
}
