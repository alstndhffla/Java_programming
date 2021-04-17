package interfaceex;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;	//만들어놓은 인터페이스를 클래스 삼아
		//Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형 변환.
		//buyer는 Buy 인터페이스의 메서드만 호출가능
		//생성한 클래스를 인터페이스형에 대입하여 사용하는 거임.
		buyer.buy();//buyer는 Buy 인터페이스의 메서드만 호출 가능.
		
		Sell seller = customer;
		seller.sell();
		
		//위에서 선언한 셀러 클래스가 customer 객체일 경우(instanceof:인스턴스오브), true or false 반환
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
	}
}
