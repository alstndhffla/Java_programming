package inheritance;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	//디폴트 생성자
//	public Customer() {
//		customerGrade = "SILVER";	//기본등급
//		bonusRatio = 0.01;	// 보너스포인트 기본 적립 비율
//		System.out.println("Customer() 생성자 호출");
//	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;		
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은"+ customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다";		
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	// 생성자를 만들때마 손님이름과 아이디를 받야할 때 사용하는 메서드
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int, String) 생성자 호출");
	}
	
}
