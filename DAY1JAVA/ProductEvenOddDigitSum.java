import java.util.Scanner;

public class ProductEvenOddDigitSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (n > 0) {
            int d = n % 10;

            if (d % 2 == 0)
                evenSum += d;
            else
                oddSum += d;

            n = n / 10;
        }

        int product = evenSum * oddSum;
        System.out.println(product);

        sc.close();
    }
}

    

