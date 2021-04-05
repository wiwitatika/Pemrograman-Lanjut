package Course.SoloLearn.ExceptionsListThreadsAndFiles;

import java.io.File;
import java.util.Scanner;

public class ReadingAFile {

    public static void main(String[] args) {

        try {

            File f = new File("E:\\text.txt");
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {

                String a = sc.next();
                String b = sc.next();
                System.out.println(a + " " + b);

            }

            sc.close();

        }

        catch (Exception e) {

            System.out.println("Error");

        }

    }

}
