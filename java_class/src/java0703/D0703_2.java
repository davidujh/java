package java0703;

public class D0703_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�޼��带 ���ؼ� ���� 10�� �޾� ����ϱ�
		
		ReturnMth rm = new ReturnMth();
		int num = rm.get();
		System.out.println( num );   
		
		
		int ��� = rm.sum();
		System.out.print(���);
	
		//
		String userName = rm.getName();
		int age=34;
		System.out.println(userName+" "+age);

	}

}

class ReturnMth{
	String getName(){
		String name ="�̼���";
		return name;
	}
	int sum() {
		int num1 = 30,num2 =45;
		int result =num1+num2;
		return result;
	}
	int get() {
		return 10;
		
	}
	
}