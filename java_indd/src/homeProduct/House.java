package homeProduct;

public class House {
	
	boolean onOff;
	String brand;
	
	
	House(){
		this.onOff=false;
	}
	void power() {
		this.onOff = !this.onOff;
		System.out.println("Tv ���� "+this.onOff);
	}
}
