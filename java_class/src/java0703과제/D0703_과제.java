package java0703����;

import java.util.Scanner;

public class D0703_���� {
	
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.init();
		game.diceThrow();
		game.result();
	}


	
		// TODO Auto-generated method stub
		
		
		/*
		 �ֻ��� ����
		 J���ذ� s�����̰� �ֻ��� ������ �Ѵ�.
		 �ֻ����� �ϳ�,�����̴�
		 �ֻ����� ���� ū ����� �̱��.
		 
		 �ֻ��� �� ���ϴ� �޼���(�������� �ֻ��� ������ �޼���,�Ű������ʿ����,��ȯ�� �ʿ���)
		 
		 �ֻ��� �� ���Ͽ� ���� �̰���� ����ϴ� �޼���
		 (���ذ� �������� �ֻ��� ���� ���� �Ű����� �ʿ���, ���� �̰���� ���,��ȯ�� �ʿ����)
		 
		 */
//		Random random = new Random();
//		int �����ֻ��� = random.�����ֻ���();
////		random.�����ֻ���();
//		int �����ֻ��� = random.�����ֻ���();
////		random.�����ֻ���();
//		
//		
//		System.out.println("���� �ֻ��� �� : "+�����ֻ���);
//		System.out.println("���� �ֻ��� �� : "+�����ֻ���);
//		random.��(�����ֻ���, �����ֻ���);
		DiceGame game = new DiceGame();
//		game.init();
	}



class DiceGame{
	String[] names;
	int[] diceNum;
	
	
	void init(){
		Scanner sc =new Scanner(System.in);
		System.out.print("�ֻ��� ���� �����ο� : ");
		int cnt = sc.nextInt();
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
		sc.nextLine();
		for(int i=0; i<names.length; i++) {
			System.out.print("������ �̸� : ");
			names[i] = sc.nextLine();
		}
		 
	}
	void diceThrow() {
		for(int i=0; i<names.length; i++) {
			this.diceNum[i] =(int)(Math.random()*6)+1;
			System.out.println(this.names[i]+"�ֻ��� : "+this.diceNum[i]);
		}
	}
	
	void result() {//�ֻ��� ��� - �ֻ��� ���� ũ�� �̱��.
		int max=0;
		for(int num : diceNum) {
			if (max < num )max=num;
			
		}
		boolean isSame = true;
		for(int num : diceNum) {
			if(num!=max) isSame=false;
			
		}
		if(isSame) {
			System.out.println("��� �������� �ֻ��� ���� ���� - ���");
			return;
		}
		for(int i=0; i<diceNum.length;i++);
		if(diceNum[i]==max) {
			System.out.println(names[i]+" ��!");
		}
		
	}
}




//class Random{
//	void ��(int ����,int ����) {
//		if(����<����) {
//			System.out.println("���� ��!");
//		}else if(����>����) {
//			System.out.println("���� ��!");
//		}else {
//			System.out.println("���º�!");
//		}
//		
//	}
//	
//	int �����ֻ���() {
//		int �ֻ���2 =(int)(Math.random()*6)+1;
//		return �ֻ���2;
//	}
//	
//	int �����ֻ���() {
//		int �ֻ���1 = (int)(Math.random()*6)+1;
//		return �ֻ���1;
//	}
//	
//}
