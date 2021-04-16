package abstractex;

public class AutoCar extends Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("차가 달립니다.");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("휘발유를 주유합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("승용차가 멈췄습니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
}
