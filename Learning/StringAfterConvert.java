public class StringAfterConvert {
    public static void main(String[] args) {
        String s="leetcode";
        int k=2;
        int r=0;
        for (char c :s.toCharArray()) {
            if(Character.isLetter(c)){
                int n=(Character.toUpperCase(c)-'A'+1)*10;
                r=r*10+n;
            }
        }
        int i=0;
        while(i<k){
            int t=r,su=0;
            while(t>0){
                su+=t%10;
                t/=10;
            }
            r=su;
            i++;
        }
        System.out.println(r);
        1945
        2520
        2457
    }
}
