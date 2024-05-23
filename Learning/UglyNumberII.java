public class UglyNumberII {
    public static void main(String[] args) {
        int n=10;
        int[] r=new int[1690];
        r[0]=1;
        int x=0,y=0,z=0;
        for (int i = 1; i < 1690; i++) {
            r[i]=Math.min(r[x]*2,Math.min(r[y]*3, r[z]*5));
            if(r[i]==r[x]*2){
                x++;
            }
            if(r[i]==r[y]*3){
                y++;
            }
            if(r[i]==r[z]*5){
                z++;
            }
        }
        System.out.println(r[n-1]);
    }
}
