package homeProduct;

public class Tv extends House{

	int channel; //ü��
	int vol; //�Ҹ�
	
	Tv(){
		super();
	}
	
	//�Ű����� �ִ� ������ �޼���
	Tv(String brand, int price){
		super(brand,price);// �θ�Ŭ���� ������ �޼��� ȣ��
	}
	
	void channelUp(){
		this.channel++;
	}
	void channelDown() {
		this.channel--;
	}
	
	
	@Override
	void power() {
		super.onOff = !super.onOff;
		System.out.print("TV ���� : "+ super.onOff);
	}
}

//�����ε��� - ������ �޼��带 �����ϴ°�
//�������̵���  ������ �޼��带 ������ �ϴ°�


//�������̵� ����
//�θ�Ŭ������ �ش� �޼��尡 �����ؾ��Ѵ�.
//�������̵� �޼���� �ݵ�� ��ȯŸ�� , �޼��� �̸�, �Ű����� ��� �Ȱ��� �ۼ��ؾ� �Ѵ�.
//�޼����� { } ������ �޶� �ȴ�