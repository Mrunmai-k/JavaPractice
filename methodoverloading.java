class Calculator {
    int num = 5; // instance variable of class Calculator

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public String add(String n1, String n2) {
        return "";
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        int data = 10;  //instance variable of class methodoverloading

        Calculator obj1 = new Calculator();
        int result = obj1.add(10, 20);
        System.out.println(result);

        System.out.println(data);
        System.out.println(obj1.num);   
    }
}

// Every method has its own stack
// Heap is used to store the objects
// Compile time polymorphism
