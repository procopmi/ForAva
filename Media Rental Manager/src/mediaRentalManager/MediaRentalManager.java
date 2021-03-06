/**
 * 
 */
package mediaRentalManager;

//import java.util.Arrays;
import java.util.*;

import tests.PublicTests;

/**
 * @author
 *
 */
public class MediaRentalManager implements MediaRentalManagerInt {

	private ArrayList<Customer> customerDatabase;
	private ArrayList<Media> rentalMedia;
	private int limitedPlanLimit;

	/**
	 * 
	 */
	public MediaRentalManager() {
		// TODO Auto-generated constructor stub
		this.setCustomerDatabase(new ArrayList<>());
		this.setRentalMedia(new ArrayList<>());
		this.setLimitedPlanLimit(2);
	}

	/**
	 * @return the customerDatabase
	 */
	private ArrayList<Customer> getCustomerDatabase() {
		return customerDatabase;
	}

	/**
	 * @param customerDatabase the customerDatabase to set
	 */
	private void setCustomerDatabase(ArrayList<Customer> customerDatabase) {
		this.customerDatabase = customerDatabase;
	}

	/**
	 * @return the rentalMedia
	 */
	private ArrayList<Media> getRentalMedia() {
		return rentalMedia;
	}

	/**
	 * @param rentalMedia the rentalMedia to set
	 */
	private void setRentalMedia(ArrayList<Media> rentalMedia) {
		this.rentalMedia = rentalMedia;
	}

	@Override
	public void addCustomer(String name, String address, String plan) {
		// TODO Auto-generated method stub

		ArrayList<Customer> customers = this.getCustomerDatabase();

		Customer aCustomer = new Customer();
		aCustomer.setName(name);
		aCustomer.setAddress(address);
		aCustomer.setPlan(plan);
		customers.add(aCustomer);

		Collections.sort(customers);
	}

	@Override
	public String getAllCustomersInfo() {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerDB = this.getCustomerDatabase();
		String returnCustomers = "***** Customers'Information *****\n";
		Customer aCustomer = new Customer();

		int custCount = 0;
		while (customerDB.size() > custCount) {
			aCustomer = customerDB.get(custCount);

			returnCustomers = returnCustomers + "Name: " + aCustomer.getName() + ", " + "Address: "
					+ aCustomer.getAddress() + ", " + "Plan: " + aCustomer.getPlan() + "\n" + "Rented: "
					+ aCustomer.getRented() + "\n" + "Queue: "
					+ aCustomer.getInterested() + "\n";
			custCount++;
		}

		return returnCustomers;
		// return null;
	}

	@Override
	public void addMovie(String title, int copiesAvailable, String rating) {
		// TODO Auto-generated method stub
		ArrayList<Media> allMedia = this.getRentalMedia();

		Movie aMovie = new Movie();
		aMovie.setRating(rating);
		aMovie.setCopies(copiesAvailable);
		aMovie.setTitle(title);

		allMedia.add(aMovie);
		Collections.sort(allMedia);

	}

	@Override
	public void addAlbum(String title, int copiesAvailable, String artist, String songs) {
		// TODO Auto-generated method stub

		ArrayList<Media> allMedia = this.getRentalMedia();
		Album album = new Album();
		album.setTitle(title);
		album.setCopies(copiesAvailable);
		album.setArtist(artist);
		album.setSongs(songs);

		allMedia.add(album);
		Collections.sort(allMedia);
	}

	@Override
	public void setLimitedPlanLimit(int value) {
		// TODO Auto-generated method stub
		this.limitedPlanLimit = value;

	}

	@Override
	public String getAllMediaInfo() {
		// TODO Auto-generated method stub
		ArrayList<Media> allMedia = this.getRentalMedia();
		Media oneItem = new Media();
		String returnMedia = "***** Media Information *****\n";
		int mediaCount = 0;
		Album oneAlbum = new Album();
		Movie oneMovie = new Movie();
		
		while (allMedia.size() > mediaCount)
		{
			oneItem = allMedia.get(mediaCount);
			returnMedia = returnMedia + "Title: " + oneItem.getTitle() + ", "
					+ "Copies Available: " + oneItem.getCopies() + ", ";
			
			if (oneItem instanceof Album)
			{
				oneAlbum = (Album)oneItem;
				returnMedia = returnMedia + "Artist: " + oneAlbum.getArtist() + ", "
					+ "Songs: " + oneAlbum.getSongs() + "\n";
			}
			else if (oneItem instanceof Movie)
			{
				oneMovie = (Movie)oneItem;
				returnMedia = returnMedia + "Rating: " + oneMovie.getRating() + "\n";
			}
			
			mediaCount++;
		}

		return returnMedia;
		//return null;
	}

	@Override
	public boolean addToQueue(String customerName, String mediaTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeFromQueue(String customerName, String mediaTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String processRequests() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean returnMedia(String customerName, String mediaTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {
		// TODO Auto-generated method stub
		ArrayList<Media> allMedia = this.getRentalMedia();
		ArrayList<String> searchResults = new ArrayList<String>();
		
		Iterator<Media> it = allMedia.iterator();
		while (it.hasNext())
		{	
			Media oneItem = it.next();
			if (title != null)
			{
				if (oneItem.getTitle().contains(title))
					searchResults.add(oneItem.getTitle());
			}
			else if (rating != null)
			{
				if (oneItem instanceof Movie)
				{
					Movie thisMovie = (Movie)oneItem;
					if (thisMovie.getRating().contains(rating))
						searchResults.add(thisMovie.getTitle());
				}
			}
			else
				if (oneItem instanceof Album)
				{
					Album thisAlbum = (Album)oneItem;
					if (artist != null)
					{
						if (thisAlbum.getArtist().contains(artist))
							searchResults.add(thisAlbum.getArtist());
					}
					else if (songs != null)
					{
						if (thisAlbum.getSongs().contains(songs))
							searchResults.add(thisAlbum.getTitle());
					}
				}
		}
		return searchResults;
		//return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicTests myTests = new PublicTests();
		//myTests.testAddingCustomers();
		//myTests.testAddingMedia();
		myTests.testSearchMedia();
	}

}
