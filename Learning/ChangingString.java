public class ChangingString {
    public static void main(String[] args) {
        //the value of string will not be changes even if it is a non primitive and passed as value as reference variable because of when use assign or try to change the value a new value will be assigned but that will not the the final variable...

        String name="Java";
        // change(name);
        change1(name);
        System.out.println(name);
    }

    static void change(String name) {
        name ="Python";    //here comes the concept scoping [the value of name will be accessible for only this function only, cannot be accessible out this block]
    }

    static String change1(String nam){      //in anyway the value of String is once defined then it will not be changed
        nam="Python";   
        return nam;
    }


}
