import java.util.Scanner;
public class BankThreshold {
	
	
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		boolean run= true;
		while(run) {
			System.out.println("Enter opening balance:");
			double balance= in.nextDouble();
			System.out.println("Enter interest rate:");
			double interestRate= in.nextDouble();
			//repeat above
			System.out.println("Enter threshold for your account to reach:");
			double threshold= in.nextDouble();
		
		
			//if user enters "End" repeat will end
	
	
			BankAccountModify myBankAccount2= new BankAccountModify();
		
			int months=0;
			double futureBalance=balance;
		
			while(futureBalance<threshold) {
				
				months++;
			
				double increase= futureBalance*interestRate;
				futureBalance= futureBalance+ increase;
				//System.out.println(months);
				if (futureBalance>=threshold) {
					run=false;
				}
			}//end while loop- calculate months
			
			System.out.println("It will take "+months +" months to reach the threshold");
			
			System.out.println("Would you like to run again? Enter 'end' to stop. Enter any key to continue.");
			String junk= in.nextLine();
			String answer= in.nextLine();
				if(answer.equalsIgnoreCase("end")){
					run=false;
				}
				else {
					run=true;
				}
		}//end outer while loop
	

	
	
		
		
	}//end main method

	
}//end class
