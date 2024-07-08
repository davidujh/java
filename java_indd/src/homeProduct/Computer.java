package homeProduct;

public class Computer {

	
	String wind;
	int temperature;
	
	
	Computer(){}
	Computer(String brand, int price){
		super(brand,price);
	}
	
	void windControl() {
		if(wind.equals("미") ) this.wind="약";
		else if(wind.equals("약")) this.wind="강";
		else if(wind.equals("강")) this.wind="미";
		}
}
