package mediaRentalManager;

public class Movie extends Media {
	//private String title;
	//private String copies;
	private String rating;
	
	public Movie() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

}
