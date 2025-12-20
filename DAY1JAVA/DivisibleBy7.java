// Write a java program to cehck whether it is divisble by  8 or not 

// Write a java program to check whether given character is vowel or consonant

//Write a java program to check whether the given character is digit or not



import java.util.Scanner;
public class DivisibleBy7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%7==0){
            System.out.println("No is divisble by 7");
        }

        if(n%7!=0){
            System.out.println("No is not divisble by 7 ");
        }

        sc.close();
        
    }
}



  
