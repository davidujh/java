package java_modifier;

public class Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		book.setTitle("JAVa �Ӽ�");
		book.setAuthor("������");
		book.setPage(786);
		
		System.out.print(book.getTitle());
		Book book2 = new Book("JAVA,��,������","�̺���",564);
		
		System.out.println(book2);
	}

}
/*
   -����,�޼���
   -�ν��Ͻ�, Ŭ����
   -�����ڸ޼���
   -�ʱ�ȭ
   -�ν��Ͻ�����,Ŭ���� ���� �ʱ�ȭ
   -�����ε�
   -�������̵�
   -���
   -������
   -���⼺
   -�߻�ȭ
   
�÷��� - �ڷᱸ���� �˰���
     - collection, List,Map,Set
     - ArrayList,Vector,LinkedList,
     - Queue, stack, HashSet,TreeSet,
     - HashMap,TreeMap ����...
     
     
     
���׸�
�ֳ����̼�
��Ʈ��
������
JAVA �⺻ ���� ��

-> JSP - ���尴ü, M V C����
-> �����������ӿ�ũ - ��Ʈ����Ʈ
-> MVC ���� -> ������ ���θ� ����Ʈ
-> ������Ʈ(��) - TEAM 
*/