public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int i = 0;
        while (n != 0){

            boolean isEven = n % 2 == 0;
            boolean isOdd = n % 2 == 1;

            if (isEven){
                n = n / 2;
            }
            else if (isOdd){
                n = n - 1;
            }

            i++;
        }
        System.out.println(i);
    }
}
