class Human {
    private int age;
    private String name;

    public Human()  //default constuctor
    { 
        age = 22;
        name = "Mrunmai";
    }

    public Human(int age, String name)  //parameterized
    {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge());

        Human obj1 = new Human(18,"Momo");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        // obj.age = 22;
        // obj.name = "Mrunmai";
        // obj.setAge(22);
        // obj.setName("Mrunmai");

        // System.out.println(obj.age);

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

// this is a keyword to represent the current object , i.e., the object which is calling the method
// constructor's name is same as class name , special method has no return type , 