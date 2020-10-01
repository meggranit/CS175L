
public class BankAccountModifyTester {
	public static void main(String[] args){
		BankAccountModify myBankAccount= new BankAccountModify();
		myBankAccount.BankAccount(1000, .05);
		myBankAccount.calcInterest();
		myBankAccount.deposit(500);
		myBankAccount.withdraw(250);
		
		
		System.out.print("The amount of interest is ");
		System.out.println(myBankAccount.calcInterest());
		
		
		
		System.out.print("Your current balance is ");
		System.out.println(myBankAccount.getBalance());
		
	}

}
