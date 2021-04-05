package Course.SoloLearn.ExceptionsListThreadsAndFiles;

class B implements Runnable {
    public void run() {
        System.out.println("B");
    }
}

public class Module6Quiz3 extends Thread {
    public void run() {
        System.out.println("A");
        Thread t = new Thread(new B());
        t.start();
    }
    public static void main(String[ ] args) {
        Module6Quiz3 object = new Module6Quiz3();
        object.start();
    }
}
