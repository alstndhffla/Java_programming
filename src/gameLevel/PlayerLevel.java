package gameLevel;

public abstract class PlayerLevel {
	
	// 각 레벨마다 메서드는 조금씩 다르게 구현되기 때문에 추상 메서드로 선언한다.
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//재정의되면 안되므로 final 선언.
	//go() 메서드의 경우는 시나리오대로 수행되어야 하므로 코드내용을 완전히 구현함.
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
