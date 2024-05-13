import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {
        func(2,3,4,5,6); //can pass n no.of arguments of same data type
        multiple(10, 20, 30,40,50,60,70,80,90);
    }
    static void func(int ...v){  //also should be passed at last only [not in the middle or first] (because compiler will not be able to recognize which is the last element of VarArgs)
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, int ...v){
        System.out.println(a+", "+b+", "+Arrays.toString(v));
    }
}
