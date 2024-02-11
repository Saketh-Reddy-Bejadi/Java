// class Pen {
//     String color;
//     String style;

//     public void info() {
//         System.out.println(color);
//         System.out.println(style);
//     }

//     public void write(){
//         System.out.println("Writing");
//     }

// }

// public class ClassObject {
//     public static void main(String[] args) {
//         Pen pen1=new Pen();
//         pen1.write();
//         pen1.style="ballpen";
//         pen1.color="blue";
//         pen1.info();

//         Pen pen2=new Pen();
//         pen2.write();
//         pen2.style="gel";
//         pen2.color="black";
//         pen2.info();
//     }
// }


class Student{
    String name;
    int age;

    public void studentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student() {
        System.out.println("Constructor");
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=20;
        s1.name="saketh";
        s1.studentInfo();
        
    }
}