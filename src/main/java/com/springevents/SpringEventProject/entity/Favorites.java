package com.springevents.SpringEventProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Favorites {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private Integer userid;
	private String event;
	private String city;
	@Column(name="startdate")
	private String date;
	
	public Favorites() {
		
	}
	

	public Favorites(Integer id, Integer userid, String event, String city, String date) {
		this.id = id;
		this.userid = userid;
		this.event = event;
		this.city = city;
		this.date = date;
	}
	
	public Favorites(Integer userid, String event, String city, String date) {
		this.userid = userid;
		this.event = event;
		this.city = city;
		this.date = date;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Favorites [id=" + id + ", userid=" + userid + ", event=" + event + ", city=" + city + ", date=" + date
				+ "]";
	}
	

}
