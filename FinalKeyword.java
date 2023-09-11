class A{
    public void show() // now i don't want anyone to override my method then make the method 'final'
    {
        System.out.println("By Mrunmai");
    }
}

class B extends A{
    public void show() // now this is method overriding
    {
        System.out.println("By John");
    }
}


final class Calc{
    public void show(){
        System.out.println("in show()");
    }

    public int add(int n1,int n2){
        return n1+n2;
    }
}

/*
 * class AdvCalc extends Calc
 * {
 * 
   }
 */
// This will throw error because final will stop the Calc class from extending 
public class FinalKeyword {
    public static void main(String[] args) {
        final int num = 6;
        // num = 9;  this will throw error.
        System.out.println(num);

        Calc obj = new Calc();
        obj.add(1, 3);
    }
}

// final variable = to make it constant  
// final method = to stop it from getting overridden
// final class = to stop it from getting extended