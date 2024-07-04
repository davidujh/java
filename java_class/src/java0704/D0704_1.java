package java0704;

import java.util.Scanner;

public class D0704_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//컴퓨터와 가위바위보 하기
		// 컴퓨터의 가위바위보 값은 comInput메서드를 사용한다.
		// 유저의 가위바위보는 한글로 입력한다.
		// 승,무,패,에 대해 출력한다.
		// 메서드 - 유저 가위바위보 입력하고 저장하는 메서드
		//      - 컴퓨터와 비교하여 결과 출력하는 메서드
		//Game 클래스에 필요한 변수나 메서드 작성
		//main메서드에서는 Game 클래스 객체로 메서드만 실행
		
		Game game = new Game();
		
		
		game.play();
		
		
		
		
		
	}

}
class Game{//rock-paper-scissors 게임
	String com;
	String user;
	
	void play() {
		userInput();
		comInput();
		out();
	}
	
	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보! : ");
		this.user = sc.nextLine();
		
	}
	
	
	void comInput() {
		int temp = (int)(Math.random()*3);
		switch(temp) {
		case 0: this.com="가위";break;
		case 1: this.com="바위";break;
		case 2: this.com="보";break;
		
		
		}
	}
	
	void out() {
		System.out.print("컴퓨터 값 : "+com+"\n");
		if(com.equals(user)) {
			System.out.println("무승부!");
		}else if(com.equals("바위")&& user.equals("가위")||
				 com.equals("가위") && user.equals("보")||
				  com.equals("보") && user.equals("바위")) {
			System.out.print("컴퓨터 승!");
		}else if(user.equals("바위")&& com.equals("가위")||
				 user.equals("가위") && com.equals("보")||
				 user.equals("보") && com.equals("바위")) {
			System.out.print("나의 승!");
	
		}else {
			
		}
		
	}
	
}