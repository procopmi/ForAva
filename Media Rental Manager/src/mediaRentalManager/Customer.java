package mediaRentalManager;

public class Customer implements Comparable<Customer> {
	private String name;
	private String address;
	private String plan;
	private String[] interested;
	private String[] rented;
	//private static final String[] EMPTY_ARRAY = new String[0];


	public Customer() {
		// TODO Auto-generated constructor stub
		this.setInterested(new String[]{});
		this.setRented(new String[]{});
	}

	public Customer(String customerName, String customerAddress, String customerPlan)
	{
		this.setName(customerName);
		this.setAddress(customerAddress);
		this.setPlan(customerPlan);
		this.setInterested(new String[]{});
		this.setRented(new String[]{});
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

	/**
	 * @return the interested
	 */
	public String[] getInterested() {
		return interested;
	}

	/**
	 * @param interested the interested to set
	 */
	public void setInterested(String[] interested) {
		this.interested = interested;
	}

	/**
	 * @return the rented
	 */
	public String[] getRented() {
		return rented;
	}

	/**
	 * @param rented the rented to set
	 */
	public void setRented(String[] rented) {
		this.rented = rented;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getName().compareToIgnoreCase(o.getName());
		//return 0;
	}



}
