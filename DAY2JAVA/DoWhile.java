// do{
//     //do block
//     statements 
//     updation
// }

// while(condition);

// WAJP to print numbers from the range 
// -111 to -101
// 123 to 113
// 5 to -5
// -10 to 0

// WAJP to print characters fro mthe range 
// s to l 
// T  to Z
// by using do while loop


public class DoWhile {
    public static void main(String[] args) {

        // -111 to -101
        int i = -111;
        do {
            System.out.println(i);
            i++;
        } while (i <= -101);

        // 123 to 113
        int j = 123;
        do {
            System.out.println(j);
            j--;
        } while (j >= 113);

        // 5 to -5
        int k = 5;
        do {
            System.out.println(k);
            k--;
        } while (k >= -5);

        // -10 to 0
        int l = -10;
        do {
            System.out.println(l);
            l++;
        } while (l <= 0);

        // s to l
        char m = 's';
        do {
            System.out.println(m);
            m--;
        } while (m >= 'l');

        // T to Z
        char n = 'T';
        do {
            System.out.println(n);
            n++;
        } while (n <= 'Z');
    }
}

