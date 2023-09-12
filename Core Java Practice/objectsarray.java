class Student{
    int rno;
    String name;
    int marks;
}

public class objectsarray {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.rno=1;
        s1.name="Mrunmai";
        s1.marks=88;

        Student s2= new Student();
        s2.rno=2;
        s2.name="Sangram";
        s2.marks=50;

        Student s3= new Student();
        s3.rno=3;
        s3.name="Bhagyashri";
        s3.marks=67;

        // System.out.println(s1); //This will give garbage value 

        Student students[] = new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for (int i = 0; i < students.length; i++) {
        //     System.out.println(students[i].name +" : "+ students[i].marks);
        // }

        // Better way of using for loop in this case
        for (Student stud : students) {
            System.out.println(stud.name + " : "+stud.marks);
        }
    }
}
