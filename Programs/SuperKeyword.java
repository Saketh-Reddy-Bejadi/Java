class Parent{
    public int age=20;
    Parent() {
        System.out.println("Parent");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        // Child c=new Child();

    }
}
