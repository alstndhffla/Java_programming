package gameLevel;

public class MainBoard {
	public static void main(String[] args) {
		//처음 생성하면 비기너 레벨.
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	
	}
}
