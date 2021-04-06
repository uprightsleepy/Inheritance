package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(1,1,5,6,"Animal");

        Dog dog = new Dog(8,85,"Nemo",2,1,20,"Long silky");
        dog.eat();
//        dog.walk();
        dog.run();
    }
}
