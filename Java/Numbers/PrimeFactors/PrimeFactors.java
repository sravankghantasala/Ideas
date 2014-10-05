import java.util.*;

/**
 * Created by sraone on 10/5/14.
 */
public class PrimeFactors {
    /**
     * Gets the input from the user to print fibonacci series of those many numbers
     * @return
     */
    public static int get_input(){
        System.out.print("Enter the number you want to find prime factors for ... ");
        return (Integer.parseInt(System.console().readLine()));
    }

    /**
     * Returns all the prime factors of the given number
     * @param number
     * @return
     */
    public static List <Integer> get_factors (int number){
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++ ){
            if (number % i == 0 ) factors.add(i);
        }
        return factors;
    }

    /**
     * Finds the given number is a prime number or not
     * @param args
     */
    public static boolean is_prime(int num){
        for (int i = 2; i<num; i++) {
            if (num % i == 0 ) return false;
        }
        return true;
    }

    // Main Method
    public static void main(String[] args) {
        int num = get_input();
        System.out.print("Prime factors for " + num + " are ... ");
        for (int i : get_factors(num)){
            if (is_prime(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}
