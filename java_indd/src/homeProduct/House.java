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
	
	protected abstract void power();// �߻�޼���
	
	
}

// �߻�Ŭ���� - class �տ� abstract�� ���δ�.
// �߻�Ŭ���� ��ü ���� �Ұ�
// �߻� �޼��带 ������ �ִ� Ŭ������ �ݵ�� �߻� Ŭ������ �־�� �Ѵ�.
// �θ�

