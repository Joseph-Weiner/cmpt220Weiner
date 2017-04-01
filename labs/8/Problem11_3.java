package Lab8;

import java.util.Date;

// JA: You should have created a toString in the Account class
public class Problem11_3 {
	// Copy the code from Lab6 problem 9.7 So we have the account class to work with
	public static class Account{
		int id = 0;
		double balance = 0;
		double annualInterestRate = 0;
		private Date dateCreated;
		
		//no arg constructor
		Account(){
			
		}
		
		Account(int newId, double newBalance) {
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
		}
		
		//accessor and mutator methods?
		
		public int getId(){
			return id;
		}
		public void setId(int id){
			this.id = id;
		}
		
		public double getBalance(){
			return balance;
		}
		public void setBalance(double balance){
			this.balance = balance;
		}
		
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
		// Set annualInterestRate
		public void setAnnualInterestRate(double newAnnualInterestRate) {
			annualInterestRate = newAnnualInterestRate;
		}
		
		public Date getDateCreated() {
			return dateCreated;
		}
		public void setDateCreated(Date dateCreated) {
			this.dateCreated = dateCreated;
		}
		
		//monthly interest
		public double getMonthlyInterestRate(){
			return annualInterestRate / 12;
			
		}
		//Return monthly interest
		public double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}

		// Decrease balance by amount
		public void withdraw(double amount) {
			balance -= amount;
		}

		// Increase balance by amount
		public void deposit(double amount) {
			balance += amount;
		}
		
		/**Now the checking account sub class*/
		public static class CheckingAccount extends Account {
			// Data fields
			private double overdraftLimit;

			// Construct a default CheckingAccount object
			public CheckingAccount() {
				super();
				overdraftLimit = -20;
			}

			// Construct a CheckingAccout with specified id, balance and overdraftLimit
			public CheckingAccount(int id, double balance, double overdraftLimit) {
				super(id, balance);
				this.overdraftLimit = overdraftLimit;
			}

			// Set a new overdraft limit 
			public void setOverdraftLimit(double overdraftLimit) {
				this.overdraftLimit = overdraftLimit;
			}

			// Return overdraft limit 
			public double getOverdraftLimit() {
				return overdraftLimit;
			}

			// Decrease balance by amount
			public void withdraw(double amount) {
				if (getBalance() - amount > overdraftLimit) {
					setBalance(getBalance() - amount);
				}
				else
					System.out.println("Error! Amount exceeds overdraft limit.");
			}

			// Return a String decription of CheckingAccount class
			public String toString() {
				return super.toString() + "\nOverdraft limit: $" + 
				String.format("%.2f", overdraftLimit);
			}
		}
		/**Now the savings account sub class*/
		public static class SavingsAccount extends Account {
			// Construct a default CheckingAccount object
			public SavingsAccount() {
				super();
			}

			// Construct a SavingsAccount with specified id, balance
			public SavingsAccount(int id, double balance) {
				super(id, balance);
			}

			// Decrease balance by amount 
			public void withdraw(double amount) {
				if (amount < getBalance()) {
					setBalance(getBalance() - amount);
				}
				else
					System.out.println(
						"Error! Savings account overdrawn transtaction rejected");
			}
		

		}

	
	}
}
		