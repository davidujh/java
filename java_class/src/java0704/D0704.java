package java0704;

import java.util.Scanner;

public class D0704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//�α��� ������ ���̵�� skyblue, ��й�ȣ�� 1234sea
		//login �޼��带 �����Ͽ� �α��� ���θ� ����ϼ���.
		//���̵� ��й�ȣ�� ��ġ�ϸ� �α��� ���� ���
		//�ϳ��� ����ġ�ϸ� �α��� ���� ���
		//�α��� ���� ����� main���� 
	
		MethodUtil util = new MethodUtil();
		
//		
//		boolean isFail = util.login();
//		if(isFail) {
//			System.out.print("�α��� ����!");
//		}else {
//			System.out.print("�α��� ����!");
//		}
//		
		
		// ���� ���Ը� Ű���带 ���� �Է¹������� 
		// �Է��� �� ������ ���� 100�� ������ 
		// 100 - ���� ����� ����ϰ�
		// 100�� ���� ������ �� ������ ���� ����ϼ���
		// ���� �޼��忡�� ���
		int Math = util.math();
		
		System.out.print(Math);
		
	}

}
class MethodUtil{
	int math() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		System.out.print("����° ���� : ");
		int num3 = sc.nextInt();
		int total =(num1+num2+num3);
		if(total>100) {
			return 100-total;
		}else {
			return total;
		}
		
	}
	

//	boolean login(){
//		Scanner sc = new Scanner(System.in);
//		System.out.print("���̵� : ");
//		String id = sc.nextLine();
//		System.out.print("��й�ȣ : ");
//		String password = sc.nextLine();
//		if(id.equals("skyblue") && password.equals("1234sea")) {
//			return true;
//		}else {
//			return false;
//		}		
		
		
		
						
}
