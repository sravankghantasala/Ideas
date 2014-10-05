/**
 * Gives user the next prime number until he says no
 * Created by sraone on 10/5/14.
 */
public class NextPrime {
    /**
     * gets user input of her wants to see more prime numbers
     * @return
     */
    public static boolean get_input(){
        while (true) {
            System.out.print("Do you want to see one more ? [y/n] ");
            String input = System.console().readLine();
            if (input.equalsIgnoreCase("y")) return (true);
            else if (input.equalsIgnoreCase("n")) return (false);
        }
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

    /**
     * Gives next prime number of the given number
     * @param num
     * @return
     */
    public static int nextprime (int num){
        while(true){
            num+=1;
            if(is_prime(num)) return num;
        }
    }

    // Main Method
    public static void main(String[] args) {
        int num = 1;
        System.out.println("First prime number is ... " + num);
        while(get_input()){
            num = nextprime(num);
            System.out.println(num);
        }
    }
}
