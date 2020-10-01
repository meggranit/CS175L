/**
A bank account has a balance and a mechanism for
applying interest or fees at the end of the month.
*/
public class BankAccountModify
{
private double balance;
private double interestPct;


/**
   Constructs a bank account with zero balance.
*/
public void BankAccount(double amount, double interest)
{
   balance = amount;
   interestPct= interest;
   System.out.println("Your initial balance is "+balance);
   System.out.println("The interest percentage is " + interestPct);
   
   
}

/**
   Makes a deposit into this account.
   @param amount the amount of the deposit
*/
public void deposit(double amount)
{
   balance = balance + amount;
   System.out.println("You deposited "+ amount);
   System.out.println("Your new balance is "+ balance);
   
}

/**
   Makes a withdrawal from this account, or charges a penalty if
   sufficient funds are not available.
   @param amount the amount of the withdrawal
*/
public void withdraw(double amount)
{
   if(amount > balance) {
	   System.out.print("Insufficient Funds to support withdrawl");
   }
   else {
	   balance = balance - amount;
	   System.out.println("You withdrew "+amount);
	   System.out.println("Your new balance is "+balance);
	   
   }
}


public double calcInterest() {
	return (balance* interestPct);
	
}


/**
   Gets the current balance of this bank account.
   @return the current balance
*/
public double getBalance()
{
   return (balance-(balance*interestPct));
}
}


