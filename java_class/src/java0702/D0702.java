package java0702;
 	
public class D0702 { 	
	
	public static void main(String[] args) { 	
		// TODO Auto-generated method stub 	
		
		//class �̸� ù���ڴ� �빮�� ex)Scanner  String   Arrays ,,,,		
		
		 
		//���ǵ� Ŭ���� Ÿ���� ������ �����Ѵ�.
		//������ ������ �����͸� �����Ѵ�.
		//Ŭ���� Ÿ������ ������ ������ ��ü �Ǵ� �ν��Ͻ���� �Ѵ� -��Ȯ�� ���� �ν��Ͻ�.
		
		
		//new ������ڸ� ����� ����Ǵ� ������ ���� ���������̴�.(��ü)
		
		// Ŭ���� �ν��Ͻ� ���� - 
		Member member1 = new Member();
		Member member2 = new Member();

		member1.name ="�̼���";
		member1.age = 23;
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		
		member2.name = "������";
		member2.age = 34;
				
		System.out.println(member2.name);
		System.out.println(member2.name);
		
		
		//java -495p, �޸�����ȭ��� - 893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title ="�޸�����ȭ���";
		book2.page = 893;
		
		System.out.println(book1.title);
		
	
		//����Ʈ�� ��ǰ��,�ü��,�޸�(ram)ũ�� �� ����
		//������ �� �ִ� Ŭ������ �����ϰ� �ν��Ͻ��� �����Ͽ�
		// �� ����, ����� �ϼ���(����Ʈ�� 3��)
		
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		
		phone1.name="������ 11";
		phone1.system="iOS";
		phone1.ram=4;
		
		phone2.name="�Ｚ ������ ��Ʈ5";
		phone2.system="�ȵ���̵�";
		phone2.ram=6;
		
		
		System.out.println("��ǰ�� : "+phone1.name);
		System.out.println("�ü�� : "+phone1.system);
		System.out.println("�޸� ũ�� : "+phone1.ram);
		
		System.out.println("��ǰ�� : "+phone2.name);
		System.out.println("�ü�� : "+phone2.system);
		System.out.println("�޸� ũ�� : "+phone2
				.ram);
		
		
		
		
				
		
	} 	 	 	 	
	
	  		  	 	
	 	 	 	 	 	 	 			
}

//å ����� ������������ �����ϱ� ���� Ŭ���� ����
class Book{
	String title;
	int page;
}

//Ŭ���� - ���赵, ��ü -��ǰ
//Ŭ���� - �ؾ, ��ü -�ؾ


// Ŭ������ ����� ���� ������ Ÿ���̶�� �Ѵ�.
class Member{ // Member �ϴ� �̸��� Ŭ���� ����
	String name;//�̸�
	int age;//����
	
}

class Phone{
	String name;
	String system;
	int ram;
}










 	 	 	 	