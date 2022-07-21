package This_constructor;

public class Car {
	String color;
	String company;
	String type;
	
	Car(){
		this("white","기아","경차");
	}
	
	Car(String color,String compnay,String type){
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	Car(String company,String type){
		this("white",company,type);
	}
	
	Car(String type){
		this("white","기아",type);
	}
	//override 다시 물어보기
	public String toString() {
		return color + " - " + company + " - " + type;
	}
}
