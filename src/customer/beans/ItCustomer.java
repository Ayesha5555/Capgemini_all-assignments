package customer.beans;

public class ItCustomer extends Customer {
	private String laptop;

public ItCustomer(int id, String name,Account account,String laptop) {
	super(id,name,account);
	this.laptop=laptop;
}
public String getlaptop() {
	return laptop;
}
public void setLaptop(String laptop) {
	this.laptop=laptop;
}

}
