import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sraone on 10/5/14.
 */

public class Temperature {
    /**
     * Converts temperature
     * Fahrenheit to Celsius
     * Celsius to Fahrenheit
     */
    private static ArrayList <String> Metrics = new ArrayList(Arrays.asList("FAHRENHEIT", "CELSIUS"));


    public static void convert(){
        System.out.print("Please enter the Temperature you want to convert ... ");
        float value=Utilities.get_value();
        System.out.print("Please enter the Metric ...");
        String metric = Utilities.get_metric(Metrics);
        String target = Utilities.get_conversion(metric,Metrics);

        System.out.println(value + " " + metric + " is equivalent to " + convert_temp(metric,target,value) + " " + target);
    }

    private static float convert_temp(String metric, String target, float value) {
        switch (metric.toLowerCase()) {
            case "fahrenheit" :
                if (target.equalsIgnoreCase("celsius")) {
                    float temp = (value - 32);
                    temp *= (5.0f/9.0f);
                    return temp;
                }
                break;

            case "celsius" :
                if (target.equalsIgnoreCase("fahrenheit")) {

                    float temp = (value * (9.0f/5.0f));
                    temp += 32;
                    return temp;
                }
        }
        return 0;
    }
}
