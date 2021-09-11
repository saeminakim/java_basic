package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;		
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		// customer에 있는 order메소드가 모두 호출됨
		// 왜냐면 customer가 Customer 타입으로 생성됐기 때문
		customer.order();
		buyer.order();
		seller.order();
	}

}
