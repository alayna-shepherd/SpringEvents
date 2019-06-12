package com.springevents.SpringEventProject.Entities;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Embedded {

	private ArrayList<Event> events;

	public Embedded() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Embedded(ArrayList<Event> events) {
		super();
		this.events = events;
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Embedded [events=" + events + "]";
	}
	
	
}
