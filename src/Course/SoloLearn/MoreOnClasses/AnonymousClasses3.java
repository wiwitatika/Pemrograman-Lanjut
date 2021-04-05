package Course.SoloLearn.MoreOnClasses;

public class AnonymousClasses3 {

    public static void main(String[] args) {
        AnonymousClasses2 object = new AnonymousClasses2() {

            @Override
            public void print() {
                System.out.println("Hello");

            }

        };

        object.print();
    }

}
