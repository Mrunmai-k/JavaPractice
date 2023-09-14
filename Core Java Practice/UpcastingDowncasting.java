class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        A obj = new A();
        obj.show1();

        A obj1 = (A) new B(); // upcasting implicitly no need to write explicitly (A)
        //obj1.show2(); // even though the obj1 is of B we cannot call show2() because ref is of A and A
                      // has not idea about B

        B obj2 = (B) obj1;  // whenever you assign it make it of type B. This is downcasting.
        obj2.show2();

    }
}
