import java.util.ArrayList;
import java.util.Arrays;

/**
 * Converts memory up till Terabytes from bytes.
 * possible convertsions
 * Bytes,Kilo Bytes, Mega Bytes, Giga Bytes, Tera Bytes
 * Created by sraone on 10/5/14.
 */
public class Memory {
    private static ArrayList<String> Metrics = new ArrayList (Arrays.asList("BYTES","KILOBYTES","MEGABYTES","GIGABYTES","TERABYTES"));

    public static void convert(){
        System.out.print("Please enter the memory size you want to convert ... ");
        float value=Utilities.get_value();
        String metric = Utilities.get_metric(Metrics);
        String target = Utilities.get_conversion(metric,Metrics);

        System.out.println(value + " " + metric + " is equivalent to " + convert_mem(metric,target,value) + " " + target);
    }

    private static float convert_mem(String metric, String target, float value){
        switch (metric){
            case "BYTES" :
//                B --> *
                return bytes_to(target,value);
            case "KILOBYTES" :
                switch (target){
                    case "BYTES":
//                        KB --> B
                        return to_bytes("KILOBYTES",value);
                    case "KILOBYTES":
//                        KB --> KB
                        return value;
                    case "MEGABYTES":
//                        KB --> MB
                        return bytes_to("MEGABYTES",to_bytes("KILOBYTES",value));
                    case "GIGABYTES":
//                        KB --> GB
                        return bytes_to("GIGABYTES",to_bytes("KILOBYTES",value));
                    case "TERABYTES":
//                        KB --> TB
                        return bytes_to("TERABYTES",to_bytes("KILOBYTES",value));
                }

            case "MEGABYTES" :
                switch (target){
                    case "BYTES":
//                        MB --> B
                        return to_bytes("MEGABYTES",value);
                    case "KILOBYTES":
//                        MB --> KB
                        return bytes_to("KILOBYTES",to_bytes("MEGABYTES",value));
                    case "MEGABYTES":
//                        MB --> MB
                        return value;
                    case "GIGABYTES":
//                        MB --> GB
                        return bytes_to("GIGABYTES",to_bytes("MEGABYTES",value));
                    case "TERABYTES":
//                        MB --> TB
                        return bytes_to("TERABYTES",to_bytes("MEGABYTES",value));
                }

            case "GIGABYTES" :
                switch (target){
                    case "BYTES":
//                        GB --> B
                        return to_bytes("GIGABYTES",value);
                    case "KILOBYTES":
//                        GB --> KB
                        return bytes_to("KILOBYTES",to_bytes("GIGABYTES",value));
                    case "MEGABYTES":
//                        GB --> MB
                        return bytes_to("MEGABYTES",to_bytes("GIGABYTES",value));
                    case "GIGABYTES":
//                        GB --> GB
                        return value;
                    case "TERABYTES":
//                        GB --> TB
                        return bytes_to("TERABYTES",to_bytes("GIGABYTES",value));
                }

            case "TERABYTES" :
                switch (target){
                    case "BYTES":
//                        TB --> B
                        return to_bytes("TERABYTES",value);
                    case "KILOBYTES":
//                        TB --> KB
                        return bytes_to("KILOBYTES",to_bytes("TERABYTES",value));
                    case "MEGABYTES":
//                        TB --> MB
                        return bytes_to("MEGABYTES",to_bytes("TERABYTES",value));
                    case "GIGABYTES":
//                        TB --> GB
                        return bytes_to("GIGABYTES",to_bytes("TERABYTES",value));
                    case "TERABYTES":
//                        TB --> TB
                        return value;
                }

        }
        return 0;
    }

    private static float to_bytes (String target, float value){
        switch(target){
            case "BYTES":
                return value;
            case "KILOBYTES":
                return ( value * 1024 );
            case "MEGABYTES":
                return ( to_bytes ("KILOBYTES",value) * 1024 );
            case "GIGABYTES":
                return ( to_bytes ("MEGABYTES",value) * 1024 );
            case "TERABYTES":
                return ( to_bytes ("GIGABYTES",value) * 1024 );
        }
        return 0;
    }

    private static float bytes_to (String metric, float value){
        switch(metric){
            case "BYTES":
                return value;
            case "KILOBYTES":
                return ( value / 1024 );
            case "MEGABYTES":
                return ( bytes_to ("KILOBYTES",value) / 1024 );
            case "GIGABYTES":
                return ( bytes_to ("MEGABYTES",value) / 1024 );
            case "TERABYTES":
                return ( bytes_to ("GIGABYTES",value) / 1024 );
        }
        return 0;
    }
}
