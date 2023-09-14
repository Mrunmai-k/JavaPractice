public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        //Integer num1 = new Integer(num); // boxing
        Integer num2 = num;             // autoboxing - implicitly does the boxing

        int num3 = num2.intValue();
        int num4 = num2;                //auto-unboxing

        //System.out.println(num1);       //unboxing  - getting value from obj type to primitive type
        System.out.println(num3);  //7

        String str = "12";  //num stored in str format , we cannot perform arithmetic operations
        int no = Integer.parseInt(str);
        System.out.println(str);
        System.out.println(no);
        System.out.println(num4);
    }
}

// Boxing - store primitive type in the object
// Unboxing - take out the primitive value from the object.