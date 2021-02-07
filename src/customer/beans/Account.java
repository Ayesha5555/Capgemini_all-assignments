package customer.beans;

public class Account {
	private int accountId;
	private double totalExpense;

	public Account(int id, double expense) {
		this.accountId = id;
		this.totalExpense = expense;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public double getTotalExpense() {
		return totalExpense;
	}

	public void setTotalExpense(double totalExpense) {
		this.totalExpense = totalExpense;
	}
}
