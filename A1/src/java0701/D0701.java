package java0701;

import java.util.Scanner;

public class D0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// �迭�� 20���� �������� ���� (�������� 1~30)
		// �迭�� ����� ������ �߿��� 5�� ����� ����� ����ϱ�!
		
		//		int random = (int)(Math.random()*30)+1;
		//		int [] a = new int[20];
		
		
//		int[] number = new int[20];
//		
//		for(int i=0; i<number.length; i++) {
//			number[i] = (int)(Math.random()*30)+1;
//		}
//		
//		int count =0;
//		for(int i=0; i<number.length; i++) {
//			if(number[i]%5 == 0 )
//				count++;
//		}
//		System.out.println("5�ǹ�� � ?" + count);
		
		//�迭 ������� , �迭�� ������ �����ϴ� ���,
		// �迭�� ����� ������ ���� �Ǵ� ���
		// �迭�� ���� = �������� �迭 - �ӵ��� ������ but ���������� ���� ���� �����Ŷ�� �迭 ����� ȿ���������� �ʴ�
		
		
		//����
		//1. 25�� ũ�⸦ ������ �迭 ����
		//2. �迭�� �������� ����
		//3. �ߺ����� ����
		//4. 25�� ���ڸ� ȭ�鿡 ���
		//5. ���ӽ��� - ���ڼ��� (�Է�)
		//6. ������ ���� ��ġ�� ǥ���ϱ�
		//7. ���� �������� Ȯ���ϱ�
		//8. ������ ȭ�鿡 ���
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] bingo =new int[25];
		
		for(int i=0; i<bingo.length; i++) {
			bingo[i] = (int)(Math.random()*50)+1;
			for(int k=0; k<i; k++) {
				if(bingo[k] == bingo[i]) {
					i--;break;
				}
			}
		}
		
		while(true) {
			for(int i=0; i<bingo.length; i++) {
				if(i%5==0)
					System.out.println();
				if(bingo[i] == 0)
					System.out.printf("%2c",'��');
				else
					System.out.printf(" %2d", bingo[i]);
			}
			
			System.out.print("\n���� ���� �Է� : ");
			int num = scan.nextInt();
			
			//������ ���� ǥ���ϱ�
			for(int i=0; i<bingo.length; i++) {
				if(num == bingo[i]) {
					bingo[i]=0; break;
				}
				
			}
			
			//5�� ����� ? ���� ����� 
			int ����=0, ����=0, �밢��1=0, �밢��2=0,end=0;
			
			for(int i=0; i<5; i++) {
				for(int k=0; k<5; k++) {
					if(bingo[i*5+k]==0) ����++;
					if(bingo[k*5+i]==0) ����++;
				}
				
				
				if(bingo[i*6] == 0)�밢��1++;
				if(bingo[i*4+4] == 0)�밢��2++;
				
				if(�밢��1 ==5)end++;
				if(�밢��2 == 5)end++;
				if(���� ==5)end++;
				if(���� ==5)end++;
				
				����=0;
				����=0;
			}
			
			if(end ==5) {
				System.out.println("5�� ���� �ϼ�!");
				break; //���ѷ��� ����
			}
		}
		
		
		
		
		
		
	}

}
