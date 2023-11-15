public class LastFibonacci{
    public static void main(String args[]){
        int n,f0=0,f1=1,f2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of values to get:");
        n= sc.nextInt();
        System.out.print(f0+" "+f1);
        for(int i=2;i<=n;i++) {
            f2=f0+f1;
            f0=f1;
            f1=f2;
        }
        System.out.print(f2);

    }
}