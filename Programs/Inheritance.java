class Shape {
    String color;
    
    public void print(String c){
        System.out.println(c);
    }
 
}

class Triangle extends Shape {

}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color="red";
        t1.print(t1.color);
    }
}
