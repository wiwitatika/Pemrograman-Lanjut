package Course.SoloLearn.ExceptionsListThreadsAndFiles;

public class Threads1 extends Thread {

    public void run() {

        System.out.println("Hello");

    }

    public static void main(String[ ] args) {

        Threads1 object = new Threads1();

        object.start();

    }

}


