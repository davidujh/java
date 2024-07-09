package java0709;

public class D0709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		move d = new dog();
		move c = new cat();
		c.moving();
		d.moving();

	}

}
class dog implements move{
	public void moving(){
		System.out.println("성큼 성큼 이동한다");
	}
}
class cat implements move{
	public void moving() {
		System.out.println("사뿐 사뿐 이동한다");
	}
}

interface move{
	static int a=10;
	public void moving();
}

/*
   	인터페이스 - 추상클래스의 한 종류
   	- 추상메서드만 가능
   	- 인스턴스 변수 불가
   	- static 변수, static 메서드 선언가능
   	- 객체 생성 불가
   	- 클레스들에 연결되어 사용된다
   	- 다향성 구현을 위해 사용한다.
*/