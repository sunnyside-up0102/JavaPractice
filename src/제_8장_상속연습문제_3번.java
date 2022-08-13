
public class 제_8장_상속연습문제_3번 {
	public class Character {
		int hp;
		int power;
		
		public void attack(Object target) {
			System.out.println("공격");
		}
	}
	
	class Warrior extends Character{
		int weapon;
		
	}
	public static void main(String[] args) {
		
	}

}
