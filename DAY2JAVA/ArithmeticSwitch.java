//Write a java program to perform arithmentic operation using switch and user choice

// addition
// then ask add 2 variable
// add 3 variable
// add 4 variable

// subtraction 
// sub 2 variable
// sub 3 variable
// sub 4 variable

// multiplication
// mul 2 variable
// mul 3 variable
// mul 4 variable

// division
// divide 2 variable

import java.util.Scanner;

public class ArithmeticSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Enter number of values (2/3/4):");
                int n1 = sc.nextInt();

                if (n1 == 2) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Result = " + (a + b));
                } 
                else if (n1 == 3) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    System.out.println("Result = " + (a + b + c));
                } 
                else if (n1 == 4) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("Result = " + (a + b + c + d));
                } 
                else {
                    System.out.println("Invalid choice");
                }
                break;

            case 2: 
                System.out.println("Enter number of values (2/3/4):");
                int n2 = sc.nextInt();

                if (n2 == 2) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Result = " + (a - b));
                } 
                else if (n2 == 3) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    System.out.println("Result = " + (a - b - c));
                } 
                else if (n2 == 4) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("Result = " + (a - b - c - d));
                } 
                else {
                    System.out.println("Invalid choice");
                }
                break;

            case 3: 
                System.out.println("Enter number of values (2/3/4):");
                int n3 = sc.nextInt();

                if (n3 == 2) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Result = " + (a * b));
                } 
                else if (n3 == 3) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    System.out.println("Result = " + (a * b * c));
                } 
                else if (n3 == 4) {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("Result = " + (a * b * c * d));
                } 
                else {
                    System.out.println("Invalid choice");
                }
                break;

            case 4: 
                int a = sc.nextInt();
                int b = sc.nextInt();

                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Operation");
        }

        sc.close();
    }
}
