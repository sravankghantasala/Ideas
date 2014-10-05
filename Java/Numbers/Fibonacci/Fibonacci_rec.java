/**
 * Created by sraone on 10/5/14.
 */
public class Fibonacci_rec {

    /**
     * Gets the input from the user to print fibonacci series of those many numbers
     * @return
     */
    public static int get_input(){
        System.out.println("How many numbers you want fibonacci series ? ... ");
        return (Integer.parseInt(System.console().readLine()));
    }

    // recursive declaration of method fibonacci
    public static int fibonacci(int number) {
        if ((number == 0) || (number == 1)) // base cases
            return number;
        else
            // recursion step
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        int max = get_input();
        for (int counter = 1; counter <= max; counter++)
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
    }
}
