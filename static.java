class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    // Static block is used to initialize the static variables
    static {
        name = "Phone";
    }

    public Mobile() {
        brand = "";
        price = 200;
        // name = "Phone"; // this will initialize the name every time the object is
        // created, which is unnecessary. And that is why we need static block
    }

    public void show() {
        System.out.println(brand + " " + name + " " + price);
    }

    // public static void show1(Mobile obj) // we cannot directly use non-static
    // variable in static method, instead we can
    // // pass the object to the static method
    // {
    // System.out.println(obj.brand + " " + name + " " + obj.price);
    // }
}

class statickeyword {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 100000;
        // Mobile.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 20534;

        // obj1.show();
        // obj2.show();

        // Mobile.show1(obj1);
        // Now i want name to be same for all objects , that's when we use static
        // keyword
        // They are called with class name
        // non-static method can access static instance variables
        // main() is static
        /*
         * static block is called only once because class loads only once plus it will
         * // get called before creating the objects which means before calling the
         * constructor
         */
        /*
         * What if we don't create the object, then it will not call constructor but it
         * will also not call static block. This will not load the class as well, so to
         * do this we use class 'Class'. This is normally used with JDBC
         */
    }
}
