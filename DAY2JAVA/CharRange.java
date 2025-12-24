// WAJ to print characters from the range 

// d to j 
// m to e 
// z to t 
// r to x 
// by using for loop.




public class CharRange {
    public static void main(String[] args) {

        for(char c = 'd'; c <= 'j'; c++){
            System.out.println(c);
        }

        for(char c = 'm'; c >= 'e'; c--){
            System.out.println(c);
        }

        for(char c = 'z'; c >= 't'; c--){
            System.out.println(c);
        }

        for(char c = 'r'; c <= 'x'; c++){
            System.out.println(c);
        }
    }
}

