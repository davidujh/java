package java0626;

import java.util.Scanner;

public class D0626_1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		/* �ڵ� �ۼ��ϱ� �� �ؾ��� �� - �����ľ�, �䱸���� ����
			���ڿ� - " " ū����ǥ�� ǥ���Ͽ� �ۼ��Ѵ�
				���ڿ��� String Ŭ���� Ÿ���� ����ؾ� �Ѵ�.
				
			����.2 
			���� �̸�, �Ҽ� �μ���, �� �޿����� Ű���带 ���� �Է¹޴´�.
			������ 8%�� ����. �Ǽ��ɾ��� ������ ���
			�̸�,�μ�,�Ǽ��ɾ��� ����ϼ���
			 
		
		 */
		String �����̸�,�ҼӺμ�,�����̸�1,�ҼӺμ�1;
		int ���޿���,���޿���1;
		
		System.out.print("ù��° �����̸� : ");
		�����̸� = scan.next();
		System.out.print("ù��° ���� �ҼӺμ� : ");
		�ҼӺμ� = scan.next();
		System.out.print("ù��° ���� ���޿��� : ");
		���޿���  = scan.nextInt();
		
		System.out.print("�ι�° �����̸� : ");
		�����̸�1 = scan.next();
		System.out.print("�ι�° �����ҼӺμ� : ");
		�ҼӺμ�1 = scan.next();
		System.out.print("�ι�° ���� ���޿��� : ");
		���޿���1  = scan.nextInt();
		
		int �Ǽ��ɾ�,�Ǽ��ɾ�1;
		�Ǽ��ɾ� = ���޿���-���޿���/100*8;
		�Ǽ��ɾ�1 = ���޿���1-���޿���1/100*8;
		 System.out.printf("\n\n�����̸� : %s \n�ҼӺμ� : %s \n�Ǽ��ɾ� %d \n\n\n", �����̸�,�ҼӺμ�,�Ǽ��ɾ�);
		 System.out.printf("�����̸� : %s \n�ҼӺμ� : %s \n�Ǽ��ɾ� %d \n", �����̸�1,�ҼӺμ�1,�Ǽ��ɾ�1);
		
		 
		 
		 /*
		   next() - �����̽�Ű, ��Ű, ����Ű�� ������ �Է� ��
		   nextLine() - ����Ű ������ �Է� ��
		  */
		
		
		
		
		
		
		
		
	}

}
