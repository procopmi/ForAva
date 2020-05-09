package mediaRentalManager;

public class Media implements Comparable<Media> {
	private String title;
	private int copies;

	public Media() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the copies
	 */
	public int getCopies() {
		return copies;
	}

	/**
	 * @param copies the copies to set
	 */
	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public int compareTo(Media o) {
		// TODO Auto-generated method stub
		return this.getTitle().compareToIgnoreCase(o.getTitle());

		//return 0;
	}


}
