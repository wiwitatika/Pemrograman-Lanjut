package Course.SoloLearn.ExceptionsListThreadsAndFiles;

import java.util.ArrayList;
import java.util.Collections;
public class SortingLists1 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("b");
        list.add("a");
        list.add("c");
        Collections.sort(list);
        System.out.println(list.get(0));

    }

}
