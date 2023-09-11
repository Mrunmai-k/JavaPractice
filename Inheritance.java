class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calc {
    public int mult(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class VeryAdvCalc extends AdvCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(5, 6); // 11
        int r2 = obj.sub(9, 4); // 5

        AdvCalc obj1 = new AdvCalc();
        System.out.println(obj1.add(r1, r2)); // 16
        System.out.println(obj1.sub(9, 4));
        System.out.println(obj1.div(10, 5)); // 2
        System.out.println(obj1.mult(3, 4));

        VeryAdvCalc obj2 = new VeryAdvCalc();
        System.out.println(obj2.add(r1, r2)); // 16
        System.out.println(obj2.sub(9, 4));
        System.out.println(obj2.div(10, 5)); // 2
        System.out.println(obj2.mult(3, 4));

        System.out.println(obj2.power(2, 5));

    }
}

// Calc -> AdvCalc This is called single level inheritance
// Calc -> AdvCalc -> VeryAdvCalc This is called multilevel inheritance
/*
 * Multiple inheritance in java does not work, because it creates ambiguity
 * problems i.e. what to do if you are trying to call a method which is in both
 * of your parent class. It may create conflict.
 */