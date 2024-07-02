package java0702_1;

public class D0702_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(Car.제조사);
//		
//		Car car1;
////		car1.연료 = "휘발류";
//		
//		 	
//		car1 = new Car();//carName, 배기량, 연료 변수 생성
//		car1.carName="쏘나타";
//		car1.연료="휘발류";
//		
		
		
		
		Webtoon web1 = new Webtoon("김건우",4580,4.3);
		Webtoon web2 = new Webtoon("김경재",3485,4.1);
		Webtoon web3 = new Webtoon("박재범",90930,3.9);
		Webtoon web4 = new Webtoon("서석완",19200,3.4);
	
		
		
		
		
		
		
		
		

	}

}

//클래스 내부에 선언되는 변수(또는 배열)는 두가지가 있다
// 클래스 변수, 인스턴스 변수
// 인스턴스 변수는 클래스 객체 생성시 메모리 할당이 된다.
// 클래스 객체 생성은 new 연산자를 통한다.


//생성자 매서드 - 객체(인스턴스) 공간을 생설할때 공간 초기화 해주는 매서드
//생성자 매서드 - return이 존재하지 않는다
//			   return을 하면 안되는 이유 - 생성자 메서드에는 return타입 지정이 안되기 때문에
//오버로딩 - 오버로딩 구현 조건
//      1. 동일 클래스에서만 가능하다.
//      2. 메서드의 이름이 같아야한다. 
//      3. 매개변수의 타입은 다르게 선언되어야 한다.
//      4. 매개변수의 갯수가 달라야 한다.
//      5. 굉장히 까다로운 친구 but 유용함

//class Car{
//	static String 제조사 = "현대"; //클래스 변수
//	
//	String carName; //인스턴스 변수
//	int 배기량; //인스턴스 변수
//	String 연료;//인스턴스 변수
//
//
////생성자 메서드
//	Car(){
//		//생성자 메서드의 내용 - 인스턴스변수의 초기값 지정
//		연료="휘발유"; // new 연산자에 의해 객체 생성시 연료변수에 휘발유 저장된다.
//		}
//	//매개변수가 있는 생성자 메서드
//	Car(String 연료){
//		this.연료 = 연료;
//	}  
//	Car(String carName, int cc , String fuel){
//		this.carName =carName;
//		배기량=cc;
//		this.연료 = fuel;   
//	}
//}


class Webtoon{
	String name;
	int point;
	double gpa;
	
	Webtoon(){
		
	}
	
	Webtoon(String name, int point, double gpa){
		this.name = name;
		this.point = point;
		this.gpa =gpa;
		System.out.print(this.name+","+this.point+","+this.gpa);
		System.out.println();
		
		
	}
	
	public String toString() {
		return name+","+point+"점 ,"+gpa;
	}
	
}




