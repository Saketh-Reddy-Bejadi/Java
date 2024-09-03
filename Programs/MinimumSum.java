import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumSum {
    static int Valid(int n){
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(n>0){
            list.add(n%10);
            n=n/10;
        }
        Collections.sort(list);
        System.out.println(list);
        int num1=0,num2=0;
        for(int i=0;i<list.size();i++){
            if(i%2==0){
                num1*=10;
                num1+=list.get(i);
            }
            else{
                num2*=10;
                num2+=list.get(i);
            }
        }
        return (num1+num2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Valid(n));
        sc.close();
    }
}
