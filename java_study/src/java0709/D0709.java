package java0709;

public class D0709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		move d = new dog();
		move c = new cat();
		c.moving();
		d.moving();

	}

}
class dog implements move{
	public void moving(){
		System.out.println("��ŭ ��ŭ �̵��Ѵ�");
	}
}
class cat implements move{
	public void moving() {
		System.out.println("��� ��� �̵��Ѵ�");
	}
}

interface move{
	static int a=10;
	public void moving();
}

/*
   	�������̽� - �߻�Ŭ������ �� ����
   	- �߻�޼��常 ����
   	- �ν��Ͻ� ���� �Ұ�
   	- static ����, static �޼��� ���𰡴�
   	- ��ü ���� �Ұ�
   	- Ŭ�����鿡 ����Ǿ� ���ȴ�
   	- ���⼺ ������ ���� ����Ѵ�.
*/