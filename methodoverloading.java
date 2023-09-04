class Calculator {
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
        Calculator obj = new Calculator();
        int result = obj.add(10, 20);
        System.out.println(result);
    }
}
