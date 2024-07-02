package java0702;
 	
public class D0702 { 	
	
	public static void main(String[] args) { 	
		// TODO Auto-generated method stub 	
		
		//class 이름 첫글자는 대문자 ex)Scanner  String   Arrays ,,,,		
		
		 
		//정의된 클래스 타입의 공간을 생성한다.
		//생성된 공간에 데이터를 저장한다.
		//클래스 타입으로 생성된 공간을 객체 또는 인스턴스라고 한다 -정확한 용어는 인스턴스.
		
		
		//new 연산사자를 사용해 저장되는 변수는 전부 참조변수이다.(객체)
		
		// 클래스 인스턴스 생성 - 
		Member member1 = new Member();
		Member member2 = new Member();

		member1.name ="이순신";
		member1.age = 23;
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		
		member2.name = "김유신";
		member2.age = 34;
				
		System.out.println(member2.name);
		System.out.println(member2.name);
		
		
		//java -495p, 메모리최적화기법 - 893p
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "java";
		book1.page = 495;
		
		book2.title ="메모리최적화기법";
		book2.page = 893;
		
		System.out.println(book1.title);
		
	
		//스마트폰 제품명,운영체제,메모리(ram)크기 에 대해
		//저장할 수 있는 클래스를 정의하고 인스턴스를 생성하여
		// 값 저장, 출력을 하세요(스마트폰 3개)
		
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		
		phone1.name="아이폰 11";
		phone1.system="iOS";
		phone1.ram=4;
		
		phone2.name="삼성 갤럭시 노트5";
		phone2.system="안드로이드";
		phone2.ram=6;
		
		
		System.out.println("제품명 : "+phone1.name);
		System.out.println("운영체제 : "+phone1.system);
		System.out.println("메모리 크기 : "+phone1.ram);
		
		System.out.println("제품명 : "+phone2.name);
		System.out.println("운영체제 : "+phone2.system);
		System.out.println("메모리 크기 : "+phone2
				.ram);
		
		
		
		
				
		
	} 	 	 	 	
	
	  		  	 	
	 	 	 	 	 	 	 			
}

//책 제목과 총페이지수를 저장하기 위한 클래스 정의
class Book{
	String title;
	int page;
}

//클래스 - 설계도, 객체 -제품
//클래스 - 붕어빵, 객체 -붕어빵


// 클래스는 사용자 정의 데이터 타입이라고 한다.
class Member{ // Member 하는 이름의 클래스 정의
	String name;//이름
	int age;//나이
	
}

class Phone{
	String name;
	String system;
	int ram;
}










 	 	 	 	