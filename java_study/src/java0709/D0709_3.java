package java0709;

interface RestCustomer{// �Ĵ翡 ã�ƿ��� �մ�
	 //����մ�
	public void setCustomer(String customer);
	public String food();
}

class ReservCustomerA implements RestCustomer{	
	String customer;

	@Override
	public void setCustomer(String customer) {
		this.customer =customer;
		
	}

	@Override
	public String food() {
		return customer+ "û���� �ش�";
		
	}
}//����մ� A 
class ReservCustomerB implements RestCustomer{	
	String customer;

	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
		
	}

	@Override
	public String food() {
		return customer+"������ �ش�";
		
	}
}//����մ� B

class Owner {//����
	void food(ReservCustomerA cusA) {
		System.out.println(cusA.customer + "û���� �ش�");
	}
	void food(ReservCustomerB cusB) {
		System.out.println(cusB.customer + "������ �ش�");
	}
}




public class D0709_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Owner ow = new Owner();
		ReservCustomerA a = new ReservCustomerA();
		ReservCustomerB b = new ReservCustomerB();
		a.setCustomer("A-�̼���");
		b.setCustomer("B-�庸��");
		
		ow.food(a);
		ow.food(b);
		
	}

}


// �ʵ��л� , ���л� , ����л� , ���л�



//����� ��û ó�� Ŭ������ - ��Ʈ�� Ŭ����
// ����� ��û�� �ʿ��� ������ ���� �� ���� ���� Ŭ���� - ���� Ŭ����
// �����͸� �����ϴ� Ʋ���� - ����ڿ��� ������ ������ Ŭ���� - VO,DTO
//					  - �����ͺ��̽��� ������ ������ Ŭ���� - Entity

// �����ͺ��̽� ó�� �������̽� - repository
