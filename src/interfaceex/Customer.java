package interfaceex;

public class Customer implements Buy, Sell{
	
	//인터페이스에 구현된 메서드를 오버라이드를 통해 재정의해서 사용
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("buy something");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("sell something");
	}

}
