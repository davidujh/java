package java0701;

import java.util.Arrays;

public class D0701_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ���� �����͸� �ٷ궧�� �迭�� ����Ѵ�
		//��Ȳ�� ���󼭴� �迭�� ���� �ȵǴ� ��쵵 ������
		//������ �迭�� ������ �����͸� �����Ѵ�
		
		//�����迭 �����!
		//�⺻�� �迭 ũ�⸦ �ø��ų� �ٿ��� ����ϴ� �迭
		
//		int[] a =new int[5];
//		
//		a[0]=10; a[1]=20; a[4]=40;
//		a[5]=100;
		
		
		
		int[] num = new int[] {10,20,30,40,50};
		System.out.println("ũ������ �� : "+Arrays.toString(num));
		
		// �����͸� �߰��� �� �����Ϸ��� �迭�� ũ�⸦ �÷����Ѵ�.
		int size =num.length;//�����迭�� ũ��
		
		int[] temp =new int[size+1];
		for(int i=0; i<size; i++) {
			temp[i] = num[i];
		}
		
		num = temp;
		num[5]=60;
		System.out.println("ũ�� ���� �� : " + Arrays.toString(num));

	}

}
