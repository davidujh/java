package java0709;

public class D0709_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		game[] gm = new game[7];
		
		gm[0] = new game("���׿��극����","AOS","PC");
		gm[1] = new game("��Ʋ�׶���","��Ʋ�ξ�,FPS","PC,XBOX");
		gm[2] = new game("īƮ���̴�","���ְ���","PC,XBOX,�ȵ���̵�");
		gm[3] = new game("�߷ζ�Ʈ","FPS","PC");
		gm[4] = new game("������ġ","������ FPS","PC");
		gm[5] = new game("���κ���Ľ�","1��Ī ���ð���","PC");
		gm[6] = new game("��Ÿũ����Ʈ","RTS","PC");
		
		
		for(game game : gm) {
			System.out.println(game);
		}
		
		
	}

}
