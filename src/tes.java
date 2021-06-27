import java.util.Random;

public class tes {

    public static void main(String[] args) {

        /**Random angkaRandom = new Random();
        int random;

        // Melakukan looping
        for ( int i = 1; i <= 100; i++ ){

            //Mengambil angka acak dari 1 - 9
            random = 1 + angkaRandom.nextInt( 99 );
            System.out.println(random);
        }**/
        int[] deretArray = new int[9];

        for (int i = 0; i < deretArray.length; i++) {

            deretArray[i] = (int) (Math.random() * 100);

            System.out.print(deretArray[i]);

        }

    }
}
