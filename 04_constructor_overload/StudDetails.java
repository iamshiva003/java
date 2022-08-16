// implement constructor overloading by passing different number of parameter of differet types

import java.lang.*;

public class StudDetails {
    String name;
    int roll;
    double per;

    public StudDetails() {
        name = "ABC";
        roll = 20;
        per = 60.00;
    }

    public StudDetails(String name, int roll, double per) {
        this.name = name;
        this.roll = roll;
        this.per = per;
    }

    public void display() {
        System.out.println("Name: " + name + " Roll: " + roll + " Percentage: " + per);
    }

    public static void main(String[] args) {
        StudDetails s1 = new StudDetails();
        s1.display();

        StudDetails s2 = new StudDetails("XYZ", 30, 70.00);
        s2.display();
    }
}
