package main.java;

public class Activity {
	private int id;
	private String name;
	private Destination description;
	private int cost;
	private int capacity;			
	
	public Activity() {
		super();
	}

	public Activity(int id, String name, Destination description, int cost, int capacity) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.cost = cost;
		this.capacity = capacity;
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
	
	public Destination getDescription() {
		return description;
	}
	public void setDescription(Destination description) {
		this.description = description;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}	
	
	
}
