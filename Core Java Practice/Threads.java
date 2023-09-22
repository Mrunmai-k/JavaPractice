// class A implements Runnable//extends Thread 
// {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable // extends Thread
// {
//     public void run() {
//         for (int i = 0; i <= 10; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Threads {
    public static void main(String[] args) {
        /*
         * The whole point of creating the A and B classes are just to implement
         * runnable interface. So instead create a annonymous class.
         * Runnable is functional interface so we can write lambda expressions.
         */
        Runnable obj1 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Only for Thread class
        // System.out.println(obj1.getPriority());
        // priority ranges from 1-10, 1 is least and 10 is highest , 5 is normal and
        // default.
        // obj1.setPriority(Thread.MAX_PRIORITY);
        // This will only SUGGEST the scheduler to give high priority.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        /*
         * In above scenario, first obj1.show() will print hi 10 times and then
         * obj2.show() will print hello 10 times. But what if we want both to be printed
         * simultaneously?
         */

    }
}

// Extends the classes with Thread class.
// Instead of calling show method in main call start() method, which will create
// new threads.
// Declare run() method in classes instead of show().
// Run the loop for 100 times to visualize the parallel running.

/*
 * Thread class is implementing Runnable interface which defines run() method
 * only. So we can implement Runnable interface also.
 */