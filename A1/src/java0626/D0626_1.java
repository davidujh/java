package java0626;

import java.util.Scanner;

public class D0626_1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		/* 코드 작성하기 전 해야할 일 - 문제파악, 요구사항 도출
			문자열 - " " 큰따옴표로 표현하여 작성한다
				문자열은 String 클레스 타입을 사용해야 한다.
				
			문제.2 
			직원 이름, 소속 부서명, 월 급여액을 키보드를 통해 입력받는다.
			세금은 8%를 낸다. 실수령액은 얼마인지 출력
			이름,부서,실수령액을 출력하세요
			 
		
		 */
		String 직원이름,소속부서,직원이름1,소속부서1;
		int 월급여액,월급여액1;
		
		System.out.print("첫번째 직원이름 : ");
		직원이름 = scan.next();
		System.out.print("첫번째 직원 소속부서 : ");
		소속부서 = scan.next();
		System.out.print("첫번째 직원 월급여액 : ");
		월급여액  = scan.nextInt();
		
		System.out.print("두번째 직원이름 : ");
		직원이름1 = scan.next();
		System.out.print("두번째 직원소속부서 : ");
		소속부서1 = scan.next();
		System.out.print("두번째 직원 월급여액 : ");
		월급여액1  = scan.nextInt();
		
		int 실수령액,실수령액1;
		실수령액 = 월급여액-월급여액/100*8;
		실수령액1 = 월급여액1-월급여액1/100*8;
		 System.out.printf("\n\n직원이름 : %s \n소속부서 : %s \n실수령액 %d \n\n\n", 직원이름,소속부서,실수령액);
		 System.out.printf("직원이름 : %s \n소속부서 : %s \n실수령액 %d \n", 직원이름1,소속부서1,실수령액1);
		
		 
		 
		 /*
		   next() - 스페이스키, 탭키, 엔터키를 누르면 입력 끝
		   nextLine() - 엔터키 누르면 입력 끝
		  */
		
		
		
		
		
		
		
		
	}

}
