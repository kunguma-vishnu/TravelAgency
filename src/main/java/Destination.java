package main.java;

import java.util.List;

public class Destination {
	private int id;
	private String name;
	private List<Activity> activities;
	
	public Destination() {
		super();
	}

	public Destination(int id, String name, List<Activity> activities) {
		super();
		this.id = id;
		this.name = name;
		this.activities = activities;
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
	public List<Activity> getActivities() {
		return activities;
	}
	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}
	
	
}
