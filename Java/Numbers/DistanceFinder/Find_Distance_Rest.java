import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


/**
 * Created by sraone on 10/6/14.
 */
public class Find_Distance_Rest {
//    TODO : Do the same distance using rest api to get the lat and long of the cities given

    private static String[] get_cities () {
        Scanner S = new Scanner(System.in);
        String[] temp = new String[2];
        System.out.print("Please enter the city 1 ... "); temp[0] = S.nextLine();
        System.out.print("Please enter the city 2 ... "); temp[1] = S.nextLine();
        return (temp);
    }

    private static String get_LatLan (String city ){
        String temp = "";
        try {
            URL url = new URL("http://www.geonames.org/search.html?q=" + city);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            if (conn.getResponseCode() != 200) {
                throw new IOException(conn.getResponseMessage());
            }
            BufferedReader rd = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                if (line.contains("<small>1</small>")) {
                    String one = "><";
                    String[] spans = line.split(one);
                    for (String i : spans ){
                        if (i.contains("latitude")) {
                            temp=i.split(">")[1].toString().split("<")[0];
                            temp+=" ";
                        }
                        if (i.contains("longitude")) {
                            temp+=i.split(">")[1].toString().split("<")[0];
                        }
                    }
                }
            }
            rd.close();
            conn.disconnect();
        }
        catch ( Exception e ) {
            System.out.println(e);
        }
        return temp;
    }
    // Main Method
    public static void main(String[] args) {
        String[] cities = get_cities();
        GetDistance GD = new GetDistance(get_LatLan(cities[0]),get_LatLan(cities[1]));
        System.out.println("Distance between the cities \"" + cities[0] + "\" and \"" + cities[1] + "\" is ... " + Math.round(GD.getDistance()) + " Kms");
    }
}
