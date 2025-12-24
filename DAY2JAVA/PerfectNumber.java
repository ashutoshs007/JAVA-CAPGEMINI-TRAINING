
// WAJP to check the given number is perfect number or not

// 6 is a perfect no coz factors of 6 = 1,2,3.exclude(6)

// if sum of factors except original no =original no hence the given no is perfect no


import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num =sc.nextInt();

        int sum =0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }

        if (sum==num){

        System.out.println(num+" is a perfect number");
        }

        else{
            System.out.println(num+" is not a perfect number");
        }



sc.close();
    }
}


