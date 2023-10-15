public class Overloading_Demo {
    void display() {
        System.out.println("Display method with no parameters");
    }
    void display(int num) {
        System.out.println("Display method with one integer parameter: " + num);
    }
    void display(String str1, String str2) {
        System.out.println("Display method with two string parameters: " + str1 + " and " + str2);
    }
    public static void main(String[] args) {
        Overloading_Demo obj = new Overloading_Demo();
        obj.display();
        obj.display(42);
        obj.display("Hello", "World");
    }
}
