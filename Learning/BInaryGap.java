public class BInaryGap {
    public static void main(String[] args) {
        int n = 22;
        String b=Integer.toBinaryString(n);
        System.out.println(b);
        boolean flag=false;
        int c=0;
        int ans=0;
        for(int i=0; i<b.length(); i++) {
            if(flag && b.charAt(i)!='1'){
                c+=1;
            }
            ans=Math.max(ans, c);
            if(b.charAt(i)=='1'){
                flag=true;
                c=0;
            }
        }
        if(ans!=0){
            ans+=1;
        }
        System.out.println(ans);
    }
}
