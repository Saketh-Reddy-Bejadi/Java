// public class BInaryGap {
//     public static void main(String[] args) {
//         int n = 22;
//         String b=Integer.toBinaryString(n);
//         System.out.println(b);
//         boolean flag=false;
//         int c=0;
//         int ans=0;
//         for(int i=0; i<b.length(); i++) {
//             if(flag && b.charAt(i)!='1'){
//                 c+=1;
//             }
//             ans=Math.max(ans, c);
//             if(b.charAt(i)=='1'){
//                 flag=true;
//                 c=0;
//             }
//         }
//         if(ans!=0){
//             ans+=1;
//         }
//         System.out.println(ans);
//     }
// }

public class BInaryGap {
    public static int valid(int n){
        String b = Integer.toBinaryString(n);
        int prevPosition = -1;
        int maxDis = 0;
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '1') {
                if (prevPosition != -1) {
                    int dis = i - prevPosition;
                    maxDis = Math.max(maxDis, dis);
                }
                prevPosition = i;
            }
        }
        return maxDis;   
    }
    public static void main(String[] args) {
        int n = 22;
        System.out.println(valid(n));
    }
}
