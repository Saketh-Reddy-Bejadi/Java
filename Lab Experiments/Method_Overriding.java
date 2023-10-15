class Human {
    void eat() {
        System.out.println("Human is eating");
    }
}
class Method_Overriding extends Human {
    @Override
    void eat() {
        System.out.println("Boy is eating");
    }
    public static void main(String[] args) {
        Method_Overriding obj1 = new Method_Overriding();
        obj1.eat();
    }
}

