package java0629;

public class D0627_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ǹ� if , switch
		
		//�ݺ��� for , while , do~while
		
		//if���� ���ǽ� - �񱳿����ڿ� �������ڷ� ���� �����.
		//			   ��, �� �� ������ ���� �� �ִ� �˽�

		// Ű�� 150 �̻��̴�.      Ű>=150;
		// 10�� ���� ���� ����      ��ü ���⳯¥ �� ==10
		//32000�� �̻��� ���⳻��    ����ݾ� <=32000
		// �Ǹ����� ��ǰ�鸸 ���     ��ǰ���� == �Ǹ� , ������ > 0;
		
		
		int tall = 135;
		if(tall >= 150) {
			//Ű�� 150�̻��� �´ٸ� ������ �� ������
		}else {
			//Ű�� 150�̻��� �ƴ϶�� ������ �� ������
		}
		
		// ���� �հ� ���� - �հ�(60���̻�),���հ�(60���̸�)
		
		int score = 72;
		if(score >= 60){
			System.out.print("�հ�");
		}else {
			System.out.print("���հ�");
		}
		
		
		//if~else - ���ǽ��� ��,������ ���� ����Ǵ� ������ �ٸ����
		// �ϳ��� ���ǿ� �ΰ��� ������ �ִ� ��쿡 if~else ������ �ۼ�
		
		
		score = 89;
		if(score >= 90 ) {
			System.out.print("A");
		}else if(score>=80) {
			System.out.print("B");
		}else {
			System.out.print("C");
		}
		
		
		
		//switch - ���� ������ case�� �����Ͽ�
		//         case�� ��ġ�ϴ� ���� ��� �ߵ��Ǵ� ���ǹ�
		
		// �����̰����� �����. ����Ű�� w,a,s,d �̰�
		//pŰ�� �Ͻ����� oŰ�� ����ϱ� iŰ�� ó�����ʹٽý���
		//ctrl.s�� ���ӽ����̶�� �Ѵٸ�
		
		/*
		 
		 
		 switch(Ű���尪){
		 	case 'a': ���೻��
		 	case 'w': ���೻��
		 	case 's': ���೻��
		 	case 'd': ���೻��
		 	case 'p': ���೻��
		 	case 'o': ���೻��
		 	case 'i': ���೻��
		 	case 'ctrl':
		 		switch(Ű2){
		 			case 's':
		 			}
		 			
		 			
		 	}
		 	
		 	
		 	���α׷��� �޴� ����
		 	
		 	
		 		switch(menu){
		 			case "open":
		 			case "save":
		 			case "build":
		 			case "git":
		 			case "exit":
		 			
		 		}
		 		
		 	
		 		
		 		
		 
		 
		 
		 
		 
		 
		 */
		
		
		String button = "����";
		
		switch(button) {
		case"����":
			System.out.println("���ӽ���");
			
		case "����":
			System.out.println("��������");
			break;
		case "����":
			System.out.println("��������");
		}
		
		//
		
		
		
	}

}
