//Create a program that takes a student's mark as input (A,B,C,D,F) and uses a switch statement to print the corresponding message 

// A:Excellent
// B:Good
// C:Fair
// D:Pass
// E:Fail


//1.we cannot use long,float,double,boolean as an input of a switch.
//2.if we want a desired output so need break statement.
//3.break statement is a control transfer statement.
//4.default statement is not mandatory
// 5.we can write default statements anywhere inside swith blocks

import java.util.Scanner;
public class StudentMarks {
   public static void main(String [] args){
    Scanner sc =new Scanner(System.in);

    char grade =sc.next().charAt(0);

    switch(grade){
        case 'A':
            System.out.println("Excellent");
            break;
    
        case 'B':
            System.out.println("Good");
            break;
    
        case 'C':
            System.out.println("Fair");
            break;
    
        case 'D':
            System.out.println("Pass");
            break;

    
        case 'E':
            System.out.println("Fail");
            break;
    }
    

    sc.close();
   } 
}


