class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        this();
        System.out.println("in B int");
    }
}

public class superkeyword {
    public static void main(String[] args) {
        // B obj = new B();
        B obj1 = new B(4);
        obj1.hashCode();
    }
}

/*
 * By default, every constructor has super() which calls constructor of super
 * class but if you want to pass a parameter, you have to explicitly call the
 * super() method.
 */
/*
 * By default, every class extends Object class which is not extended by any
 * other class
 */
// this() method will call the default constructor of current class