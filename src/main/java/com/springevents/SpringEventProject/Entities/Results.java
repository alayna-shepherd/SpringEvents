package com.springevents.SpringEventProject.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
	
	private Embedded _embedded;

	public Results() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Results(Embedded _embedded) {
		super();
		this._embedded = _embedded;
	}

	public Embedded get_embedded() {
		return _embedded;
	}

	public void set_embedded(Embedded _embedded) {
		this._embedded = _embedded;
	}
	

}
