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
		
		// ����,����,���� �������� ������ ���ϴ� �޼���
		// ������ ����� ���ϴ� �޼���
		// ������ ����� ����ϼ���
		
		
		int total = rm.total();
		int avg = rm.avg(tot);
		
		
		System.out.print("������ : "+total+"\n����� : "+total);
		

	}

}


class ReturnMth{
	
	int avg(int tot) {
		
		return tot/3;
	}
	int total() {
		int kor=99,mat=98,eng=100;
		int result = (kor+mat+eng);
		return result;
	}
	
	
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