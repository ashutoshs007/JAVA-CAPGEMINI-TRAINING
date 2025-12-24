import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                int i = 10;
                do {
                    System.out.println(i);
                    i++;
                } while (i <= 20);
            } else {
                for (int i = 25; i >= 15; i--) {
                    System.out.println(i);
                }
            }

        } else if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                int i = -10;
                while (i >= -20) {
                    System.out.println(i);
                    i--;
                }
            } else {
                for (int i = -25; i <= -15; i++) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Invalid character");
        }

        sc.close();
    }
}



    

