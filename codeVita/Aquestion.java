import java.util.*;
public class Aquestion {
    public static boolean isPrime(long number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;
        for (long i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }
    public static long findSmallestPrime(int[] set) {
        int q = set[0];
        if (q % 2 == 0) {
            return -1; 
        }
        for (long prime = q; prime < 10000000000L; prime += q) {
            if (isPrime(prime)) {
                boolean satisfiesConditions = true;
                for (int i = 1; i < set.length; i++) {
                    if (prime % set[i] != q) {
                        satisfiesConditions = false;
                        break;
                    }
                }
                if (satisfiesConditions) {
                    return prime;
                }
            }
        }
        return -1; 
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        if (1 < n && n < 10) {
            int[] set = new int[n + 1];
            System.out.print("Enter elements: ");
            for (int i = 0; i <= n; i++) {
                set[i] = input.nextInt();
            }
            Arrays.sort(set);
            long result = findSmallestPrime(set);
            if (result == -1) {
                System.out.println("None");
            } else {
                System.out.println(result);
            }
        }
        input.close();
    }
}
