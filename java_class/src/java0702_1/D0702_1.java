package java0702_1;

public class D0702_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println(Car.������);
//		
//		Car car1;
////		car1.���� = "�ֹ߷�";
//		
//		 	
//		car1 = new Car();//carName, ��ⷮ, ���� ���� ����
//		car1.carName="�Ÿ";
//		car1.����="�ֹ߷�";
//		
		
		
		
		Webtoon web1 = new Webtoon("��ǿ�",4580,4.3);
		Webtoon web2 = new Webtoon("�����",3485,4.1);
		Webtoon web3 = new Webtoon("�����",90930,3.9);
		Webtoon web4 = new Webtoon("������",19200,3.4);
	
		
		
		
		
		
		
		
		

	}

}

//Ŭ���� ���ο� ����Ǵ� ����(�Ǵ� �迭)�� �ΰ����� �ִ�
// Ŭ���� ����, �ν��Ͻ� ����
// �ν��Ͻ� ������ Ŭ���� ��ü ������ �޸� �Ҵ��� �ȴ�.
// Ŭ���� ��ü ������ new �����ڸ� ���Ѵ�.


//������ �ż��� - ��ü(�ν��Ͻ�) ������ �����Ҷ� ���� �ʱ�ȭ ���ִ� �ż���
//������ �ż��� - return�� �������� �ʴ´�
//			   return�� �ϸ� �ȵǴ� ���� - ������ �޼��忡�� returnŸ�� ������ �ȵǱ� ������
//�����ε� - �����ε� ���� ����
//      1. ���� Ŭ���������� �����ϴ�.
//      2. �޼����� �̸��� ���ƾ��Ѵ�. 
//      3. �Ű������� Ÿ���� �ٸ��� ����Ǿ�� �Ѵ�.
//      4. �Ű������� ������ �޶�� �Ѵ�.
//      5. ������ ��ٷο� ģ�� but ������

//class Car{
//	static String ������ = "����"; //Ŭ���� ����
//	
//	String carName; //�ν��Ͻ� ����
//	int ��ⷮ; //�ν��Ͻ� ����
//	String ����;//�ν��Ͻ� ����
//
//
////������ �޼���
//	Car(){
//		//������ �޼����� ���� - �ν��Ͻ������� �ʱⰪ ����
//		����="�ֹ���"; // new �����ڿ� ���� ��ü ������ ���ắ���� �ֹ��� ����ȴ�.
//		}
//	//�Ű������� �ִ� ������ �޼���
//	Car(String ����){
//		this.���� = ����;
//	}  
//	Car(String carName, int cc , String fuel){
//		this.carName =carName;
//		��ⷮ=cc;
//		this.���� = fuel;   
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
		return name+","+point+"�� ,"+gpa;
	}
	
}




