package java_modifier;

public class Modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book = new Book();
		book.setTitle("JAVa 속성");
		book.setAuthor("유재학");
		book.setPage(786);
		
		System.out.print(book.getTitle());
		Book book2 = new Book("JAVA,웹,성공적","이병헌",564);
		
		System.out.println(book2);
	}

}
/*
   -변수,메서드
   -인스턴스, 클레스
   -생성자메서드
   -초기화
   -인스턴스변수,클래스 변수 초기화
   -오버로딩
   -오버라이딩
   -상속
   -제어자
   -다향성
   -추상화
   
컬랙션 - 자료구조와 알고리즘
     - collection, List,Map,Set
     - ArrayList,Vector,LinkedList,
     - Queue, stack, HashSet,TreeSet,
     - HashMap,TreeMap 등등등...
     
     
     
제네릭
애너테이션
스트림
쓰레드
JAVA 기본 문법 끝

-> JSP - 내장객체, M V C패턴
-> 스프링프레임워크 - 스트링부트
-> MVC 패턴 -> 간단한 쇼핑몰 사이트
-> 프로잭트(웹) - TEAM 
*/