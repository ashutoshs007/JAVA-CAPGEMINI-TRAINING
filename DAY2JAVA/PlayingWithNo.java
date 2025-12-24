// 428/10=42
// 42/10=4
// 4/10=0






// 4%10=4

// use while -when u do not know defiend no. of iterations


// public class PlayingWithNo {
//     int n=428;
//     while(n!=0){
//         int digit =n %10;    //condition


//         n=n/10;    //updation  
//     }
// }



// 54 . //WAJP to print digit of a given number.
import java.util.Scanner;

public class PlayingWithNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != 0) {
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }

        sc.close();
    }
} 

