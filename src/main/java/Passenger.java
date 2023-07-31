package main.java;

public class Passenger {

	enum PassengerType {
	    STANDARD,
	    GOLD,
	    PREMIUM
	}
	
	private int id;
	private String name;
	private int passengerNumber;
	private PassengerType passengerType;
	private double balance;

	public Passenger() {
		super();
	}

	public Passenger(int id, String name, int passengerNumber, PassengerType passengerType, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.passengerNumber = passengerNumber;
		this.passengerType = passengerType;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPassengerNumber() {
		return passengerNumber;
	}
	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}
	
	public PassengerType getPassengerType() {
		return passengerType;
	}
	public void setPassengerType(PassengerType passengerType) {
		this.passengerType = passengerType;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
