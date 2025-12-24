//Write a Java Program to display an employees designation based on the department and role selected by user
// ITI
//    Developer
//    Tester
//    DevOps Engineer

// HR
//   Rercuiter
//   HR executive
//   Payroll Officer

//  Finance
//        Accountant 
//        Finanical Analyst
//        Auditor
       
//  Operations
//         Operation Executive
//         Team Lead 
//         Manager 


import java.util.Scanner;

public class EmployeeDesignation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Department:");
        System.out.println("1. IT");
        System.out.println("2. HR");
        System.out.println("3. Finance");
        System.out.println("4. Operations");

        int dept = sc.nextInt();

        switch (dept) {

            case 1: 
                System.out.println("Select Role:");
                System.out.println("1. Developer");
                System.out.println("2. Tester");
                System.out.println("3. DevOps Engineer");

                int itRole = sc.nextInt();

                switch (itRole) {
                    case 1:
                        System.out.println("Designation: IT Developer");
                        break;
                    case 2:
                        System.out.println("Designation: IT Tester");
                        break;
                    case 3:
                        System.out.println("Designation: DevOps Engineer");
                        break;
                    default:
                        System.out.println("Invalid IT Role");
                }
                break;

            case 2: 
                System.out.println("Select Role:");
                System.out.println("1. Recruiter");
                System.out.println("2. HR Executive");
                System.out.println("3. Payroll Officer");

                int hrRole = sc.nextInt();

                switch (hrRole) {
                    case 1:
                        System.out.println("Designation: HR Recruiter");
                        break;
                    case 2:
                        System.out.println("Designation: HR Executive");
                        break;
                    case 3:
                        System.out.println("Designation: Payroll Officer");
                        break;
                    default:
                        System.out.println("Invalid HR Role");
                }
                break;

            case 3: 
                System.out.println("Select Role:");
                System.out.println("1. Accountant");
                System.out.println("2. Financial Analyst");
                System.out.println("3. Auditor");

                int finRole = sc.nextInt();

                switch (finRole) {
                    case 1:
                        System.out.println("Designation: Accountant");
                        break;
                    case 2:
                        System.out.println("Designation: Financial Analyst");
                        break;
                    case 3:
                        System.out.println("Designation: Auditor");
                        break;
                    default:
                        System.out.println("Invalid Finance Role");
                }
                break;

            case 4: 
                System.out.println("Select Role:");
                System.out.println("1. Operation Executive");
                System.out.println("2. Team Lead");
                System.out.println("3. Manager");

                int opsRole = sc.nextInt();

                switch (opsRole) {
                    case 1:
                        System.out.println("Designation: Operation Executive");
                        break;
                    case 2:
                        System.out.println("Designation: Team Lead");
                        break;
                    case 3:
                        System.out.println("Designation: Manager");
                        break;
                    default:
                        System.out.println("Invalid Operations Role");
                }
                break;

            default:
                System.out.println("Invalid Department");
        }

        sc.close();
    }
}
