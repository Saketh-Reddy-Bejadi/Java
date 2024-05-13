public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        System.out.println(armstrong(n)); //prints true if armstrong else false

        //prints all 3 digits armstrong numbers
        for(int i=100;i<1000;i++){
            if (armstrong(i)==true){
                System.out.print(i+" ");
            }
        }


    }

    //this is logic for 3 digit armstrong numbers
    static boolean armstrong(int n){
        int t=n;
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d*d*d;
            n/=10;
        }
        return s==t;
    }
}
