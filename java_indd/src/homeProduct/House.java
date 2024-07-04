package homeProduct;

public class House {
	
	boolean onOff;
	String brand;
	
	
	House(){
		this.onOff=false;
	}
	void power() {
		this.onOff = !this.onOff;
		System.out.println("Tv Àü¿ø "+this.onOff);
	}
}
