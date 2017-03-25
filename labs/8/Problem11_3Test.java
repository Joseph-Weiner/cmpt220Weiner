package Lab8;
import Lab8.Problem11_3;
import Lab8.Problem11_3.Account;
import Lab8.Problem11_3.Account.CheckingAccount;
public class Problem11_3Test {

	public static void main(String[] args) {
		// Create Account, SavingsAccount and Checking Account objects
				Problem11_3.Account account = new Problem11_3.Account(1122, 20000);
				Account savings = new Account(1001, 20000);
				CheckingAccount checking = new CheckingAccount(1004, 20000, -20.0);
				// Set annual interest rate of 4.5%
				account.setAnnualInterestRate(4.5);
				savings.setAnnualInterestRate(4.5);
				checking.setAnnualInterestRate(4.5);

				// Withdraw $2,500
				account.withdraw(2500);
				savings.withdraw(2500);
				checking.withdraw(2500);

				// Deposit $3,000
				account.deposit(3000);
				savings.deposit(3000);
				checking.deposit(3000);

				// Invoke toString methods
				System.out.println(account.toString());
				System.out.println(savings.toString());
				System.out.println(checking.toString());

	}

}
