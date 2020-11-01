import javax.swing.JOptionPane;
public class AgeCalculation {
	
	public static void main (String[]args) {
		int totalYears=0;
		int totalMonths=0;
		
		
//birthdate		
		String inputBirthdate = JOptionPane.showInputDialog("Enter your birthdate (MM/DD/YYYY): ");

	      int birthdate = Integer.parseInt(inputBirthdate);
	      int bMonths= birthdate/1000000;
	      //System.out.println(bMonths);
	      int bYears=birthdate%10000;
	      //System.out.println(bYears);
	      int bDays= ((birthdate-(bMonths*1000000)-(bYears))/10000);
	      //System.out.println(bDays);
	      
//current date
	    String inputCurrentDate = JOptionPane.showInputDialog("Enter the current date (MM/DD/YYYY): ");
	      int currentDate = Integer.parseInt(inputCurrentDate);
	      int cMonths= currentDate/1000000;
	      //System.out.println(cMonths);
	      int cYears=currentDate%10000;
	      //System.out.println(cYears);
	      int cDays= ((currentDate-(cMonths*1000000)-(cYears))/10000);
	      //System.out.println(cDays);
	      
//calculate change in time
	      totalMonths= (cMonths-bMonths);
	      totalYears = cYears-bYears;
	      if(cDays<bDays) {
	    	  totalMonths=totalMonths-1;
	      }	     
	      if(totalMonths<0) {
	    	  totalYears=totalYears-1;
	    	  totalMonths=totalMonths+12;
	      }
	      
	    
	      //System.out.println(totalYears);
	      
	      //System.out.println(totalMonths);
	      
//print message	    
	      JOptionPane.showMessageDialog(null, "My age is "+ totalYears +" years "+ totalMonths +" months");  
		
		
	}

}
