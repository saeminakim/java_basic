package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;		
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		// customer�� �ִ� order�޼ҵ尡 ��� ȣ���
		// �ֳĸ� customer�� Customer Ÿ������ �����Ʊ� ����
		customer.order();
		buyer.order();
		seller.order();
	}

}
