public class SpecialNoRange {

    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {
            int temp = num;
            int sum = 0;
            int product = 1;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp /= 10;
            }

            if (sum + product == num) {
                System.out.println(num);
            }
        }
    }
}
