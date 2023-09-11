class A {
    public A() {
        System.out.println("Object created");
    }

    public void show() {
        System.out.println("in a show()");
    }
}

class AnonymousObj {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();
        new A().show();; // this will just create the object in Heap, nothing will be there in stack,
                 // anonymous object
    }
}

// This type of objects cannot be used again coz they don't have ref 