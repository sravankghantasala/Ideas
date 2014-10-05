
import java.util.Scanner;



public class TileCost {
	
	public static double GetRoomDimensions()
	{
		Scanner getInput = new Scanner(System.in);
		System.out.print("Enter the Width of Room :");
		double width = getInput.nextDouble();
		System.out.print("Enter the lenght of Room :");
		double length = getInput.nextDouble();
		double volume = length * width;	
		return volume;
	
	}
	
	public static int[] TileDetails()
	{
		Scanner getInput = new Scanner(System.in);
		System.out.print("Enter the Lenght of Tile :");
		int tileLength = getInput.nextInt();
		System.out.print("Enter the Height of Tile :");
		int tileHeight = getInput.nextInt();
		System.out.print("Enter the Cost of Tile :");
		int tileCost = getInput.nextInt();
		return new int[] {tileLength, tileHeight, tileCost}; 	
		
	}	
	
	public static void CostCalculation(double tileCost , int tilesPerRoom)
	{
		System.out.print("Total cost :");
		System.out.println(tileCost * tilesPerRoom);		
	}
	
	public static int CalculateTileCountPerRoom(double roomDimension, double tileDimension)
	{
		Math.round(roomDimension);
		int tileCount = (int) (Math.round(roomDimension) /  Math.round(tileDimension));		
		return tileCount;		
	}
	
	

	public static void main(String[] args) {
		
		System.out.println("#### Welcome to Ghantasala Constructions ####");
		double roomDimension = GetRoomDimensions();	
		int[] tileDimension  = TileDetails();
		int tileLength       = tileDimension[0];
		int tileHeight 		 = tileDimension[1];
		double tileCost         = tileDimension[2];
		int tileVolume 		 = tileLength * tileHeight;
		int tilesPerRoom     = CalculateTileCountPerRoom(roomDimension, tileVolume);
		System.out.println("You need "+ tilesPerRoom +" Tiles for a room of area "+ roomDimension);
		CostCalculation(tileCost,tilesPerRoom);
		System.out.print("Bye!");

	}

}
