public class Clock {

    public static int clockProblem(int input1, int input2) {
        int movement = input1 * input2;
        int position = movement % 12;

        if (position == 0) {
            position = 12;
        }

        return position;
    }

    public static void main(String[] args) {
        System.out.println(clockProblem(3, 5));   // Output: 3
        System.out.println(clockProblem(4, 3));   // Output: 12
        System.out.println(clockProblem(6, 2));   // Output: 12
        System.out.println(clockProblem(2, 7));   // Output: 2
    }
}
