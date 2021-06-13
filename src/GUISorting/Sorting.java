package GUISorting;

public class Sorting {

    public static int[] getAsc(String[] text, int amount){
        int num, i, j, temp;
        num = amount;
        int array[] = new int[num];
        String[] stmp = text;
        int x = 0;
        for (String s : stmp){
            array[x] = Integer.parseInt(s.trim());
            x++;
        }
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] getDesc(String[] text, int amount){
        int num, i, j, temp;
        num = amount;
        int array[] = new int[num];
        String[] stmp = text;
        int x = 0;
        for (String s : stmp){
            array[x] = Integer.parseInt(s.trim());
            x++;
        }
        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < num - i - 1; j++) {
                if (array[j] < array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
