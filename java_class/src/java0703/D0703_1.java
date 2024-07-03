package java0703;

import java.util.Scanner;

public class D0703_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//정수 두개 입력받아 합을 출력하기
		
		Calc calc = new Calc();
		calc.sum(40,10);
		
		
		//세 과목의 총점을 구하여 출력하시오
		
		Total total = new Total();
		int kor= 89, eng=74, mat=43;
		total.scoretotal(kor, eng, mat);
		
		//메서드 호출하여 "메서드 dog쉽네~" 라고출력
		String dog = "메서드 dog쉽네~";
		calc.dog(dog);
		calc.nameAge();
		
		
		//매서드를 호출하여 이름과 나이를 출력하시오
		// 매개변수가 없는 매서드, 키보드를 입력 x
		
		
		//메서드를 호출하여 아래의 데이터를 출력하세요
		String animal="골든리트리버";
		String 공고일="2024-07-01";
		
		TestMethod TestMethod = new TestMethod();
		TestMethod.Test(animal, 공고일);
		
		
		
		//다음 날짜 중에서 월과 일만 출력하세요
		//문자열 메서드 substring 또는 split 사용
		Exam exam = new Exam();
		
		String examDate = "2024-08-13";
		exam.exam(examDate);;
		
		//네 사람의 나이 평균값을 구하여 출력하세요
		//평균값은 정수입니다.
		int 흥민=31,강인=23,희찬=28,재범=37;
		exam.age(흥민, 강인, 희찬, 재범);
	}

}
class Exam{
	
	void age(int 흥민,int 강인,int 희찬,int 재범) {
		int avg = ((흥민+강인+희찬+재범)/4);
		System.out.print("\n네명의 나이 평균 : "+avg);
	}
	
	void exam(String examDate) {
		
		System.out.print("시험날(월/일) : "+examDate.substring(5) );
	}
}
class TestMethod{
	
	void Test(String animal,String 공고일 ) {
		
		System.out.println("종 : "+animal+"\n공고일 : "+공고일); 
	}
	
}


//인스턴스 메서드, 인스턴스 변수는 객체(인스턴스)를 통해 사용
//클래스 메서드, 클래스 변수는 클래스이름으로 사용

class Total{
	void scoretotal(int kor,int eng, int mat) {
	int total = kor+eng+mat;
	System.out.println("총점 : "+ total+"점");
	
	}
}


	
	
class Calc {
	void nameAge() {
		String name = "홍길동";
		int age = 25 ;
		System.out.println("이름 : "+name+"\n나이 : "+age);
		
	}
	
	void dog(String d) {
		
		System.out.println(d);
	}
	
	void sum(int num1,int num2) {
		int result = num1+num2;
		System.out.println("합 : "+ result);
	}
	void sum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수 : ");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수 : ");
		int num2 =scan.nextInt();
		int result = num1+num2;
		System.out.println
		("합 : "+ result);
		
	}
}

