package 제_9장_연습문제_3번;

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
		System.out.println("축구 선수가 축구축구");
	}
}

class FootBallPlayer implements Player {

	@Override
	public void play() {
		System.out.println("야구 선수가 야구야구");
	}
}