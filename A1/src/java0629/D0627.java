package java0629;

public class D0627 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �����
		// ��������� + , - , * , / , %(������)
		
		System.out.println(10/(float)4);
		
		// ���������� ++ , --
		// ���Կ����� =
		// ���մ��Կ����� += , -= , *= , /= , %=
		int a=10;
		a += 3; //a = a+3
		
		//�񱳿����� > , < , >= , <= , == , !=
		System.out.println(10 == 20);
		
		//�������� && , || , !
		//���ǿ����� (���ǽ�)? ������ : ��������
		
		
		// ��Ʈ������
		// ��Ʈ �� ������  & , | , ~ , ^
		// ��Ʈ ����Ʈ ������ >> , << 
		
		System.out.println( 34&15 );
		System.out.println( 42 | 21  );
		System.out.println( 42 ^ 30 );
		System.out.println( ~13 );
		
		
		int red = 188;
		int green = 229;
		int blue = 92;
		
		int color = (red << 16) | (green << 8 ) | blue;
		System.out.printf("#%06X \n", color);
		//rgb���� ����ڵ�� ��ȯ
		
		

	}

}
 