abstract class InnerAbstraction {
    abstract void sum();
    public static void sum1() {
        System.out.println("Adding");
    }

}
class Ab extends InnerAbstraction{
    void sum() {
        System.out.println("adding");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        InnerAbstraction m=new Ab();
        m.sum();
    }
}
