import java.util.*;

public class QuestionA {
    public static void prime(int n) {
        Scanner in=new Scanner(System.in);
        int[] set=new int[n+1];
        System.out.print("Enter elemetns:");
        for(int i=0;i<=n;i++) {
            set[i]=in.nextInt();
        }
        Arrays.sort(set);
        int q=set[0];
        boolean value=true;
        int prime=22;
        while(value==true) {
            if (prime <= 1) {
                System.out.println(prime + " is not a prime number.");
            } else if (prime <= 3) {
                System.out.println(prime + " is a prime prime.");
            } else if (prime % 2 == 0 || prime % 3 == 0) {
                System.out.println(prime + " is not a prime number.");
            } else {
                boolean isPrime = true;
                int i = 5;
                while (i * i <= prime) {
                    if (prime % i == 0 || prime % (i + 2) == 0) {
                        isPrime = false;
                        break;
                    }
                    i += 6;
                }
    
                if (isPrime) {
                    for(int j=0;j<=n;j++) {
                        if(prime%set[i]==q){
                            System.out.println(prime);
                        }
                    }
                } 
            }
        }
        in.close();
    }
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=input.nextInt();
        if(1<n && n<10) {
            prime(n);
        }

        input.close();
    }
}
