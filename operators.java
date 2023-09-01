public class operators {
    public static void main(String[] args) {
        int num1 = 26;
        int num2 = 13;

        // Arithmetic operator
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int division = num1 / num2;
        int multiplication = num1 * num2;
        int remainder = num1 % num2;

        System.out.println(addition);

        // Unary operator
        num1 = -num1; // unary minus

        System.out.println((num1 < num2)); // -26 < 13 is true
        System.out.println(!(num1 < num2)); // ! is NOT operator

        num1++; // post-increment
        ++num2; // pre-increment

        num1--; // post-decrement
        --num2; // pre-decrement

        System.out.println(num2);
        System.out.println(~num2); // bitwise complement

        // Assignment operator
        int a = 10;
        a += 15;
        System.out.println("a= " + a);
        a -= 3;
        System.out.println(a);
        a *= 4;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 5;
        System.out.println(a);

        // Relational operator
        System.out.println(num1 == num2); // equal to
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        // Logical operator
        int x = 10;
        int y = 20;
        int z = 30;
        int w = 40;

        boolean result = x < y && z < w;
        System.out.println(result);

        result = x > y || z < w;
        System.out.println(result);

        System.out.println(!result);

        // Ternary operator
        int res = (num1>num2) ? (num1-num2) : (num1+num2);
        System.out.println(res);
    }
}