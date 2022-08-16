// Demonstrate concept of creating, accessing and using a package

import mypack.Addition;

public class TestPack {
    public static void main(String[] args) {
        Addition a = new Addition(10, 20);
        System.out.println("Addition of two numbers: " + a.sum());
    }
}
