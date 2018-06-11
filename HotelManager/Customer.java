package application;

public class Customer {
	
	private String LastName;
	private String FirstName;
	private int date;
	private int month;
	private int days;
	private int room;
	private double price;
	private String phone;
	
	public Customer(String lastName, String firstName, int date, int month, int days, int room, double price,String phone) {
		LastName = lastName;
		FirstName = firstName;
		this.date = date;
		this.month = month;
		this.days = days;
		this.room = room;
		this.price = price;
		this.phone=phone;
	}

	public String getLastName() {
		return LastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public int getDate() {
		return date;
	}

	public int getMonth() {
		return month;
	}

	public int getDays() {
		return days;
	}

	public int getRoom() {
		return room;
	}

	public double getPrice() {
		return price;
	}
	
	public String getPhone() {
		return phone;
	}
	
}
