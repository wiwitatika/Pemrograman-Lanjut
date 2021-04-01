package Course.SoloLearn.BasicConcept;


import java.util.Scanner;
public class TimeConverterProject {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        //your code goes here
        int hours = days * 24;
        int minutes = hours * 60;
        int resultSeconds = minutes * 60;
        System.out.println(resultSeconds);

    }

}
