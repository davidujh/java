package java0629;

public class D0627 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연산다
		// 산술연산자 + , - , * , / , %(나머지)
		
		System.out.println(10/(float)4);
		
		// 증감연산자 ++ , --
		// 대입연산자 =
		// 복합대입연산자 += , -= , *= , /= , %=
		int a=10;
		a += 3; //a = a+3
		
		//비교연산자 > , < , >= , <= , == , !=
		System.out.println(10 == 20);
		
		//논리연산자 && , || , !
		//조건연산자 (조건식)? 참내용 : 거짓내용
		
		
		// 비트연산자
		// 비트 논리 연산자  & , | , ~ , ^
		// 비트 시프트 연산자 >> , << 
		
		System.out.println( 34&15 );
		System.out.println( 42 | 21  );
		System.out.println( 42 ^ 30 );
		System.out.println( ~13 );
		
		
		int red = 188;
		int green = 229;
		int blue = 92;
		
		int color = (red << 16) | (green << 8 ) | blue;
		System.out.printf("#%06X \n", color);
		//rgb값을 헥사코드로 변환
		
		

	}

}
 