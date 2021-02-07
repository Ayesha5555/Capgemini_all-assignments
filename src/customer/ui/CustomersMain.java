package customer.ui;

import customer.beans.*;

public class CustomersMain {
	public static void main(String args[]) {
		CustomersMain run = new CustomersMain();
		run.start();
	}

	public void start() {
		Customer customers[] = new Customer[4];
		Account account1 = new Account(1, 100.6);
		Account account2 = new Account(2, 200.7);
		Account account3 = new Account(3, 300.8);
		Account account4 = new Account(4, 400.9);
		ItCustomer itCustomer1 = new ItCustomer(1, "Ayesha", account1, "dell");
		ItCustomer itCustomer2 = new ItCustomer(2, "Sivaa", account2, "hp");

		CreditCustomer creditCustomer1 = new CreditCustomer(3, "Ira", account3, 2309);
		CreditCustomer creditCustomer2 = new CreditCustomer(4, "Irfan", account4, 4000);

		customers[0] = itCustomer1;
		customers[1] = itCustomer2;
		customers[2] = creditCustomer1;
		customers[3] = creditCustomer2;
		for (int i = 0; i < customers.length; i++) {
			Customer iteratedCustomer = customers[i];
			if (iteratedCustomer instanceof ItCustomer) {
				ItCustomer itCustomer = (ItCustomer) iteratedCustomer;
				displayCustomer(itCustomer);
			}
			if (iteratedCustomer instanceof CreditCustomer) {
				CreditCustomer creditCustomer = (CreditCustomer) iteratedCustomer;
				displayCustomer(creditCustomer);
			}
		}
	}

	void displayBaseCustomer(Customer customer) {
		int id = customer.getId();
		String name = customer.getName();
		Account account = customer.getAccount();
		int accountId = account.getAccountId();
		double totalExpense = account.getTotalExpense();
		System.out.println("Customer " + id + " " + name);
		System.out.println("Account is  " + accountId + " " + totalExpense);
	}

	void displayCustomer(ItCustomer customer) {
		displayBaseCustomer(customer);
		String laptop = customer.getlaptop();
		System.out.println("laptop is " + laptop);
	}

	void displayCustomer(CreditCustomer customer) {
		displayBaseCustomer(customer);
		double creditToken = customer.getcreditToken();
		System.out.println("credit is " + creditToken);
	}
}
