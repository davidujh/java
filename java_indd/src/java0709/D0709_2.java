package java0709;

public class D0709_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoardDAO dao = new BoardDAO();
		Board[] list = dao.findByAll();
		
//		for( Board board : list) {
//			if(board.getTitle().contains("") ){
//				
//				
//			}
//			
//			
//		}
		
		//hit값이 50 이상인 것 출력
//		for( Board board : list) {
//			if ( board.getHit() >= 50) {
////				System.out.println(board);
		
//			}
//		}
		
		// contain의 글자수가 10자 이하인 객체의 title과 writer만 출력
		
//		for(Board board : list) {
//			if(board.getContent().length() <= 10) {
//				
//				System.out.println(board.getTitle()+" "+board.getWriter());
//			}
//		}
//		
//		System.out.println("\n hit수가 100 이상인 객체들을 추출하여 hot 배열에 저장");
//		Board[] hot = new Board[list.length];
//		
//		int i=0; // hot 배열 인덱스
//		for(Board board : list) {
//			if(board.getHit() >= 100) {
//				hot[i++] = board;
//			}
//		}
//		for (Board data : hot) {
//			if(data == null)break;
//			Syste
		m.out.println(data);
//		}
		
		// writer에 신이 포함된 객체만 추출하여
		// sin 배열에 저장후 출력하시오
		
		System.out.println("2번 문제");
		Board[] sin = new Board[list.length];
		
		int k=0;
		for(Board board : list) {
			if(board.getWriter().contains("신")) {
				sin[k] = board;
				k++;
				
			}
		}
		for(Board data : sin) {
			if(data == null)break;
			System.out.println(data);
		}
		
	}

}
