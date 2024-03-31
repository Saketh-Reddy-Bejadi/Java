public class a2739 {
    public static int distanceTraveled(int mainTank, int additionalTank) {
        int r=0;
        while(true){
            if (mainTank>=5 && additionalTank>=1){
                mainTank-=4;
                additionalTank-=1;
                r+=50;
            }
            else{
                r+=mainTank*10;
                return r;
            }
        }
    }    
    public static void main(String[] args) {
        int mainTank=5;
        int additionalTank=10;
        System.out.println(distanceTraveled(mainTank,additionalTank));
    }
}
