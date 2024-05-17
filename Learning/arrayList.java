import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());// add elements to the list
        }
        System.out.println(list.size());// returns the length of list
        System.out.println(list);

        input.close();
    }
}
