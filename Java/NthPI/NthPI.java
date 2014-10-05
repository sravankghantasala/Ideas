import java.util.Scanner;
import java.text.DecimalFormat;;


public class NthPI {
	
	public static int UserInput()
	{
		System.out.print("Enter Pi Formating:");
		Scanner getInput = new Scanner(System.in);
		return getInput.nextInt();		
		
	}
	
	public static double GetPiValue()
	{
		// This will calculate the actual value of Pi and return
		float numerator = 22;
		float denominator = 7;
		double actualPiValue = numerator / denominator;
		return actualPiValue;			
	}
	
	
	public static void PiOnConsole(int formater)
	{
		// This will get the actual value of Pi and will display on console
		double pi = GetPiValue();		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(formater);
		System.out.print("PI = ");
		System.out.print(df.format(pi));
		
	}
	public static void main(String[] args) {
		
		// First get the input from User		
		int formaterValue = UserInput();
		
		// Printing PI value on Console
		PiOnConsole(formaterValue);	

	}

}
