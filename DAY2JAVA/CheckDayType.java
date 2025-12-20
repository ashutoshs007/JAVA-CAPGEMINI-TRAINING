//WAP IN JAVA TO CHECK DAY TYPE:
//IF INPUT IS VALID DAY 
// IF SATURDAY OR SUNDAY->WEEKEND
// ELSE->WEEKDAY
// ELSE->INVALID DAY



import java.util.Scanner;

public class CheckDayType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } 
        else if (day.equalsIgnoreCase("Monday") ||
                 day.equalsIgnoreCase("Tuesday") ||
                 day.equalsIgnoreCase("Wednesday") ||
                 day.equalsIgnoreCase("Thursday") ||
                 day.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");
        } 
        else{
            System.out.println("Invalid day");
        }
sc.close();
        
    }
}
