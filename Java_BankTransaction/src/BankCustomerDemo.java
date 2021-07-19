
public class BankCustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BankCustomer customer1 = new BankCustomer();
		customer1.setCustomerName("Pallavi D");
		customer1.depositFunds(50);
		customer1.withdrawFunds(20);
		customer1.displayCustomerDetails();
		
		BankCustomer customer2 = new BankCustomer();
		customer2.setCustomerName("Rensi");
		customer2.depositFunds(0);
		customer2.withdrawFunds(200);
		customer2.setEmail("ppd5116@psu.edu");
		customer2.displayCustomerDetails();*/
		System.out.println("Do you want to add new customers: ");
		Scanner sc = new Scanner(System.in);
		String ask = sc.nextLine();
		switch(ask) {
		case "yes": 
			String answer; //only enter yes, y , no , or n as input to this variable
			BankCustomer customer = new BankCustomer();
			float balance, amount;
			String name, email;
			balance = sc.nextFloat();
			name = sc.nextLine();
			email = sc.nextLine();
			customer.setBalance(balance);
			customer.setCustomerName(name);
			customer.setEmail(email);
			
			System.out.println("\nDo you want to deposit funds?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				System.out.println("\nEnter amount to deposit:");
				amount = sc.nextFloat();
				customer.depositFunds(amount);
			}
			
			System.out.println("\nDo you want to withdraw funds?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				System.out.println("\nEnter amount to withdraw:");
				amount = sc.nextFloat();
				customer.withdrawFunds(amount);
			}
			
			System.out.println("\nDo you want to display informations?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				customer.displayCustomerDetails();
			}
			
			break;
			
		case "no":
			System.out.println("\nLogging out of Bank Customer Records!!");
			break;
		default: System.out.println("Not a valid answer");
		}
	}
	
}
