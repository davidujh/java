package homeProduct;

public class Computer {

	
	String wind;
	int temperature;
	
	
	Computer(){}
	Computer(String brand, int price){
		super(brand,price);
	}
	
	void windControl() {
		if(wind.equals("��") ) this.wind="��";
		else if(wind.equals("��")) this.wind="��";
		else if(wind.equals("��")) this.wind="��";
		}
}
