import java.util.Scanner;

public class FindSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = 9;
        int smin = 9;

        while (n > 0) {
            int d = n % 10;

            if (d < min) {
                smin = min;
                min = d;
            } else if (d < smin && d != min) {
                smin = d;
            }

            n = n / 10;
        }

        System.out.println(min);
        System.out.println(smin);
     sc.close();
    }
}



// else if (d < smin && d != min)



// why (d < min && d!= smin) do not works??   
                        

// WAJP TO CHECK WHETHER THE GIVEN NO IS SPECIAL NO OR NOT 












