class A{
    public void show(){
        System.out.println("in A show");
    }

    public void config(){
        System.out.println("in A config");
    }
}

class B extends A{
    public void show() // the same name as Parent class
    {
        System.out.println("in B show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show(); 
        obj.config();
    }
}

/*
 * In method overriding, method name and same parameter should be same as in the parent class
 * There is change in method implementation.
 * It is used for runtime polymorphism
 */