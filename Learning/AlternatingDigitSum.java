public class AlternatingDigitSum {
    public static void main(String[] args) {
        int n = 111;
        String num = String.valueOf(n);
        int s=0;
        for (int i = 0; i < num.length(); i++) {
            char c=num.charAt(i);
            int e =Integer.parseInt(String.valueOf(c));
            if (i%2!=0){
                e=-e;
            }
            s+=e;
        }
        System.out.println(s);

    }
}
