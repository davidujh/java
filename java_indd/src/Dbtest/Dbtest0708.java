package Dbtest;

import java.sql.Connection;
import java.util.Scanner;

public class Dbtest0708 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dao dao =new Dao();
		
		Member[] list; // MemberŬ���� Ÿ�� �迭 �ּҸ� ������ ��������
		
		System.out.println("1. �Է�   2. ��� : ");
		int menu = scan.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("�л� �̸� : ");
			String name = scan.nextLine();
			System.out.println("���� ���� : ");
			int kor = scan.nextInt();
			System.out.println("���� ���� : ");
			int eng = scan.nextInt();
			System.out.println("���� ���� : ");
			int mat = scan.nextInt();
		
			Member member = new Member(name,kor,eng,mat);
			total_avg( member );
			System.out.println(member);
			// ������ ���̽��� ����
			
			dao.insert(member);
			break;
			
		case 2: // ������ ���� ���
			
			list = dao.select(); // �����ͺ��̽��� �����͸� MemberŬ���� �迭�� ��������
			for(Member data : list) {
				System.out.println(data);
			}
			break;
		}
	}
	
	static void total_avg( Member m  ) {
		int total = m.getKor()+ m.getEng()+m.getMat();
		m.setTotal(total);
		m.setStd_avg(total/3);
	}

	
	
	
}
