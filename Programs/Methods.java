// //Instance Method
// class Sum{
// public void add(int a,int b) {
// System.out.println(a+b);
// }
// }

// public class Methods {
// public static void main(String[] args) {
// Sum s=new Sum();
// s.add(2, 3);
// }
// }

// //Static Method
// class Sum{
// public static void sum(int a, int b) {
// System.out.println(a+b);
// }
// }
// public class Methods {
// public static void main(String[] args) {
// Sum.sum(2,10);
// }
// }

//Abstract Method
abstract class Sum {
    abstract void sum();
}
class Method extends Sum{
    void sum() {
        System.out.println("abstract method");
    }
}
public class Methods {    
    public static void main(String[] args) {
        Sum m=new Method();
        m.sum();
    }
}