package Course.SoloLearn.MoreOnClasses;

public class AbstractClass {

    abstract class Animal {

        public int age;

        public abstract int printAge();

    }

    class Dog extends Animal {

        public int printAge() {

            return age;

        }

    }

}
