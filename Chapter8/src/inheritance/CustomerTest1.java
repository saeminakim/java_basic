package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {

//		Customer lee = new Customer();
//		lee.setCustomerID(10100);
//		lee.setCustomerName("Lee");
		
		VIPCustomer kim = new VIPCustomer(10101, "Kim");
//		kim.setCustomerID(10101);
//		kim.setCustomerName("Kim");
		
		kim.bonusPoint = 1000;
		
//		System.out.println(lee.showCustomerInfo());
		System.out.println(kim.showCustomerInfo());
	}

}
