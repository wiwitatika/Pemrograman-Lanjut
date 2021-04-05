package Course.SoloLearn.MoreOnClasses;

public class ComparingObjects {

    private int x;
    public static void main(String[ ] args) {
        ComparingObjects a = new ComparingObjects();
        a.x = 5;
        ComparingObjects b = new ComparingObjects();
        b.x = 5;
        System.out.println(a == b);
    }

}
