class typecasting {
    public static void main(String[] args) {
        int a = 257;
        byte b = 123;
        int c = 5;

        System.out.println("Before");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        // b=a; This will give error because byte < int so there will be some data loss

        // but if we change the value of a in the range of byte then, there will be no
        // issue of losing the data

        // Type Casting
        b = (byte) c;

        // In the case of float and double
        float f = 5.6f;
        int x = (int) f;
        System.out.println(x); // x is integer so it will accept only 5 not .6

        int k = 257;
        byte b1 = (byte) k;
        System.out.println(b1); // in this case, modulo operator is used 257 % 256 = 1 (remainder)

        // Type Conversion
        a = b;

        System.out.println("After");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("c= " + c);

        // Type promotion
        byte m = 10;
        byte n = 20;

        /*
         * byte * byte shoulb be byte but the answer goes out of the range so it will
         * automatically converted to its upper data type i.e. int
         */
        int result = m * n;
        System.out.println(result);

    }
}
