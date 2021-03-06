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
        System.out.print("Conversions available ... \n\t" +
                "1. Temperature\n\t" +
                "2. Memory\n\t" +
                "3. Distance\n" +
                "Please select a conversion ... ");
        int conversion = S.nextInt();
        switch (conversion) {
            case 1 :
                Temperature.convert();
                break;
            case 2 :
                Memory.convert();
                break;
            case 3:
                Distance.convert();
                break;
            default:
                System.out.println("No such conversion available ... \nExiting ... \n");
        }
    }
}
