package java0703;

import java.util.Scanner;

public class D0703_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//���� �ΰ� �Է¹޾� ���� ����ϱ�
		
		Calc calc = new Calc();
		calc.sum(40,10);
		
		
		//�� ������ ������ ���Ͽ� ����Ͻÿ�
		
		Total total = new Total();
		int kor= 89, eng=74, mat=43;
		total.scoretotal(kor, eng, mat);
		
		//�޼��� ȣ���Ͽ� "�޼��� dog����~" ������
		String dog = "�޼��� dog����~";
		calc.dog(dog);
		calc.nameAge();
		
		
		//�ż��带 ȣ���Ͽ� �̸��� ���̸� ����Ͻÿ�
		// �Ű������� ���� �ż���, Ű���带 �Է� x
		
		
		//�޼��带 ȣ���Ͽ� �Ʒ��� �����͸� ����ϼ���
		String animal="��縮Ʈ����";
		String ������="2024-07-01";
		
		TestMethod TestMethod = new TestMethod();
		TestMethod.Test(animal, ������);
		
		
		
		//���� ��¥ �߿��� ���� �ϸ� ����ϼ���
		//���ڿ� �޼��� substring �Ǵ� split ���
		Exam exam = new Exam();
		
		String examDate = "2024-08-13";
		exam.exam(examDate);;
		
		//�� ����� ���� ��հ��� ���Ͽ� ����ϼ���
		//��հ��� �����Դϴ�.
		int ���=31,����=23,����=28,���=37;
		exam.age(���, ����, ����, ���);
	}

}
class Exam{
	
	void age(int ���,int ����,int ����,int ���) {
		int avg = ((���+����+����+���)/4);
		System.out.print("\n�׸��� ���� ��� : "+avg);
	}
	
	void exam(String examDate) {
		
		System.out.print("���賯(��/��) : "+examDate.substring(5) );
	}
}
class TestMethod{
	
	void Test(String animal,String ������ ) {
		
		System.out.println("�� : "+animal+"\n������ : "+������); 
	}
	
}


//�ν��Ͻ� �޼���, �ν��Ͻ� ������ ��ü(�ν��Ͻ�)�� ���� ���
//Ŭ���� �޼���, Ŭ���� ������ Ŭ�����̸����� ���

class Total{
	void scoretotal(int kor,int eng, int mat) {
	int total = kor+eng+mat;
	System.out.println("���� : "+ total+"��");
	
	}
}


	
	
class Calc {
	void nameAge() {
		String name = "ȫ�浿";
		int age = 25 ;
		System.out.println("�̸� : "+name+"\n���� : "+age);
		
	}
	
	void dog(String d) {
		
		System.out.println(d);
	}
	
	void sum(int num1,int num2) {
		int result = num1+num2;
		System.out.println("�� : "+ result);
	}
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���� : ");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���� : ");
		int num2 =scan.nextInt();
		int result = num1+num2;
		System.out.println
		("�� : "+ result);
		
	}
}

