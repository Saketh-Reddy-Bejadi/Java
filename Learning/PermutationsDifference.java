public class PermutationsDifference {
    public static void main(String[] args) {
        String s="abc",t="bac";
        int res=0;
        for(int i=0;i<s.length();i++){
            res+=Math.abs(i-t.indexOf(s.charAt(i)));
        }
        System.out.println(res);
    }
}
