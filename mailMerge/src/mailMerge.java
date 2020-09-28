import java.util.Scanner;
public class mailMerge {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text1 = "Dear <first> <last>";
		String text2 = "Please confirm that your address is <house> <street>";
		String text3= "Your answer is <yorn>";
		System.out.println("Enter your first name");
		String firstName= in.nextLine();
		text1= text1.replace("<first>", firstName);
		System.out.println("Enter your last name");
		String lastName= in.nextLine();
		text1= text1.replace("<last>", lastName);
		System.out.println("Enter your house number");
		String house= in.nextLine();
		text2= text2.replace("<house>", house);
		System.out.println("Enter street address");
		String street= in.nextLine();
		text2= text2.replace("<street>", street);
		System.out.println(text1);
		System.out.println(text2);
		System.out.println("Enter yes or no");
		String answer= in.nextLine();
		text3= text3.replace("<yorn>", answer);
		System.out.println(text3);
		
	}
}
