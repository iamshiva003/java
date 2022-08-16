// Demonstrate concept of interface

interface Dept {
    int bpay = 20000;
    double bonus(double b);
}

class Sales implements Dept {
    public double bonus(double b) {
        System.out.println("Bonus: " + (bpay*b));
        return (bpay + (bpay*b));
    }
}

public class Test {
    public static void main(String[] args) {
        Sales s = new Sales();
        System.out.println("Total Salary: " + s.bonus(0.2));
    }
}
