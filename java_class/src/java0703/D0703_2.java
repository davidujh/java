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
		
		// 국어,영어,수학 세과목의 총점을 구하는 메서드
		// 세과목 평균을 구하는 메서드
		// 총점과 평균을 출력하세요
		
		
		int total = rm.total();
		int avg = rm.avg(tot);
		
		
		System.out.print("총점은 : "+total+"\n평균은 : "+total);
		

	}

}


class ReturnMth{
	
	int avg(int tot) {
		
		return tot/3;
	}
	int total() {
		int kor=99,mat=98,eng=100;
		int result = (kor+mat+eng);
		return result;
	}
	
	
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