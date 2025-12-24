import java.util.Scanner;

public class Fruits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fruit name: ");
        String fruit = sc.next();

        switch (fruit.toLowerCase()) {
            case "apple":
                System.out.println("Apples are rich in fiber");
                break;

            case "banana":
                System.out.println("Bananas are rich in potassium");
                break;

            case "orange":
                System.out.println("Oranges are rich in vitamin C");
                break;

            default:
                System.out.println("Unknown fruit");
        }

        sc.close();
    }
}


