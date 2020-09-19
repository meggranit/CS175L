import java.util.Scanner; 
public class HelloTry {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a building width");
		int buildingWidth= in.nextInt();
		System.out.println("Please enter a building height");
		int buildingHeight= in.nextInt();
		//int buildingWidth= 50;
		//int buildingHeight= 30;
		//boolean yesOrNo= false;
		
		
		//System.out.print("Hello");
		int sqFt= (buildingWidth*buildingHeight);
		System.out.println("The square footage is "+sqFt);
			
		// TODO Auto-generated method stub

	}

}
