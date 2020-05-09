/**
 * 
 */
package mediaRentalManager;

//import java.util.ArrayList;

/**
 * @author procopmi
 *
 */
public class Album extends Media{

	//private String title;
	//private int copies;
	private String artist;
	private String songs;

	
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}


	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}


	/**
	 * @return the songs
	 */
	public String getSongs() {
		return songs;
	}


	/**
	 * @param songs the songs to set
	 */
	public void setSongs(String songs) {
		this.songs = songs;
	}


	/**
	 * 
	 */
	public Album() {
		// TODO Auto-generated constructor stub
	}

}
