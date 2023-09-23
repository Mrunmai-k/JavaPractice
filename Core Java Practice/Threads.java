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

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        /*
         * The whole point of creating the A and B classes are just to implement
         * runnable interface. So instead create a annonymous class.
         * Runnable is functional interface so we can write lambda expressions.
         */

        Counter c = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i <= 1000; i++) {
                // System.out.println("Hi");
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                c.increment();
            }

        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 1000; i++) {
                // System.out.println("Hi");
                // try {
                // Thread.sleep(10);
                // } catch (InterruptedException e) {
                // e.printStackTrace();
                // }
                c.increment();
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

        t1.join();
        t2.join();
        // The main will now wait till t1 and t2 both joins to main thread.

        System.out.println(c.count); // now both the threads are calling increment method so ideally the count should
                                     // be 2000. But we are getting diff values every time we run the code.
        /*
         * This is happening because when two threads are executing their work main
         * thread is doing nothing, it's job was to simply start the threads adn after
         * that it's printing the count in-between the operations of threads. We need to
         * wait for the threads to completes it's jobs and come back to the main thread
         * and then only print the count. (use join method)
         */

        /*
         * Still the ouput is sometimes 2000 and sometimes below than that. It is
         * happening because both threads are working parallely in asynchronized way so
         * add keyword synchronied in method definition
         */

        // --------------------------------------------------------------------------------------------
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

/* 
Thread States:

      start()                notify()
NEW  --------->  RUNNABLE  <----------  WAITING
                    |                       /\
                    |                       |
                    |run()                  |
                    |         sleep() &     |
                   \|/         wait()       |  
                 RUNNING --------------------
                    |
                    |
                    |  stop()
                    |---------> DEAD
*/                            