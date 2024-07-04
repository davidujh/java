package java0703과제;

import java.util.Scanner;

public class D0703_과제 {
	
	public static void main(String[] args) {
		DiceGame game = new DiceGame();
		game.init();
		game.diceThrow();
		game.result();
	}


	
		// TODO Auto-generated method stub
		
		
		/*
		 주사위 게임
		 J형준과 s석완이가 주사위 게임을 한다.
		 주사위는 하나,육면이다
		 주사위의 값이 큰 사람이 이긴다.
		 
		 주사위 값 구하는 메서드(랜덤으로 주사위 돌리는 메서드,매개변수필요없음,반환값 필요함)
		 
		 주사위 값 비교하여 누가 이겼는지 출력하는 메서드
		 (형준과 석완이의 주사위 값을 받을 매개변수 필요함, 누가 이겼는지 출력,반환값 필요없음)
		 
		 */
//		Random random = new Random();
//		int 형준주사위 = random.형준주사위();
////		random.형준주사위();
//		int 석완주사위 = random.석완주사위();
////		random.석완주사위();
//		
//		
//		System.out.println("형준 주사위 값 : "+형준주사위);
//		System.out.println("석완 주사위 값 : "+석완주사위);
//		random.비교(형준주사위, 석완주사위);
		DiceGame game = new DiceGame();
//		game.init();
	}



class DiceGame{
	String[] names;
	int[] diceNum;
	
	
	void init(){
		Scanner sc =new Scanner(System.in);
		System.out.print("주사위 게임 참가인원 : ");
		int cnt = sc.nextInt();
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
		sc.nextLine();
		for(int i=0; i<names.length; i++) {
			System.out.print("참가자 이름 : ");
			names[i] = sc.nextLine();
		}
		 
	}
	void diceThrow() {
		for(int i=0; i<names.length; i++) {
			this.diceNum[i] =(int)(Math.random()*6)+1;
			System.out.println(this.names[i]+"주사위 : "+this.diceNum[i]);
		}
	}
	
	void result() {//주사위 결과 - 주사위 값이 크면 이긴다.
		int max=0;
		for(int num : diceNum) {
			if (max < num )max=num;
			
		}
		boolean isSame = true;
		for(int num : diceNum) {
			if(num!=max) isSame=false;
			
		}
		if(isSame) {
			System.out.println("모든 참가자의 주사위 값이 같다 - 비김");
			return;
		}
		for(int i=0; i<diceNum.length;i++);
		if(diceNum[i]==max) {
			System.out.println(names[i]+" 승!");
		}
		
	}
}




//class Random{
//	void 비교(int 형준,int 석완) {
//		if(형준<석완) {
//			System.out.println("석완 승!");
//		}else if(형준>석완) {
//			System.out.println("형준 승!");
//		}else {
//			System.out.println("무승부!");
//		}
//		
//	}
//	
//	int 석완주사위() {
//		int 주사위2 =(int)(Math.random()*6)+1;
//		return 주사위2;
//	}
//	
//	int 형준주사위() {
//		int 주사위1 = (int)(Math.random()*6)+1;
//		return 주사위1;
//	}
//	
//}
