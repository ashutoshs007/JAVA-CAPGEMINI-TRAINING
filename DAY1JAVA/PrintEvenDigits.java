// 428/10=42
// 42/10=4
// 4/10=0


// 4%10=4
// 48%10 =8;

// use while -when u do not know defiend no. of iterations


// public class PlayingWithNo {
//     int n=428;
//     while(n!=0){
//         int digit =n %10;    //condition


//         n=n/10;    //updation  
//   


import java.util.Scanner;

public class PrintEvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                System.out.println(digit);
            }

            n = n / 10;  
        }

        sc.close();
    }
}

