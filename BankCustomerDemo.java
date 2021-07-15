
public class BankCustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCustomer customer1 = new BankCustomer();
		customer1.setCustomerName("Pallavi D");
		customer1.depositFunds(50);
		customer1.withdrawFunds(20);
		customer1.displayCustomerDetails();
		
		BankCustomer customer2 = new BankCustomer();
		customer2.setCustomerName("Rensi");
		customer2.depositFunds(0);
		customer2.withdrawFunds(200);
		customer2.setEmail("ppd5116@psu.edu");
		customer2.displayCustomerDetails();
	}
	
}
