
public class ThreadEx10 {

	public static void main(String[] args) {
		SmartPhoneGame game = new SmartPhoneGame();
		
		Player p1 = new Player();
		p1.setSmartPhoneGame(game, "Player1");
		
		Player p2 = new Player();
		p2.setSmartPhoneGame(game, "Player2");
			
		p1.start(); p2.start();
	}
}
class SmartPhoneGame {
	private int level;
	
	public int getLevel() {
		return this.level;
	}
	public  void increaseLevel() {
		synchronized (this) {
			while(true) {
				this.level ++;
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}
				System.out.println(Thread.currentThread().getName() + " Level : " + this.level);
				if(this.level == 5) {
					notifyAll();
					try {
						wait();
					} catch(InterruptedException e) {}
					break;
				}
				//레벨이 10의 배수가 되면 종료
				if(this.level %10==0)
					break;
			}
		}
		
	}
}

class Player extends Thread {
	private SmartPhoneGame game;
	public void setSmartPhoneGame(SmartPhoneGame game,String name) {
		this.setName(name);
		this.game = game;
	}
	@Override
	public void run() {
		game.increaseLevel();
		
	}
	
}