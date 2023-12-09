
public class problem {
    public static int findMissingElement(int[] array) {
        int n = array.length+1;
        int sum=0,actualSum=(n*(n+1))/2;
        for (int i=0;i<n-1;i++) {
            sum+=array[i];
        }
        return actualSum-sum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,5};
        int missingElement = findMissingElement(array);

        System.out.println("Missing Element: " + missingElement);
    }
}
