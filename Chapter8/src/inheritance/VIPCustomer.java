package inheritance;

public class VIPCustomer extends Customer{

	private int agentID;
	private double saleRatio;
	
//	public VIPCustomer() {
//		// super(); 컴파일러가 알아서 상위 클래스를 호출하기 위한 super()키워드를 넣어줌
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		
//		System.out.println("VIPCustomer() 호출");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		// 만약 상위 클래스에서 매개변수가 있는 생성자를 사용한다면
		// 아래처럼 명시적으로 super 클래스 호출
		super(customerID, customerName); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer(int, string) 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}

}
