package Course.SoloLearn.MoreOnClasses;

public class Interfaces {

    interface Animal {


        public void eat();


    }

    class Cat implements Animal{

        public void eat() {

            System.out.println("Cat eats");

        }

    }

}
