public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int k = 0;
        //multiples of 5 and 3
        while (i < 1000) {

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                k++;

            } else if (divisibleBy3) {

                k++;

            } else if (divisibleBy5) {

                k++;
            }
            i++;
    }
        System.out.println("multiples of 3 and 5 = " + k);
}}
