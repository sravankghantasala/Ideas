/**
 * Created by sraone on 10/5/14.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Utilities {

    private static Scanner S = new Scanner(System.in );

    public static float get_value () {
        while (true) {
            try {
                float input = Float.parseFloat(S.nextLine());
                return input;
            } catch (Exception e) {
                System.out.print("Please enter a valid float value ... ");
            }
        }
    }

    public static String get_metric (ArrayList<String> metrics) {
        System.out.print("Please enter the Metric ..." + metrics + " ... ");
//        System.out.println(metrics);
        while (true) {
            String metric = S.nextLine().toUpperCase();
            if (metrics.contains(metric)) return metric;
            else System.out.print("Sorry I cannot find the metric you want\nPlease try again ... ");
        }
    }

    public static String get_conversion (String metric, ArrayList<String> metrics) {
        System.out.println("Conversions available ... ");
        for (String m : metrics ){
            if (!(m.equalsIgnoreCase(metric))) System.out.println(metric + " --> " + m);
        }
        System.out.print("\nPlease select target metric ... ");
        while(true){
            String target = S.nextLine().toUpperCase();
            if ( (! (target.equals(metric) )) && metrics.contains(target)) return target;
            else System.out.println("Please enter the metric displayed in the above menu ... \nPlease try again ... ");
        }
    }
}
