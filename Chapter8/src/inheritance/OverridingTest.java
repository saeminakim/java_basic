package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer(10010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "���̰�, " + customerLee.showCustomerInfo());
		
		Customer customerKim = new VIPCustomer(10010, "Kim", 100);
		price = customerKim.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "���̰�, " + customerKim.showCustomerInfo());
		*/
		
		Customer customerWho = new VIPCustomer(10010, "Who", 100);
		int price = customerWho.calcPrice(10000);
		System.out.println("���� �ݾ��� " + price + "���̰�, " + customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
		customerGold.calcPrice(price);
	}
	

}
