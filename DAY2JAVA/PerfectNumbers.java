// WAJP TO PRINT ALL PERFECT NO B/W 1 TO 100



public class PerfectNumbers {
    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {

            int sum = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}




        

       


