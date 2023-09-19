import java.io.*;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter a number:");

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int num1 = Integer.parseInt(br.readLine());
            System.out.println(num1);
        }

        finally {
            br.close();
        }

        System.out.println("Enter a string: ");
        Scanner sc = null;
        
        try {
            sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(str);
        }

        finally {
            sc.close();
        }

    }
}

// println() is the method of PrintStream class so to use it we need to create
// object of PrintStream class.
// But Java has already created a object named 'out' of PrintStream class in the
// System class. = out.println()
// As 'out' is static we need to call it using System class. = System.out