// //Problem Statement: Travel Ticket Booking & Fare Processing System

// Design a Java program that simulates a travel ticket booking system. The program must validate passenger details, calculate fare dynamically, apply discounts, and determine booking status using multiple decision structures.

// Step 1: Passenger Input

// Passenger ID (int)

// Passenger Name (String)

// Age (int)

// Travel Type (int): 1-Bus, 2-Train, 3-Flight

// Base Fare (double)

// Is Government Employee (boolean: true/false)

// 1/2

// Step 2: Age & Eligibility Validation (if / else)

// If age 5 Print 'Free Ticket - No Booking Required' and stop execution.

// If age > 80 → Print 'Medical Clearance Required' and stop execution.

// Else Continue booking process.

// Step 3: Travel Type & Class Selection (Nested Switch)If age 5 Print 'Free Ticket - No Booking Required' and stop execution.

// If age > 80 Print 'Medical Clearance Required' and stop execution.

// Else Continue booking process.

// Step 3: Travel Type & Class Selection (Nested Switch)

// Bus: 1-Sleeper, 2-Seater

// Train: 1-General, 2-Sleeper, 3-AC

// Flight: 1-Economy, 2-Business

// Step 4: Fare Multiplier Calculation

// Travel Type

// Class

// Multiplier

// Bus

// Sleeper

// 1.2

// Bus

// Seater

// 1.0

// Train

// General

// 1.0

// Train

// Sleeper

// 1.3

// Train

// AC

// 1.6

// Flight

// Economy

// 2.5

// Flight

// Business

// 3.5

// Fare After Class = Base Fare Multiplier

import java.util.Scanner;

public class TicketBooking {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter Passenger ID:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Passenger Name:");
            String name = sc.nextLine();

            System.out.println("Enter Passenger Age:");
            int age = sc.nextInt();

            if (age < 5) {
                System.out.println("Free Ticket - No Booking Required");
                return;
            } else if (age > 80) {
                System.out.println("Medical Clearance Required");
                return;
            }

            System.out.println("Select Travel Type:");
            System.out.println("1. Bus");
            System.out.println("2. Train");
            System.out.println("3. Flight");
            int travelType = sc.nextInt();

            System.out.println("Enter Base Fare:");
            double baseFare = sc.nextDouble();

            System.out.println("Are you a Government Employee? (true/false):");
            boolean isGovEmployee = sc.nextBoolean();

            double multiplier = 1.0;

            switch (travelType) {
                case 1:
                    multiplier = 1.0;
                    break;
                case 2:
                    multiplier = 1.5;
                    break;
                case 3:
                    multiplier = 3.0;
                    break;
                default:
                    System.out.println("Invalid Travel Type");
                    return;
            }

            double totalFare = baseFare * multiplier;

            if (isGovEmployee) {
                totalFare = totalFare * 0.8;
            }

            System.out.println("\n----- Ticket Details -----");
            System.out.println("Passenger ID   : " + id);
            System.out.println("Passenger Name : " + name);
            System.out.println("Passenger Age  : " + age);
            System.out.println("Total Fare     : " + totalFare);

        }
    }
}



