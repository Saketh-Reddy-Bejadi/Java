
public class AverageSalary {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i=0; i<salary.length; i++) {
            sum+=salary[i];
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
        }
        double avg=((double)(sum-min-max))/(salary.length-2);
        System.out.println(avg);
    }
}