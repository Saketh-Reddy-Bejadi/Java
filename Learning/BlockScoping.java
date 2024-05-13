public class BlockScoping {
    public static void main(String[] args) {  
        //block scoping --> value declared in the method cannot be declared again in the block of same method..
        //also the variables declared in the block will only accessible in the block it self not out of the block.....
        //can change the value of initialized variable in the same method from block....
        int a=20,b=30; 
        {
            a=30;
        }
        System.out.println(a+", "+b);
    }
}
