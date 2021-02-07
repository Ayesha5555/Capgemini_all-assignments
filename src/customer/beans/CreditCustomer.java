package customer.beans;

public class CreditCustomer extends Customer {
	private double creditToken;
	
	public CreditCustomer(int id,String name,Account account,double creditToken) {
		super(id,name,account);
		this.creditToken=creditToken;
		
	}
	public double getcreditToken() {
		return creditToken;
	}
	public void setcreditToken(double creditToken) {
		this.creditToken=creditToken;
	}
}
