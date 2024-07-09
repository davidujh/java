package java0709;

public class D0709_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		game[] gm = new game[7];
		
		gm[0] = new game("리그오브레전드","AOS","PC");
		gm[1] = new game("배틀그라운드","배틀로얄,FPS","PC,XBOX");
		gm[2] = new game("카트라이더","경주게임","PC,XBOX,안드로이드");
		gm[3] = new game("발로란트","FPS","PC");
		gm[4] = new game("오버워치","하이퍼 FPS","PC");
		gm[5] = new game("레인보우식스","1인칭 슈팅게임","PC");
		gm[6] = new game("스타크래프트","RTS","PC");
		
		
		for(game game : gm) {
			System.out.println(game);
		}
		
		
	}

}
