package java0704;

import java.util.Scanner;

public class D0704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//로그인 가능한 아이디는 skyblue, 비밀번호는 1234sea
		//login 메서드를 실행하여 로그인 여부를 출력하세요.
		//아이디 비밀번호가 일치하면 로그인 성공 출력
		//하나라도 불일치하면 로그인 실패 출력
		//로그인 여부 출력은 main에서 
	
		MethodUtil util = new MethodUtil();
		
//		
//		boolean isFail = util.login();
//		if(isFail) {
//			System.out.print("로그인 성공!");
//		}else {
//			System.out.print("로그인 실패!");
//		}
//		
		
		// 정수 세게를 키보드를 통해 입력받으세요 
		// 입력한 세 정수의 합이 100을 넘으면 
		// 100 - 합의 결과를 출력하고
		// 100을 넘지 않으면 세 정수의 합을 출력하세요
		// 메인 메서드에서 출력
		int Math = util.math();
		
		System.out.print(Math);
		
	}

}
class MethodUtil{
	int math() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		int total =(num1+num2+num3);
		if(total>100) {
			return 100-total;
		}else {
			return total;
		}
		
	}
	

//	boolean login(){
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아이디 : ");
//		String id = sc.nextLine();
//		System.out.print("비밀번호 : ");
//		String password = sc.nextLine();
//		if(id.equals("skyblue") && password.equals("1234sea")) {
//			return true;
//		}else {
//			return false;
//		}		
		
		
		
						
}
