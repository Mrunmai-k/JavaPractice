class A extends Thread{
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

        /*
         * In above scenario, first obj1.show() will print hi 10 times and then
         * obj2.show() will print hello 10 times. But what if we want both to be printed
         * simultaneously?
         */

        
    }
}

// Extends the classes with Thread class. 
// Instead of calling show method in main call start() method, which will create new threads.
// Declare run() method in classes instead of show(). 
// Run the loop for 100 times to visualize the parallel running.