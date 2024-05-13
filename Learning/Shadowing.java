public class Shadowing {
    static int x=20;  // this is accessible all over the class
    public static void main(String[] args) {
        System.out.println(x); 
        int x=40;  // this is accessible all the main method and shadowed the variable [x=20]
        System.out.println(x);        
        func();
    }
    static void func(){
        System.out.println(x); //here is not value of x in this block so it takes the value [x=20]
    }
}
