interface Mom {
    void mom();
}
interface Dad {
    void dad();
}
class Parents implements Mom, Dad {
    public void mom() {
        System.out.println("With mom");
    }

    public void dad() {
        System.out.println("with dad");

    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Parents p = new Parents();
        p.dad();
        p.mom();
    }
}

// class Mom{
// public void mom(){
// System.out.println("mom");
// }
// }
// class Dad{
// public void dad() {
// System.out.println("dad");
// }
// }
// class Parent extends Mom {

// }

// public class MultipleInheritance {
// public static void main(String[] args) {
// Parent p=new Parent();
// // p.dad();
// p.mom();

// }
// }