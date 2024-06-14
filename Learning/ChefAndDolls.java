import java.util.*;

public class ChefAndDolls {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int f = 0;
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            Arrays.sort(num);
            for (int i = 0; i < n - 1; i = i + 2) {
                if (num[i] != num[i + 1]) {
                    f = 1;
                    System.out.println(num[i]);
                    break;
                }
            }
            if (f == 0)
                System.out.println(num[n - 1]);
        }
        sc.close();
    }
}