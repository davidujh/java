package java0629;

public class D0627_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//조건문 if , switch
		
		//반복문 for , while , do~while
		
		//if문의 조건식 - 비교연산자와 논리연산자로 식을 만든다.
		//			   즉, 참 과 거짓이 나올 수 있는 ㅛ시

		// 키가 150 이상이다.      키>=150;
		// 10월 달의 지출 내역      전체 지출날짜 월 ==10
		//32000원 이상의 지출내열    지출금액 <=32000
		// 판매중인 상품들만 출력     상품상태 == 판매 , 재고수량 > 0;
		
		
		int tall = 135;
		if(tall >= 150) {
			//키가 150이상이 맞다면 무엇을 할 것인지
		}else {
			//키가 150이상이 아니라면 무엇을 할 것인지
		}
		
		// 시험 합격 기준 - 합격(60점이상),불합격(60점미만)
		
		int score = 72;
		if(score >= 60){
			System.out.print("합격");
		}else {
			System.out.print("불합격");
		}
		
		
		//if~else - 조건식이 참,거짓에 따라 실행되는 내용이 다른경우
		// 하나의 조건에 두개의 내용이 있는 경우에 if~else 구조로 작성
		
		
		score = 89;
		if(score >= 90 ) {
			System.out.print("A");
		}else if(score>=80) {
			System.out.print("B");
		}else {
			System.out.print("C");
		}
		
		
		
		//switch - 실행 조건을 case로 설정하여
		//         case와 일치하는 값일 경우 발동되는 조건문
		
		// 지렁이게임을 만든다. 방향키는 w,a,s,d 이고
		//p키는 일시정지 o키는 계속하기 i키는 처음부터다시시작
		//ctrl.s는 게임시작이라고 한다면
		
		/*
		 
		 
		 switch(키보드값){
		 	case 'a': 실행내용
		 	case 'w': 실행내용
		 	case 's': 실행내용
		 	case 'd': 실행내용
		 	case 'p': 실행내용
		 	case 'o': 실행내용
		 	case 'i': 실행내용
		 	case 'ctrl':
		 		switch(키2){
		 			case 's':
		 			}
		 			
		 			
		 	}
		 	
		 	
		 	프로그램의 메뉴 구성
		 	
		 	
		 		switch(menu){
		 			case "open":
		 			case "save":
		 			case "build":
		 			case "git":
		 			case "exit":
		 			
		 		}
		 		
		 	
		 		
		 		
		 
		 
		 
		 
		 
		 
		 */
		
		
		String button = "종료";
		
		switch(button) {
		case"시작":
			System.out.println("게임시작");
			
		case "저장":
			System.out.println("게임저장");
			break;
		case "종료":
			System.out.println("게임종료");
		}
		
		//
		
		
		
	}

}
