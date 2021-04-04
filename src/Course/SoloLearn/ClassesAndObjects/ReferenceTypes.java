package Course.SoloLearn.ClassesAndObjects;

public class ReferenceTypes {

    public static void main(String[ ] args) {

        Person p = new Person();
        p.setAge(25);
        change(p);
        System.out.println(p.getAge());

    }
    static void change(ReferenceTypes p) {

        p.setAge(10);

    }

}
