package Course.SoloLearn.ExceptionsListThreadsAndFiles;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class SortingLists2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(2);
        list.add(1);

        Collections.sort(list);

        System.out.println(list.get(1));

    }

}
