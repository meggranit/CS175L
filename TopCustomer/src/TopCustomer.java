import java.util.Scanner;
public class TopCustomer {

//declaring variables
static int bestCustomer=0;
public static int i=1;
static String[] names;
static double[] price;



	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		boolean run= true;
		
	//while loop recording each item in price and name arrays	
		while(run) {
		System.out.println("Enter price:");
		price[i]= in.nextDouble();
		
		if (price[i]==0) {
			run= false;
		}
		
		System.out.println("Enter customer name:");
		names[i]= in.next();
		i++;
		}
	
		System.out.println(bestCustomer);
		TopCustomer top= new TopCustomer();
		System.out.println("Best customer's name "+ top.nameOfBestCustomer());
		in.close();
		
	}
	
	//method to determine mame of best customer besed on price array
	 public String nameOfBestCustomer(){
		 bestCustomer= (int) price[1];
		 if(price[i+1]>=price[i]) {
				bestCustomer=i+1;
			}
		String topCustomer = names[bestCustomer];
		
		return topCustomer;
	
	}
	
}
	
