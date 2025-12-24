
// Special No :-
// 19 is a special no 
 
// separate --> 1,9


// sum -> 1+9 =10;
// product -> 1*9 =9;

// total =10+9;(sum of digit ) +(product of digit)

// total is 19 and is equals to out original number ,hence 19 is a special number 


// use variable 
// temp variable
// sum variable
// product variable
// while loop
//     sum & product of digit
// total variable
// if else to compare original number with total




import java.util.Scanner;

public class CheckSpecialNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();      
        int temp = num;             
        int sum = 0;
        int product = 1;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            product = product * digit;
            temp = temp / 10;
        }

        int total = sum + product;

        if (total == num) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a Special Number");
        }
   sc.close();
        
    }
}






// WAJP TO PRINT SPEICAL NO FRO MTHE RANGE 1 TO 100