package ��_9��_��������_3��;

interface Player {
	void play();
}
public class Exercise3{
	public  static void main(String[] args) {
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer(); 
		
		playGame(p1);
		playGame(p2);
	}
	public static void playGame(Player p) {
		p.play();
	}
}

class BaseBallPlayer implements Player {

	@Override
	public void play() {
		System.out.println("�౸ ������ �౸�౸");
	}
}

class FootBallPlayer implements Player {

	@Override
	public void play() {
		System.out.println("�߱� ������ �߱��߱�");
	}
}