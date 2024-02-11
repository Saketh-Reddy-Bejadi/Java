class Student{
    String name;
    int age;

    public void info(String name,int age) {
        System.out.println(name+" "+age);
    }
    public void info(String name) {
        System.out.println(name);
    }
    public void info(int age) {
        System.out.println(age);
    }
    public void info() {
        System.out.println("no details of student are recorded");
    }
}


public class Polymorphism1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="saketh";
        s1.age=23;
        s1.info();
    }
}
