import javax.swing.JOptionPane;
public class RomanNumerals {

	public static void main(String[] args) {
		int number=0;
		String romanNum= "";
		
		
		String inputInteger = JOptionPane.showInputDialog("Enter a positive integer:");
		int initial = Integer.parseInt(inputInteger);
		number=initial;
		
		if(initial>=3999) {
			System.out.println("Invalid number. Enter a new number");
		}
		
		int thousand= number/1000;
			//System.out.println(thousand);
		number= number-(thousand*1000);
		int hundred= number/100;
			//System.out.println(hundred);
		number = number-(hundred*100);
		int tens= number/10;
			//System.out.println(tens);
		number = number-(tens*10);
		int ones= number;
			//System.out.println(ones);
			
		
		if(thousand==1) {
			romanNum=romanNum+"M";
		}
		else if (thousand==2) {
			romanNum=romanNum+"MM";
		}
		else if (thousand==3) {
			romanNum=romanNum+"MMM";
		}
		else {
		}
		
		
		
		if(hundred==1) {
			romanNum=romanNum+"C";
		}
		else if (hundred==2) {
			romanNum=romanNum+"CC";
		}
		else if (hundred==3) {
			romanNum=romanNum+"CCC";
		}
		else if (hundred==4) {
			romanNum=romanNum+"CD";
		}
		else if (hundred==5) {
			romanNum=romanNum+"D";
		}
		else if (hundred==6) {
			romanNum=romanNum+"DC";
		}
		else if (hundred==7) {
			romanNum=romanNum+"DCC";
		}
		else if (hundred==8) {
			romanNum=romanNum+"DCCC";
		}
		else if (hundred==9) {
			romanNum=romanNum+"CM";
		}
		else {
		}
		
		
		
		
		if(tens==1) {
			romanNum=romanNum+"X";
		}
		else if (tens==2) {
			romanNum=romanNum+"XX";
		}
		else if (tens==3) {
			romanNum=romanNum+"XXX";
		}
		else if (tens==4) {
			romanNum=romanNum+"XL";
		}
		else if (tens==5) {
			romanNum=romanNum+"L";
		}
		else if (tens==6) {
			romanNum=romanNum+"LX";
		}
		else if (tens==7) {
			romanNum=romanNum+"LXX";
		}
		else if (tens==8) {
			romanNum=romanNum+"LXXX";
		}
		else if (tens==9) {
			romanNum=romanNum+"XC";
		}
		else {
		}
		
		
		
		if(ones==1) {
			romanNum=romanNum+"I";
		}
		else if (ones==2) {
			romanNum=romanNum+"II";
		}
		else if (ones==3) {
			romanNum=romanNum+"III";
		}
		else if (ones==4) {
			romanNum=romanNum+"IV";
		}
		else if (ones==5) {
			romanNum=romanNum+"V";
		}
		else if (ones==6) {
			romanNum=romanNum+"VI";
		}
		else if (ones==7) {
			romanNum=romanNum+"VII";
		}
		else if (ones==8) {
			romanNum=romanNum+"VIII";
		}
		else if (ones==9) {
			romanNum=romanNum+"IX";
		}
		else {
		}
		
		
		
		JOptionPane.showMessageDialog(null, romanNum);
		
	}
	
}
