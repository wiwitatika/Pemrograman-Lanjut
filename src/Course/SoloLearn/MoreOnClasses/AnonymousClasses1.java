package Course.SoloLearn.MoreOnClasses;

public class AnonymousClasses1 {

    public void start() {
        System.out.println("Start");
    }

    public static void main(String[] args) {

        AnonymousClasses1 m = new AnonymousClasses1() {
            @Override public void start() {

                System.out.println("Hi");

            }

        };
        m.start();

    }

}
