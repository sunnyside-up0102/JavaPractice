package P209Inheritance;

// Police has a Gun. -> ����

class PoliceNGun {
	String kind;
	int shootCnt;
	public void Gun(String kind) {
		this.kind = kind;
		this.shootCnt = 0;
	}
	public void bang() {
		this.shootCnt++;
		System.out.println("�Ѿ� �߻�");
	}
}

//class Police extends Gum{...// ��� - ������ : ���� �� �����ؾ� �Ѵ�.
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
			System.out.println("���޵� ���� ����");
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
		
		System.out.println("===���� ���� �Ϸ�===");
		pl.shootGun();
		pl.shootGun();
		
		System.out.println("===��Ȳ ���� �� ���� �ݳ�===");
		revolver = pl.releaseGun();
		pl.shootGun();
	}
}