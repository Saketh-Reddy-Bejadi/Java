public class Scoping {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+", "+b);
        // System.out.println(j); //this line throws an error as j is not defined
    }
    static void swap(int x, int y){  //the value of a will not be changed to 80 and also the variable x will only accessible in between this particular block or method only...
        x=80;
        int j=50;
        System.out.println(j);
    }

    //if you return the value then that gonna change the value of a
    //even though the variable j also cannot be accessible out of this method...
}
