class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {


        Animal myAnimal = new Dog();
        myAnimal.sound(); // Calls the overridden sound() method in Dog class

        myAnimal = new Cat();
        myAnimal.sound(); // Calls the overridden sound() method in Cat class
    }
}