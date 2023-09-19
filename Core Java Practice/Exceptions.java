public class Exceptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 2;

        // Single try-catch block
        try {
            j = 18 / i;
        } catch (Exception e) {
            System.out.println("Cannot divide by zero" + e);
        }
        System.out.println(j);

        // try with multiple catch
        int nums[] = new int[5];
        try {
            j = 5 / i;
            System.out.println(nums[5]);
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero" + ae);
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Outside the array" + aie);
        } catch (Exception e) {
            System.out.println("To be on safer side catch this exception also at the end." + e);
        }

        // exception with throw keyword
        try {
            j = 5 / k;
            if (j==0) {
                throw new ArithmeticException("I don't want to print zero");
            }
        } catch (ArithmeticException ae) {
            j = 5 / 1;
            System.out.println("That's the default output");
        } catch (Exception e) {
            System.out.println("Something went wrong...");
        }
    }
}
