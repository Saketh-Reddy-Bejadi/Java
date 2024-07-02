import java.util.Scanner;

public interface Methods {
    public static void main(String[] args) {

        // sum();

        // int ans=sum2();  
        // System.out.println("int: "+ans);

        // sum3(23, 32);

        int res=sum4(20, 40);
        System.out.println(res);
    }
    static void sum(){      //void [without return type, without parameters]
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("void: "+a+b);
        
        sc.close();
    }
    
    static int sum2() {    //int [with return type, without parameters]
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        return a+b;
        
    }
    
    static void sum3(int a,int b){  //void [without return type, with parameters]
        System.out.println(a+b);  
    }

    static int sum4(int x,int y){ // int [with return type, with parameters]
        return x+y;
    }
}
