import java.util.Scanner;

public class Osumania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int t = sc.nextInt();        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] col = new int[n];            
            for (int j = 0; j < n; j++) {
                String row = sc.nextLine();
                col[j] = row.indexOf('#') + 1;
            }
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(col[j] + " ");
            }
            System.out.println();
        }        
        sc.close();
    }
}
