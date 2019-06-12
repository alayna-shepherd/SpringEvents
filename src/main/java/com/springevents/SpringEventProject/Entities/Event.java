package com.springevents.SpringEventProject.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {
	
	private String name;
	private String type;
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + ", type=" + type + "]";
	}
	
	

}
