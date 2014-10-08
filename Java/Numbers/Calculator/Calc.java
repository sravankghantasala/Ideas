/**
 * This Holds the logic involved in a calculator application
 * Created by ghantasa on 08-10-2014.
 */
public class Calc<T> {

    public T add (T a, T b) {
        double da = Double.parseDouble(a);
        return ((T)(b + a));
    }
}
