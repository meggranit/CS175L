import java.util.Scanner;
public class CreditCardEditInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String creditCardNumber="";
		boolean run= true;
	
		
		
		while(run) {
			System.out.println("Enter a Credit Card number or -99 to end");
			creditCardNumber= in.nextLine();
			
			if (creditCardNumber.equals("-99")){
				System.out.println("Goodbye");
				run=false;
			}
			
			else {
				int i=0;
				while(i<creditCardNumber.length()) {
					char ch= creditCardNumber.charAt(i);
				
					if(ch==' '||ch=='-') {
						String before= creditCardNumber.substring(0,i);
						String after= creditCardNumber.substring(i+1);
						creditCardNumber= before+after;	
					}
					else {
						i++;
					}
					run=true;
					
					
				}
				
			
			}
			
			System.out.println(creditCardNumber);
			
					
						
					
			}//end while 
		
		
				
	
	}
		
		
	
	
		
		
	
		
		
		
	
}//end class
