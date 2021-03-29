package inheritance;

// 상속받음
public class VIPCustomer extends Customer{
	private int agentID;	//vip고객상담원 아이디
	double saleRatio;
	
//	public VIPCustomer() {
//		customerGrade = "VIP";	// 상위클래스에서 private 변수이므로 오류 발생한다. -> Customer.java의 private 를 protected 로 바꿔야함.
//		bonusRatio = 0.05;
//		saleRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
//	}
	
	//부모인 Customer 생성자가 매개변수를 받으므로 상속받은 자식 VIP 생성자도 매개변수를 받아야 한다.
	// vip 고객만을 위한 상담원id 까지 함께 지정한다.
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);	//상위 클래스 생성자 호출
		customerGrade = "VIP";	
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	
	//상위 클래스의 메서드를 재정의해 사용하기 - 오버라이딩
	@Override	// - 컴파일러에 재정의된 메서드라고 알려주는 것.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;	//보너스 포인트 적립
			return price - (int)(price * saleRatio);	//할인된 가격을 계산해 반환
	}
	
	
	
}
