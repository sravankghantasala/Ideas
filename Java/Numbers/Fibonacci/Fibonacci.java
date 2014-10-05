/**
 * Created by sraone on 10/5/14.
 */
public class Fibonacci {
    /**
     * Gets the input from the user to print fibonacci series of those many numbers
     * @return
     */
    public int get_input(){
        System.out.print("How many numbers you want fibonacci series ? ... ");
        return (Integer.parseInt(System.console().readLine()));
    }

    // Main Method
    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        Fibonacci fi = new Fibonacci();
//        Getting Input
        int max = fi.get_input();

        for(int i = 1; i <= max; i++)
        {
            System.out.println(i + ":" + f + " ");
            f = f + g;
            g = f - g;
        }

        System.out.println();
        }
    }

