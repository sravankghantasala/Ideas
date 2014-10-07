import java.util.ArrayList;
import java.util.Arrays;

/**
 * Converts the distances
 * Possible conversions [ MILLIMETER, CENTIMETER, METER, KILOMETER, MILE, INCH, FOOT ]
 * Created by sraone on 10/6/14.
 */
public class Distance {
    private static ArrayList Metrics = new ArrayList (Arrays.asList("MILLIMETER", "CENTIMETER", "METER", "KILOMETER", "MILE", "INCH", "FOOT"));

    public static void convert(){
        System.out.print("Please enter the distance you want to convert ... ");
        float value=Utilities.get_value();
        String metric = Utilities.get_metric(Metrics);
        String target = Utilities.get_conversion(metric,Metrics);

        System.out.println(value + " " + metric + " is equivalent to " + convert_dist(metric,target,value) + " " + target);
    }

    private static float convert_dist (String metric, String target, float value) {
        switch ( metric ) {
            case "MILLIMETER":
                return mm_to(target, value);

            case "CENTIMETER":
                switch (target) {
                    case "MILLIMETER":
                        return to_mm(target, value);
                    case "CENTIMETER":
                        return value;
                    case "METER" :
                        return ( mm_to ("METER", to_mm ("CENTIMETER",value)));
                    case "KILOMETER" :
                        return ( mm_to ("KILOMETER", to_mm ("CENTIMETER",value)));
                    case "MILE" :
                        return ( mm_to ("MILE", to_mm ("CENTIMETER",value)));
                    case "INCH" :
                        return ( mm_to ("INCH", to_mm ("CENTIMETER",value)));
                    case "FOOT" :
                        return ( mm_to ("FOOT", to_mm ("CENTIMETER",value)));
                }

            case "METER":
                switch (target) {
                    case "MILLIMETER" :
                        return to_mm (target,value);
                    case "CENTIMETER" :
                        return ( mm_to ("CENTIMETER", to_mm ("METER",value)));
                    case "METER" :
                        return value;
                    case "KILOMETER" :
                        return ( mm_to ("KILOMETER", to_mm ("METER",value)));
                    case "MILE" :
                        return ( mm_to ("MILE", to_mm ("METER",value)));
                    case "INCH" :
                        return ( mm_to ("INCH", to_mm ("METER",value)));
                    case "FOOT" :
                        return ( mm_to ("FOOT", to_mm ("METER",value)));
                }

            case "KILOMETER" :
                switch (target) {
                    case "MILLIMETER" :
                        return to_mm (target,value);
                    case "CENTIMETER" :
                        return ( mm_to ("CENTIMETER", to_mm ("KILOMETER",value)));
                    case "METER" :
                        return ( mm_to ("METER", to_mm ("KILOMETER",value)));
                    case "KILOMETER" :
                        return ( mm_to ("KILOMETER", to_mm ("KILOMETER",value)));
                    case "MILE" :
                        return ( mm_to ("MILE", to_mm ("KILOMETER",value)));
                    case "INCH" :
                        return ( mm_to ("INCH", to_mm ("KILOMETER",value)));
                    case "FOOT" :
                        return ( mm_to ("FOOT", to_mm ("KILOMETER",value)));
                }

            case "MILE" :
                switch (target) {
                    case "MILLIMETER" :
                        return to_mm (target,value);
                    case "CENTIMETER" :
                        return ( mm_to ("CENTIMETER", to_mm ("MILE",value)));
                    case "METER" :
                        return ( mm_to ("METER", to_mm ("MILE",value)));
                    case "KILOMETER" :
                        return ( mm_to ("KILOMETER", to_mm ("MILE",value)));
                    case "MILE" :
                        return value;
                    case "INCH" :
                        return ( mm_to ("INCH", to_mm ("MILE",value)));
                    case "FOOT" :
                        return ( mm_to ("FOOT", to_mm ("MILE",value)));
                }

            case "INCH" :
                switch (target) {
                    case "MILLIMETER" :
                        return to_mm (target,value);
                    case "CENTIMETER" :
                        return ( mm_to ("CENTIMETER", to_mm ("INCH",value)));
                    case "METER" :
                        return ( mm_to ("METER", to_mm ("INCH",value)));
                    case "KILOMETER" :
                        return ( mm_to ("KILOMETER", to_mm ("INCH",value)));
                    case "MILE" :
                        return ( mm_to ("MILE", to_mm ("INCH",value)));
                    case "INCH" :
                        return value;
                    case "FOOT" :
                        return ( mm_to ("FOOT", to_mm ("INCH",value)));
                }

            case "FOOT" :
                switch (target) {
                    case "MILLIMETER" :
                        return to_mm (target,value);
                    case "CENTIMETER" :
                        return ( mm_to ("CENTIMETER", to_mm ("FOOT",value)));
                    case "METER" :
                        return ( mm_to ("METER", to_mm ("FOOT",value)));
                    case "KILOMETER" :
                        return ( mm_to ("KILOMETER", to_mm ("FOOT",value)));
                    case "MILE" :
                        return ( mm_to ("MILE", to_mm ("FOOT",value)));
                    case "INCH" :
                        return ( mm_to ("INCH", to_mm ("FOOT",value)));
                    case "FOOT" :
                        return value;
                }
        }
        return 0;
    }

    private static float mm_to ( String target, float value){
        switch (target) {
            case "MILLIMETER" :
//                MM --> MM
                return value;
            case "CENTIMETER" :
//                MM --> CM
                return (value / 10 );
            case "METER" :
//                MM --> M
                return ( mm_to ("CENTIMETER",value) / 100 );
            case "KILOMETER" :
//                MM --> KM
                return ( mm_to ("METER",value) / 1000 );
            case "MILE" :
//                MM --> MI
                return ( value / 1609344 );
            case "INCH" :
//                MM --> I
                return ( value / 25.4f );
            case "FOOT" :
//                MM --> F
                return ( value / 304.8f );
        }
        return 0;
    }

    private static float to_mm ( String metric, float value) {
        switch (metric) {
            case "MILLIMETER" :
//                MM --> MM
                return value;
            case "CENTIMETER" :
//                CM --> MM
                return ( value * 10 );
            case "METER" :
//                M --> MM
                return ( to_mm ("CENTIMETER",value) * 100 );
            case "KILOMETER" :
//                KM --> MM
                return ( to_mm ("METER",value) * 1000 );
            case "MILE" :
//                Mi --> MM
                return ( value * 1609344 );
            case "INCH" :
//                I --> MM
                return ( value * 25.4f );
            case "FOOT" :
//                F --> MM
                return ( value * 304.8f );
        }
        return 0;
    }
}
