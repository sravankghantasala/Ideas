/**
 * Gives the distance when created an object with two parameters.
 * Created by sraone on 10/6/14.
 */
public class GetDistance {

    private static String ll1,ll2;
    private static double distance;
    private final static int EARTH_RADIUS = 6371; // In KM
    public GetDistance (String l1, String l2){
        this.ll1 = l1;
        this.ll2 = l2;
        this.distance = get_distance (this.ll1, this.ll2);

    }

    public static String getLl1() {
        return ll1;
    }

    public static void setLl1(String ll1) {
        GetDistance.ll1 = ll1;
    }

    public static String getLl2() {
        return ll2;
    }

    public static void setLl2(String ll2) {
        GetDistance.ll2 = ll2;
    }

    public static double getDistance() {
        return distance;
    }

    public static void setDistance(double distance) {
        GetDistance.distance = distance;
    }

    private static double get_distance ( String one, String two){
//        Decode strings into lats and longs
        String temp[] = one.split(" ");
        double lat1 = Double.parseDouble(temp[0]);
        double long1 = Double.parseDouble(temp[1]);

        String temp2[] = two.split(" ");
        double lat2 = Double.parseDouble(temp2[0]);
        double long2 = Double.parseDouble(temp2[1]);

//        Get distance between two lats and two lans
        double latDistance = Math.toRadians(lat1 - lat2);
        double lngDistance = Math.toRadians(long1 - long2);

//        Step 1
        double a = (Math.sin ( latDistance / 2 ) * Math.sin (latDistance / 2)) +
                (Math.cos ( Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) )
                * ( Math.sin (lngDistance /2 ) * Math.sin(lngDistance / 2) );
//        Step 2
        double c = ( 2 * (Math.atan2( Math.sqrt(a), Math.sqrt(1-a))));
//        Step 3
        double d = ( EARTH_RADIUS * c );
        return d;
    }

    // Main Method
    public static void main(String[] args) {
        System.out.println(get_distance("38 -77", "38.897147 -77.043934"));
    }
}
