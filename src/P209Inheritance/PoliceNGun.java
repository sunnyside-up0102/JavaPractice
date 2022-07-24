package P209Inheritance;

// Police has a Gun. -> 성립

class PoliceNGun {
	String kind;
	int shootCnt;
	public void Gun(String kind) {
		this.kind = kind;
		this.shootCnt = 0;
	}
	public void bang() {
		this.shootCnt++;
		System.out.println("총알 발사");
	}
}

//class Police extends Gum{...// 상속 - 강결합 : 총을 늘 소지해야 한다.
class Police{
	PoliceNGun gun;
	
	public Police() {
		this.gun = null;
	}
	public void getGun(PoliceNGun gun) {
		this.gun = gun;
	}
	
	public PoliceNGun releaseGun() {
		PoliceNGun gun = this.gun;
		this.gun = null;
		return gun;
	}
	public int shootGun() {
		if(this.gun != null) {
			this.gun.bang();
			return this.gun.shootCnt;
		}
		else {
			System.out.println("지급된 총이 없다");
			return 0;
		}
	}
}

public class PoliceNGun{
	
	public static void main(String[] args) {
		Police pl = new Police();
		pl.shootGun();
		
		PoliceNGun revolver = new PoliceNGun("Revolver");
		pl.getGun(revolver);
		revolver = null;
		
		System.out.println("===권총 지급 완료===");
		pl.shootGun();
		pl.shootGun();
		
		System.out.println("===상황 종료 및 권총 반납===");
		revolver = pl.releaseGun();
		pl.shootGun();
	}
}