package Course.SoloLearn.ExceptionsListThreadsAndFiles;


class A implements Runnable{

    public void run() {

        System.out.println("Bye");

    }

}
public class Threads2 {

    public static void main(String[ ] args) {

        Thread ob = new Thread(new A());

        ob.start();
    }

}
