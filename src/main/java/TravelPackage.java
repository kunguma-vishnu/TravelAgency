package main.java;

import java.util.List;

public class TravelPackage{
	private int id;
	private int name;
	private int passengerCapacity;
	private List<Destination> itinerary;
	private List<Passenger> passengers;
	
	public TravelPackage() {
		super();
	}
	
	public TravelPackage(int id, int name, int passengerCapacity, List<Destination> itinerary,
			List<Passenger> passengers) {
		super();
		this.id = id;
		this.name = name;
		this.passengerCapacity = passengerCapacity;
		this.itinerary = itinerary;
		this.passengers = passengers;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	public List<Destination> getItinerary() {
		return itinerary;
	}
	public void setItinerary(List<Destination> itinerary) {
		this.itinerary = itinerary;
	}
	
	public List<Passenger> getPassengers() {
		return passengers;
	}
	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	public void getPackageDetails() {
		System.out.println("Package Name: "+name);
		System.out.println("Itinerary Details: ");
		for(Destination destination: itinerary) {
			System.out.println("Place: "+destination.getName());
			System.out.println("Activity Details: ");
			for(Activity activity:destination.getActivities()) {
				System.out.println("Name: "+activity.getName());
				System.out.println("Cost: "+activity.getCost());
				System.out.println("Capacity: "+activity.getCapacity());
				System.out.println("Description: "+activity.getDescription());
			}
		}
	}
	
	public void getPackagePassengerDetails() {
		System.out.println("Package Name: "+name);
		System.out.println("Capacity: "+passengerCapacity);
		System.out.println("Number of passenger currently enrolled: "+passengers.size());
		System.out.println("Passenger Details: ");
		for(Passenger traveler: passengers) {
			System.out.println("Name: "+traveler.getName());
			System.out.println("Passenger Number: "+traveler.getPassengerNumber());
		}
	}
	
	public void getIndividualPassengerDetails() {
		System.out.println("Individual Passengers Details");
		for(Passenger traveler:passengers) {
			System.out.println("Name: "+traveler.getName());
			System.out.println("Passenger Number: "+traveler.getPassengerNumber());
			if(traveler.getBalance()>0.0) {
				System.out.println("Balance: "+traveler.getBalance());
			}
			System.out.println();
		}
	}
	
}