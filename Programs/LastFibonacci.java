import java.util.Scanner;
public class LastFibonacci{
    public static void main(String args[]){
        int n,f0=0,f1=1,f2=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of values to get:");
        n= sc.nextInt();
<<<<<<< HEAD
=======
       // System.out.print(f0+"\n"+f1);
>>>>>>> c1881d9ea660e4757faa544ab9d1e6db45f75b57
        for(int i=2;i<=n;i++) {
            f2=f0+f1;
            f0=f1;
            f1=f2;
        }
        System.out.print(f2);
<<<<<<< HEAD

        sc.close();
=======
sc.close();
>>>>>>> c1881d9ea660e4757faa544ab9d1e6db45f75b57
    }
}