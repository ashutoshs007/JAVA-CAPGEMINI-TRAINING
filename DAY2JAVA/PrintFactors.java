// WAP to print factors of a given number

// use for loop then 
// 12%1==0
// 12%2==0
// 12%3==0
// 12%4==0
// 12%5!=0
// 12%6==0
//   then 1,2,3,4,6 is a factor

import java.util.Scanner;

public class PrintFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}


