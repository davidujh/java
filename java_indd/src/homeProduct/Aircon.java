package homeProduct;

public class Aircon extends House {
		
	static final String[] windText= {"��","��","��"};
	
	int wind=0;
	int temperature;
	
	
	Aircon(){}
	Aircon(String brand, int price){
		super(brand,price);
		
		
	}
	
	void tempUP() {
		
	}
	void tempDOWN() {
		
	}
	
	void windControl() {
		if(wind== windText.length)wind=0;
		wind++;
		System.out.print("���� �ٶ����� : "+windText[wind]);
	}
	
	@Override
	void power() {
		super.onOff = !super.onOff;
		System.out.println("���� "+this.onOff);
	}
}
