package entities;

public class BussinesAccount extends Account {

	private double loanLimit;

	public BussinesAccount() {
		super();
	}

	public BussinesAccount(int number, String holder, double balance, double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
			deposit(amount);
		}
	}
}
