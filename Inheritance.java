class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return n1-n2;
    }
}

class AdvCalc extends Calc{
    public int mult(int n1,int n2){
        return n1*n2;
    }

    public int div(int n1,int n2){
        return n1/n2;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(5, 6); //11
        int r2 = obj.sub(9, 4); //5

        AdvCalc obj1 = new AdvCalc();
        System.out.println(obj1.add(r1, r2));  // 16 
        System.out.println(obj1.div(10, 5));    //2

    }
}
