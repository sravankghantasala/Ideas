import com.sun.org.apache.xpath.internal.SourceTree;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by sraone on 10/6/14.
 */
public class Find_Distance {

    // Main Method
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Please enter the latitude and longitude of city1 (lat long) ... ");
        String ll1 = S.nextLine();
        System.out.print("Please enter the latitude and longitude of city2 (lat long) ... ");
        String ll2 = S.nextLine();

        GetDistance GD = new GetDistance(ll1, ll2);
        System.out.println("Distance between city1 and city2 is ... " + GetDistance.getDistance());
    }

}
