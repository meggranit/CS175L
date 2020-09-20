import java.util.Scanner;
public class HousePaintingEstimate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the base of the house:");
		int length = in.nextInt();
		System.out.println("Enter the height to the edge of the roof:");
		int width = in.nextInt();
		System.out.println("Enter the height to the peak of the roof:");
		int height = in.nextInt();
		System.out.println("Enter the number of windows:");
		int numWindows = in.nextInt();
		System.out.println("Enter the length of each window:");
		int lengthWindows = in.nextInt();
		System.out.println("Enter the width of each window:");
		int widthWindows = in.nextInt();
		System.out.println("Enter the number of doors:");
		int numDoors = in.nextInt();
		System.out.println("Enter the length of each door:");
		int lengthDoors = in.nextInt();
		System.out.println("Enter the width of each door:");
		int widthDoors = in.nextInt();
		System.out.println("Enter the cost the painter charges per square foot:");
		double rate = in.nextDouble();
		double normalArea= length*width;
		//System.out.println(normalArea);
		double roofArea=((height-width)*length)*1/2;
		double peakArea= roofArea+normalArea;
		//System.out.println(peakArea);
		double areaTotalWindows=numWindows*widthWindows*lengthWindows;
		//System.out.println(areaTotalWindows);
		double areaTotalDoors= numDoors*widthDoors*lengthDoors;
		//System.out.println(areaTotalDoors);
		double totalSurfaceArea= (2*peakArea)+(2*normalArea)-areaTotalWindows-areaTotalDoors;
		//System.out.println(totalSurfaceArea);
		double totalCost= rate*totalSurfaceArea;
		System.out.println("The total cost to paint the house is $"+totalCost);
		
		
	}

}
