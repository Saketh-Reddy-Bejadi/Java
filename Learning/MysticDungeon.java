public class MysticDungeon {
    public static void main(String[] args) {
        int[] energy={-1,-2,-8,6,-6,-6,-6,5,5};
        int k=8,r=-1;
        for (int i = energy.length-k; i < energy.length; ++i) {
                for (int j = i,t=0; j >=0; j-=k) {
                    t+=energy[j];
                    r=Math.max(r, t);   
                }                
        }
        System.out.println(r);
    }
}