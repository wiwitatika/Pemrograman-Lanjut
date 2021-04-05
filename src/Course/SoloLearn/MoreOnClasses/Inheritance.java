package Course.SoloLearn.MoreOnClasses;


class Animal {

    public void makeSound() {

        System.out.println("Hi");

    }

}

class Dog extends Animal {

}

public class Inheritance {

    public static void main(String args[ ]) {

        Dog dog = new Dog();

        dog.makeSound();

    }

}
