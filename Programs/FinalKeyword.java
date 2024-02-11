class Final{
    final int age=24;
    final static void add(){
        System.out.println("adding");
    }

}
public class FinalKeyword extends Final {
    // public static void add(){
    //     System.out.println("not adding");
    // }
    public static void main(String[] args) {
        // Final f=new Final();
        // f.age=20;
        add();
    }
}


