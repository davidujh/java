package java0704;

import java.util.Scanner;

public class D0704_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//��ǻ�Ϳ� ���������� �ϱ�
		// ��ǻ���� ���������� ���� comInput�޼��带 ����Ѵ�.
		// ������ ������������ �ѱ۷� �Է��Ѵ�.
		// ��,��,��,�� ���� ����Ѵ�.
		// �޼��� - ���� ���������� �Է��ϰ� �����ϴ� �޼���
		//      - ��ǻ�Ϳ� ���Ͽ� ��� ����ϴ� �޼���
		//Game Ŭ������ �ʿ��� ������ �޼��� �ۼ�
		//main�޼��忡���� Game Ŭ���� ��ü�� �޼��常 ����
		
		Game game = new Game();
		
		
		game.play();
		
		
		
		
		
	}

}
class Game{//rock-paper-scissors ����
	String com;
	String user;
	
	void play() {
		userInput();
		comInput();
		out();
	}
	
	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����������! : ");
		this.user = sc.nextLine();
		
	}
	
	
	void comInput() {
		int temp = (int)(Math.random()*3);
		switch(temp) {
		case 0: this.com="����";break;
		case 1: this.com="����";break;
		case 2: this.com="��";break;
		
		
		}
	}
	
	void out() {
		System.out.print("��ǻ�� �� : "+com+"\n");
		if(com.equals(user)) {
			System.out.println("���º�!");
		}else if(com.equals("����")&& user.equals("����")||
				 com.equals("����") && user.equals("��")||
				  com.equals("��") && user.equals("����")) {
			System.out.print("��ǻ�� ��!");
		}else if(user.equals("����")&& com.equals("����")||
				 user.equals("����") && com.equals("��")||
				 user.equals("��") && com.equals("����")) {
			System.out.print("���� ��!");
	
		}else {
			
		}
		
	}
	
}