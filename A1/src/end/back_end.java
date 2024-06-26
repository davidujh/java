package end;

public class back_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		boolean isTrue = false;
		String word="이순신";
		
		//사각형의 넓이를 구하시오. (밑변과 높이는 정수이다.)
		int width = 15;
		int height = 20;
		int area =width*height;
		System.out.println("넓이 : "+area);
		
		//키보드 30개를 구매해야한다
		// hp게이밍 키보드의 가격이 8000원 이라면 총 구매금액은 얼마인가?
		
		int keyboard = 30;
		int cost = 8000;
		int total = keyboard*cost;
		System.out.println("총 금액은 "+total);
		System.out.print("java 출력 방법 print");
		System.out.print("줄바꿈 안된다");
		System.out.printf("printf \n 출력");
		//서식 문자 - 형식지정문자
		System.out.printf("총금액 : %d ",total);
		//%d - 10진수 정수
		//%u - 10진수 정수
		//%f - 10진수 실수
		//%c - 문자표현
		//%s - 문자열 표현
		//%b - boolean(false,true)
		//%o - 8진수 정수  %x - 16진수 정수
		System.out.printf("%d  %.1f",80,0.238929127);
		
		

	}

}
