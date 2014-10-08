/**
 * This Holds the logic involved in a calculator application
 * Created by ghantasa on 08-10-2014.
 */

public class Calc {

    public static double add ( double a , double b ){
        return ( a + b );
    }

    public static double sub ( double a , double b ){
        return ( a - b );
    }

    public static double mul ( double a , double b ){
        return ( a * b );
    }

    public static double div ( double a , double b ){
        if (b!=0) {
            return (a / b);
        }
        return 0;
    }

    public static double mod ( double a , double b ){
        if (b!=0) {
            return (a % b);
        }
        return 0;
    }

    public static double pwr ( double a , double b ){
        if(b>=0) {
            return Math.pow(a, b);
        }
        return 0;
    }

    public static double root ( double a , double b ) {
        if (b > 0) {
            return Math.pow(a, (1 / b));
        }
        return 0;
    }
}
