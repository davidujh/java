package java0703;

public class D0703_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메서드를 통해서 숫자 10을 받아 출력하기
		
		ReturnMth rm = new ReturnMth();
		int num = rm.get();
		System.out.println( num );   
		
		
		int 결과 = rm.sum();
		System.out.print(결과);
	
		//
		String userName = rm.getName();
		int age=34;
		System.out.println(userName+" "+age);

	}

}

class ReturnMth{
	String getName(){
		String name ="이순신";
		return name;
	}
	int sum() {
		int num1 = 30,num2 =45;
		int result =num1+num2;
		return result;
	}
	int get() {
		return 10;
		
	}
	
}