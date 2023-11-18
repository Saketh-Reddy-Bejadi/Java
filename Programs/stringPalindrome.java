import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str2="";
        String str1=sc.nextLine();
        for(int i=0;i<str1.length();i++){
            str2+=str1.charAt(i);
        }
        if(str2.toLowerCase().equals(str1.toLowerCase())) {
            System.out.println(str1+" is palindrome");
        }else{
            System.out.println(str1+" is not a palindrome");
        }

        sc.close();
    }
}
