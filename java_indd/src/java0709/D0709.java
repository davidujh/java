package java0709;

public class D0709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ȭ ���� 5�� �Է�
		
		
		
		Movie[] mv = new Movie[5];
		
		mv[0] = new Movie("���˵���","������",18);
		mv[1] = new Movie("�λ��̵�ƿ�2","�̽�",1);
		mv[2] = new Movie("Ż��","������",12);
		mv[3] = new Movie("������ŷ","�輺��",12);
		mv[4] = new Movie("Ȥ��Ż��","����",12);
		
		for( int i=0; i<mv.length; i++ ) {
			System.out.println(mv[i]);
		}
		
		for(Movie movie : mv) {
			System.out.println(movie);
		}
	}

}

/* 
 
 	
 	�迭�� ����
 	������ Ÿ��[] �������� = new ������Ÿ��[�迭ũ��]; 
 	
 	Movie[] mv = new Movie[10];
 	Movie Ÿ���� �������� 10�� �����Ȱ�
 	
 	mv[0] = new Movie();
 	mv[1] = new Movie();
 	
 	
 	int[] arr = new int[];
 	int Ÿ���� ���� 10�� ���� (int Ÿ������ ����� ���� 10�� �ִ°Ͱ� ���ٰ� ����.)
 	arr[0] =100;
 */

