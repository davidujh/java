package homeProduct;

public abstract class House {
	
	protected boolean onOff;
	protected String brand;
	protected int price;
	
	protected House(){
		this.onOff=false;
	}
	protected House(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
	
	protected abstract void power();// 추상메서드
	
	
}

// 추상클래스 - class 앞에 abstract를 붙인다.
// 추상클래스 객체 생성 불가
// 추상 메서드를 가지고 있는 클래스는 반드시 추상 클래스가 있어야 한다.
// 부모

