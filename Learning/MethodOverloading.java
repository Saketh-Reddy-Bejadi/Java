public class MethodOverloading {
    public static void main(String[] args) {
        //this concept of method overloading will be done in few cases like either no.of arguments or type of arguments should be differ
        func(20, 30);
        func(20, 40, 60);
        func("Java", "Python");

    }
    static void func(int a ,int b){
        System.out.println(a+b);
    }
    static void func(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void func(String a ,String b){
        System.out.println(a+b);        
    }
}
