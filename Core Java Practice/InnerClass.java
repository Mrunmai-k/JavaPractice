class AInner {
    int age;

    public void show() {
        System.out.println("in A show()");
    }

    static class BInner {
        public void config() {
            System.out.println("in B config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        AInner obj = new AInner();
        obj.show();

        // BInner obj1 = new BInner(); // this gives error coz B belongs to A, cannot
        // directly access it.

        // AInner.BInner obj1 = new AInner().BInner(); // This will also give error
        // considering BInner() as method.

        // We need obj to access age or show() method, in the same way we need obj to
        // access B class because it is inside the A class

        // for non-static inner class
        /*
         * AInner.BInner obj1 = obj.new BInner();
         * obj1.config();
         */

        // What if the inner class is static, then we don't create obj of static
        AInner.BInner obj2 = new AInner.BInner();
        obj2.config();
    }
}

// Only inner classes can be static.