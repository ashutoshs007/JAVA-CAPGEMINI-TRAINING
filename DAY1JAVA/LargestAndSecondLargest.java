import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = -1;
        int smax = -1;

        while (n > 0) {
            int d = n % 10;

            if (d > max) {
                smax = max;
                max = d;
            }
            else if (d > smax && d != max) {
                smax = d;
            }

            n = n / 10;
        }

        System.out.println(max);
        System.out.println(smax);

        sc.close();
    }
}
