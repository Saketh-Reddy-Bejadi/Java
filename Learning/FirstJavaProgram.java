//Input/Output, Debugging and Data types

import java.util.Scanner;

public class FirstJavaProgram {
    public static void main(String[] args) {
        // System.out.print("Hello World!");// print is output method used to print values on the console screen in only one line (side by side)[the next statement will print by side of this rather then next line]
        // System.out.println("hello"); //println makes next output to print in the next line rather than side of this statement..
        

        // int a=10;
        // float b=20;
        // double c=30;
        // boolean d=true;
        // char e='J';
        // String f="Java";
        // System.out.println(a+b+c+e+f);
        // System.out.println(d);



        Scanner input=new Scanner(System.in); 
        // input.nextInt();//hello word => hello --which only take the value until the space
        // input.nextLine(); //hello word hi=> hello world hi  --which takes all the input that we give
        // input.nextInt(); //23=> 23 --which only take int values(numbers) of range int data type
        // input.nextFloat(); //23.69=> 23.69f --which only will take input of values of type float and range of float datatype
        // input.nextDouble(); //23.58340=>23.58340 --which take input of double or float datatype but range will be of double
        // input.nextBoolean(); //which will take only boolean values like true or false
        // input.nextLong();//which will take numbers as input of long datatype range.




        
        input.close();//this is not mandatory to close the input but preferred to do
        

//Type conversion and casting
        //Widening conversion =>which will be done automatically by the compiler
        //rules are data types should be compatible and the destination size of the datatype should be greater then source type..

        // int J=20;
        // float A=J;
        // System.out.println(J);
        // System.out.println(A);


        // // int V=A;  //this will throw an error => cannot convert from float to int
        // int V=(int)A;
        // System.out.println(V); //this is narrowing type conversion which should be done manually


    }
}
