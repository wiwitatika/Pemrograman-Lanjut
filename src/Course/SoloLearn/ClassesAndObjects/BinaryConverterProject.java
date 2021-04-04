package Course.SoloLearn.ClassesAndObjects;

import java.util.Scanner;
class Converter {

    public static String toBinary(int num) {

        String binary = "";

        while(num > 0) {

            binary = (num % 2) + binary;
            num /= 2;

        }

        return binary;

    }

}

public class BinaryConverterProject {

    public static void main(String[ ] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.print(Converter.toBinary(num));

    }

}
