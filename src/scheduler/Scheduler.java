package scheduler;

public interface Scheduler {
	//추상 메서드 선언(바디가 없음)
	// 스케줄러 인터페이스를 구현하는 각 클래스는 모두 추상 메서드 2개를 구현해야 한다.
	public void getNextCall();
	public void sendCallToAgent();
}
