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

// Ŭ���� ���
// ����Ϸ��� �ڽ�Ŭ���� �̸� �ڿ� extends �θ�Ŭ���� �̸�
// extends - Ȯ��,���� ...
// Tv extends House -> Tv Ŭ������ ���θ� HouseŬ����
// ����� �ϴ� ���� ū ���� - ���⼺
// �θ�Ŭ������ �ν��Ͻ� ����, �ν��Ͻ� �޼���, Ŭ���� ����,
//           Ŭ���� �޼��� ��밡���ϴ�.
// ��, �θ�Ŭ������ ���� ��������� ���Ѵ�. 
// �Ϻ� ��� �ɷ��ִ� ������ �޼���� ���Ұ�.
