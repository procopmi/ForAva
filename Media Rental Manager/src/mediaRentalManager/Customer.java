package mediaRentalManager;

import java.util.LinkedList;

public class Customer implements Comparable<Customer> {
	private String name;
	private String address;
	private String plan;
	private LinkedList<Media> rented;
	private LinkedList<Media> interested;
	//private String[] rented;
	//private static final String[] EMPTY_ARRAY = new String[0];


	public Customer() {
		// TODO Auto-generated constructor stub
		this.setInterested(new LinkedList<>());
		this.setRented(new LinkedList<>());
	}

	public Customer(String customerName, String customerAddress, String customerPlan)
	{
		this.setName(customerName);
		this.setAddress(customerAddress);
		this.setPlan(customerPlan);
		this.setInterested(new LinkedList<>());
		this.setRented(new LinkedList<>());
	}
	
	public void setRented(LinkedList<Media> rented) {
		this.rented = rented;
	}

	public void setInterested(LinkedList<Media> interested) {
		this.interested = interested;
	}

	/**
	 * @return customer name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name customer name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return customer address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address customer address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return customer rental plan
	 */
	public String getPlan() {
		return plan;
	}

	/**
	 * @param plan customer rental plan
	 */
	public void setPlan(String plan) {
		this.plan = plan;
	}


	public LinkedList<Media> getRented() {
		return rented;
	}

	public LinkedList<Media> getInterested() {
		return interested;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getName().compareToIgnoreCase(o.getName());
		//return 0;
	}



}
