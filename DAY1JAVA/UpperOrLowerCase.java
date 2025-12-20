//write a java program to check whether the given character is upper case character ,lower case character , digit or special character  
// 
import java.util.Scanner;
public class UpperOrLowerCase {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        char ch =sc.next().charAt(0);

        if(ch>='A' && ch<= 'Z'){
            System.out.println("UpperCase Character");
        }
     
       else if(ch>='a' && ch<='z')
        System.out.println("LowerCase Character");

       else if(ch>='0' && ch<= '9')
        System.out.println("Character is a digit");

        
        else {
            System.out.println("Special character");
        }

        sc.close();


    }
}








