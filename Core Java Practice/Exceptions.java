// class CustomException extends Exception {
//     public CustomException(String str) {
//         super(str);
//     }
// }

class A {
    public void show() throws ClassNotFoundException {
        // Ducking exception with throws keyword.
        /*
         * Letting someone else in the call stack deal with it. Declaring an exception
         * is like saying, “I don't want to catch this exception, because I think
         * someone else can do a better job of handling it (or someone else should be
         * handling it).
         */

        // What if we don't write this try-catch block? - simply write throws keyword
        // and let main() handle it.

        // try {
        Class.forName("Mrunmai"); // this is checked exception - so compulsorily handle it.
        // } catch (ClassNotFoundException e) {
        // System.out.println("Not able to find class " + e);
        // }
    }
}

public class Exceptions {
    static {
        System.out.println("Class Loaded");
    }

    public static void main(String[] args) {

        A obj = new A();
        // now this will give error after writing throws for show(). so surround it with
        // try-catch or write throws also for main().
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // int i = 0;
        // int j = 0;
        // int k = 2;

        // // Single try-catch block
        // try {
        // j = 18 / i;
        // } catch (Exception e) {
        // System.out.println("Cannot divide by zero" + e);
        // }
        // System.out.println(j);

        // // try with multiple catch
        // int nums[] = new int[5];
        // try {
        // j = 5 / i;
        // System.out.println(nums[5]);
        // } catch (ArithmeticException ae) {
        // System.out.println("Cannot divide by zero" + ae);
        // } catch (ArrayIndexOutOfBoundsException aie) {
        // System.out.println("Outside the array" + aie);
        // } catch (Exception e) {
        // System.out.println("To be on safer side catch this exception also at the
        // end." + e);
        // }

        // // exception with throw keyword
        // try {
        // j = 5 / k;
        // if (j == 0) {
        // throw new ArithmeticException("I don't want to print zero");
        // }
        // if (j != 0) {
        // throw new CustomException("Blah Blah Blah...");
        // }
        // } catch (ArithmeticException ae) {
        // j = 5 / 1;
        // System.out.println("That's the default output" + ae);
        // } catch (CustomException ce) {
        // System.out.println("Custom exceptions in java" + ce);
        // } catch (Exception e) {
        // System.out.println("Something went wrong..." + e);
        // }
    }
}

// Adding throws declaration to main() is not recommended because main() will
// pass it to JVM and JVM will directly stop the execution.