class Laptop {
    int price;
    String model;

    // But what if we create own toString() method

    @Override
    public String toString() {
        return "Laptop [price=" + price + ", model=" + model + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

    public boolean equals(Laptop that) {
        /*
         * if(this.model.equals(that.model) && this.price == that.price)
         * return true;
         * return false;
         */
        return this.model.equals(that.model) && this.price == that.price;
    }
}

public class ObjectClassMethods {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 5000;

        System.out.println(obj1); // by-default this calls toString() method of Object class. which prints
                                  // classname@hashcode.
                                  // After method overriding, this will print model:price

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 5000;

        boolean result1 = obj1 == obj2; // false
        boolean result2 = obj1.equals(obj2); // false

        // We want to compare their values so will implement equals() by ourselves.
    }
}
