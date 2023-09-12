class A {
    public void show() {
        System.out.println("in A show()");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show()");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show(); // A show

        obj1 = new B(); // ref of super and object of sub
        obj1.show(); // this will print B show
    }
}

// Even though the ref is of parent class, methods are called of those who are
// referring to that object. This is only possible in case of inheritance. Other
// classes cannot access ref of A class. This is called Dynamic Method Dispatch
// that decides which method to call at runtime.