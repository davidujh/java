package homeProduct;

import javax.xml.crypto.Data;

public class MainClass {
	public static void main(String[] args) {
//		String a;
//		a.toString();
//		Integer b;
//		b.toString();
//		Data aa;
//		aa.toString();
		
		
		Tv tv = new Tv();
		tv.power();
		tv.power();
		
		
		Aircon air = new Aircon();
		System.out.println(air.brand);
		air.power();
		air.power();
	}
}

// 클래스 상속
// 상속하려면 자식클래스 이름 뒤에 extends 부모클래스 이름
// extends - 확장,연장 ...
// Tv extends House -> Tv 클래스의 내부를 House클래스
// 상속을 하는 가장 큰 이유 - 다향성
// 부모클래스의 인스턴스 변수, 인스턴스 메서드, 클래스 변수,
//           클래스 메서드 사용가능하다.
// 단, 부모클래스의 모든걸 사용하지는 못한다. 
// 일부 제어가 걸려있는 변수나 메서드는 사용불가.
