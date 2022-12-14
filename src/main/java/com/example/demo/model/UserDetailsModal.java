package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetailsModal implements Serializable {

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 4049634572972929591L;
	
	@OneToOne(mappedBy="user_details")
	private User user;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int id;

	@Column(name = "user_id")
	public int userId;

	@Column(name = "file_id")
	public String objectId;
	
	@Column(name = "address")
	public String address;

	@Column(name = "phone")
	public String phone;
	
	@Column(name = "state")
	public String state;

	@Column(name = "city")
	public String city;
	
	@Column(name = "zip")
	public String zip;
	
	@Column(name = "designation")
	public String designation;
	

	public String getObjectId() {
		return objectId;
	}

	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}


}
