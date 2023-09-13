interface A{
    // All the variables declared in interface are by default, final and static
    /*int age;    
    String name;*/
    // That's why above will throw error.
    int age = 22;
    String name = "Mrunmai";

    void show();
    void config();
}

class B implements A{
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
    
}

public class Interfaces {
    public static void main(String[] args) {
        B obj = new B();
        obj.config();
        obj.show();

        System.out.println(A.age);
        System.out.println(A.name);
    }
}

// If the abstract class have all the abstract methods then create interface.
// All the methods in interface are by default public and abstract.
// Interface is not a class.
// If you failed to implement any of the method in interface the child class also becomes abstract class.
// All the variables declared in interface are by default, final and static
// As variables are static we can access them directly by interface without creating the object.