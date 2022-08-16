class A extends Thread {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println("i = " + i);
        }
    }
}

class B extends Thread {
    public void run() {
        for(int j=1; j<=3; j++) {
            System.out.println("j = " + j);
        }
    }
}

class C extends Thread {
    public void run() {
        for(int k=1; k<=3; k++) {
            System.out.println("k = " + k);
        }
    }
}

public class TestThread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        c.setPriority(9);
        b.setPriority(2);
        a.setPriority(4);

        a.start();
        b.start();
        c.start();
    }
}
