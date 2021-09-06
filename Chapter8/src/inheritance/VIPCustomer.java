package inheritance;

public class VIPCustomer extends Customer{

	private int agentID;
	private double saleRatio;
	
//	public VIPCustomer() {
//		// super(); �����Ϸ��� �˾Ƽ� ���� Ŭ������ ȣ���ϱ� ���� super()Ű���带 �־���
//		customerGrade = "VIP";
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		
//		System.out.println("VIPCustomer() ȣ��");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		// ���� ���� Ŭ�������� �Ű������� �ִ� �����ڸ� ����Ѵٸ�
		// �Ʒ�ó�� ��������� super Ŭ���� ȣ��
		super(customerID, customerName); 
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		
		System.out.println("VIPCustomer(int, string) ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}

}
