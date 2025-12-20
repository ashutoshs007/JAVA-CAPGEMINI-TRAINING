import java.util.Scanner;
public class FindMax {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a+"is maximum of given three");
        }
        else if(b>=a && b>=c){
            System.out.println(b+" is maximum of given three");
        }
        else {
            System.out.println(c+" is maximum of given three");
        }

        sc.close();


    }
}
