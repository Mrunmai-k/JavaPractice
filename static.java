class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    public void show() {
        System.out.println(brand + " " + name + " " + price);
    }

    public static void show1(Mobile obj) // we cannot directly use non-static variable in static method, instead we can
                                         // pass the object to the static method
    {
        System.out.println(obj.brand + " " + name + " " + obj.price);
    }
}

class statickeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 100000;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 20534;

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
        // Now i want name to be same for all objects , that's when we use static
        // keyword
        // There are called with class name
        // non-static method can access static instance variables

    }
}
