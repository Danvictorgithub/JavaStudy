public class Chapter4 {
	public static void main(String[] args) {
		Song song1 = new Song();
		song1.setTitle("Ikaw parin ang Pipiliin ko");
		song1.setArtist("Ted Ito");
		song1.play();
	}
}
class Song {
	private String title;
	private String artist;

	public void setTitle(String newTitle) {
		this.title = newTitle;
	}
	public void setArtist(String newArtist) {
		this.artist = newArtist;
	}
	public void play() {
		System.out.println(String.format("Playing a song \"%s\" by %s",this.title,this.artist));
	}
}