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
// ���� �����, �帣, �÷���
// �帣�� �׼�, ���÷���, FPS ������
// �÷����� PC,PS4 Switch,XBOX ������