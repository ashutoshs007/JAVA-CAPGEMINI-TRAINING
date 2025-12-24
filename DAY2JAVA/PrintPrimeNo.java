// WAJP to print prime no from the range 20 to 1.
public class PrintPrimeNo {
    public static void main(String[] args) {

        int count = 0;

        for (int n = 20; n >= 1; n--) {

            count = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(n);
            }
        }
    }
}








        