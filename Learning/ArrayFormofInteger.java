import java.util.ArrayList;
import java.util.Collections;

public class ArrayFormofInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        String s="";
        for (int i : num) {
            s+=i;
        }
        k=k+Integer.parseInt(s);
        ArrayList<Integer> list=new ArrayList<>();
        while (k>0) {
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}
