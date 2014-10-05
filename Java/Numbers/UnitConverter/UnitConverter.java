import java.util.Scanner;

/**
 * Unit Converter (temp, currency, volume, mass and more) – Converts various units between one another.
 * The user enters the type of unit being entered, the type of unit they want to convert to
 * and then the value. The program will then make the conversion.
 * Created by sraone on 10/5/14.
 */
public class UnitConverter {
    // Main Method
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in );
        System.out.println("Conversions available ... \n\t1. Temperature\nPlease select a conversion ... ");
        int conversion = S.nextInt();
        switch (conversion) {
            case 1 :
                Temperature.convert();
                break;
            default:
                System.out.println("No such conversion available ... \nExiting ... \n");
        }
    }
}
