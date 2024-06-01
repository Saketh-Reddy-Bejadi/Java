public class ChangingKeys {
    public static void main(String[] args) {
        String s="aAbBcC";
        s=s.toLowerCase();
        int count=0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)!=s.charAt(i+1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
