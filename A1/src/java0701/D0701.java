package java0701;

import java.util.Scanner;

public class D0701 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		// 배열에 20개의 랜덤숫자 저장 (랜덤범위 1~30)
		// 배열에 저장된 데이터 중에서 5의 배수는 몇개인지 출력하기!
		
		//		int random = (int)(Math.random()*30)+1;
		//		int [] a = new int[20];
		
		
//		int[] number = new int[20];
//		
//		for(int i=0; i<number.length; i++) {
//			number[i] = (int)(Math.random()*30)+1;
//		}
//		
//		int count =0;
//		for(int i=0; i<number.length; i++) {
//			if(number[i]%5 == 0 )
//				count++;
//		}
//		System.out.println("5의배수 몇개 ?" + count);
		
		//배열 생성방법 , 배열에 데이터 저장하는 방법,
		// 배열에 저장된 데이터 추출 또는 출력
		// 배열의 장점 = 순차적인 배열 - 속도가 빠르다 but 순차적으로 값을 넣지 않을거라면 배열 사용이 효율적이지는 않다
		
		
		//빙고
		//1. 25의 크기를 가지는 배열 선언
		//2. 배열에 랜덤숫자 저장
		//3. 중복없이 저장
		//4. 25개 숫자를 화면에 출력
		//5. 게임시작 - 숫자선택 (입력)
		//6. 선택한 숫자 위치에 표시하기
		//7. 몇줄 빙고인지 확인하기
		//8. 빙고판 화면에 출력
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] bingo =new int[25];
		
		for(int i=0; i<bingo.length; i++) {
			bingo[i] = (int)(Math.random()*50)+1;
			for(int k=0; k<i; k++) {
				if(bingo[k] == bingo[i]) {
					i--;break;
				}
			}
		}
		
		while(true) {
			for(int i=0; i<bingo.length; i++) {
				if(i%5==0)
					System.out.println();
				if(bingo[i] == 0)
					System.out.printf("%2c",'■');
				else
					System.out.printf(" %2d", bingo[i]);
			}
			
			System.out.print("\n빙고 숫자 입력 : ");
			int num = scan.nextInt();
			
			//선택한 숫자 표시하기
			for(int i=0; i<bingo.length; i++) {
				if(num == bingo[i]) {
					bingo[i]=0; break;
				}
				
			}
			
			//5줄 빙고냐 ? 몇줄 빙고냐 
			int 가로=0, 세로=0, 대각선1=0, 대각선2=0,end=0;
			
			for(int i=0; i<5; i++) {
				for(int k=0; k<5; k++) {
					if(bingo[i*5+k]==0) 가로++;
					if(bingo[k*5+i]==0) 세로++;
				}
				
				
				if(bingo[i*6] == 0)대각선1++;
				if(bingo[i*4+4] == 0)대각선2++;
				
				if(대각선1 ==5)end++;
				if(대각선2 == 5)end++;
				if(가로 ==5)end++;
				if(세로 ==5)end++;
				
				가로=0;
				세로=0;
			}
			
			if(end ==5) {
				System.out.println("5줄 빙고 완성!");
				break; //무한루프 종료
			}
		}
		
		
		
		
		
		
	}

}
