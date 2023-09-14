// interface A {
//     // All the variables declared in interface are by default, final and static
//     /*
//      * int age;
//      * String name;
//      */
//     // That's why above will throw error.
//     int age = 22; 
//     String name = "Mrunmai";

//     void show();

//     void config();
// }

// interface X {
//     void run();
// }

// interface Y extends X {

// }

// class B implements A, X {
//     public void show() {
//         System.out.println("in show");
//     }

//     public void config() {
//         System.out.println("in config");
//     }

//     public void run() {
//         System.out.println("Running...");
//     }
// }

// public class Interfaces {
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.config();
//         obj.show();

//         System.out.println(A.age);
//         System.out.println(A.name);
//     }
// }

// // If the abstract class have all the abstract methods then create interface.
// // All the methods in interface are by default public and abstract.
// // Interface is not a class.
// // If you failed to implement any of the method in interface the child class
// // also becomes abstract class.
// // All the variables declared in interface are by default, final and static
// // As variables are static we can access them directly by interface without
// // creating the object.

// // One class can implement multiple interfaces.
// /*
//  * class - class -> extends
//  * class - interface -> implements
//  * interface - interface -> extends
//  */

//  Need of the interface
abstract class Computer {
    public abstract void code(); // instead of defining blank implementation make it abstract. Now all the
                                 // methods are abstract we can simply convert this to interface.
}

class Laptop extends Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("code, compile, run, faster");
    }
}

class Developer {
    // so writing lap here will create issue as there are desktops also.
    // This tells that developer is dependant only lap but it's not true, so we will
    // create class Computer. And change Laptop parameter to Computer
    public void devApp(Computer lap) {
        lap.code();
    }
}

class Demo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        dev.devApp(lap); // Even if the objects are diff but they are ref of Computer so this will throw
                         // any error.
        dev.devApp(desk);

        // This will call the devApp() passing lap oject, but lap is not the only way to
        // code for developers. They can also get Desktop. So create ref of Computer.

    }
}
