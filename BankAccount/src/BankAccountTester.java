
public class BankAccountTester {
	public static void main(String[] args){
		BankAccount myBankAccount= new BankAccount();
		myBankAccount.BankAccount(1000);
		myBankAccount.withdraw(500);
		myBankAccount.deposit(1500);
		
		
		System.out.println("Your balance is ");
		System.out.println(myBankAccount.getBalance());
		

		
	}
}
