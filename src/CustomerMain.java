
class CustomerMain {

	public static void main(String[] args) {
		CustomerMain app = new CustomerMain();
		app.run();
	}

	void run() {

		Customer customers[] = new Customer[3];
		Customer customers1 = new Customer();
		customers1.id = 1;
		customers1.balance = 230.78;
		customers1.name = "abhinav";

		Customer customers2 = new Customer();
		customers2.id = 2;
		customers2.balance = 267.89;
		customers2.name = "sanskriti";

		Customer customers3 = new Customer();
		customers3.id = 3;
		customers3.balance = 301.09;
		customers3.name = "apoorva";

		customers[0] = customers1;
		customers[1] = customers2;
		customers[2] = customers3;

		for (int i = 0; i < customers.length; i++) {
			Customer iteratedCustomer = customers[i];
			displayDetail(iteratedCustomer);
		}
	}

	void displayDetail(Customer customer) {

		System.out.println("Customer id is:" + customer.id);
		System.out.println("Customer balance is:" + customer.balance);
		System.out.println("Customer name is:" + customer.name);

	}
}
