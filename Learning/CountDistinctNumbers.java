public class CountDistinctNumbers {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 1) {
                count++;
            }
            n--;
        }

        System.out.println(count);
    }
}
