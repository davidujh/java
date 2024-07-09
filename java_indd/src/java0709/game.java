package java0709;

public class game {
	
	private String title;
	private String genre;
	private String platform;
	
	public game() {}
	public game(String title, String genre, String platform) {
		this.title = title;
		this.genre = genre;
		this.platform = platform;
	}
	
	@Override
	public String toString() {
		return title+", "+genre+", "+platform;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
}
// 게임 제목과, 장르, 플렛폼
// 장르는 액션, 롤플레잉, FPS 같은거
// 플랫폼은 PC,PS4 Switch,XBOX 같은거