public class ChangingPrimitives {
    public static void main(String[] args) {
        // passing primitive will not change the values of it
        //because the parameters will not point towards value of the arguments [the new variable will be created with same values]

        int a = 20,b=30;
        // swap(a,b);
        System.out.println(a+", "+b);
        int res[]=swap1(a, b);
        System.out.print(res[0]+", "+res[1]);

    }

    static void swap(int a, int b) {
        int t=a;
        a=b;
        b=t;        
    }
    //until unless you return values this gonna not change

    static int[] swap1(int a,int b){ 
        int t=a;
        a=b;
        b=t;
        int ar[]={a,b};
        return ar;
    }
}
