// 2. Demonstrate a single inheritance.
class Vehicle {
    String name;
    int regNo;
    double cost;

    public Vehicle(String name, int regNo, double cost) {
        this.name = name;
        this.regNo = regNo;
        this.cost = cost;
    }

    public void run() {
        System.out.println("Vehicle is Running");
    }

    public void display() {
    System.out.println("Name: "+name+" Registration No: "+regNo+" Cost:"+cost);
    }
}

class Car extends Vehicle {
    public Car(String name, int regNo, double cost) {
        super(name, regNo, cost);
    }

    public void display() {
        super.display();
    }

    public void run() {
        System.out.println("Car is Running");
    }

    public static void main(String[] args) {
        Car c = new Car("Maruthi", 2020, 500000);
        c.display();
        c.run();
    }
}