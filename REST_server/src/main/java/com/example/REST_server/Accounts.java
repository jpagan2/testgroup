package com.example.REST_server;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class Accounts {
	private final String uid;
	private String name;
	private Dictionary address = new Hashtable();
	private String street;
	private String zip;

	private String phone;
	private String picture;
	private boolean is_active;
	private String date_created;
	
	public Accounts(String uid, String name, String street, String zip, String phone, String picture, boolean is_active, String date_created) {
		this.uid = uid;
		this.name = name;
		this.address.put("zip", zip);
		this.address.put("street", street);

/*
 		this.street = street;
		this.zip = zip;
 */

		this.phone = phone;
		this.picture = picture;
		this.is_active = is_active;
		this.date_created = date_created;
	}

	
	public String getUid() {
		return uid;
	}
	public String getName() {
		return name;
	}
	public Dictionary getAddress() {
		return address;
	}
/*
	public String getStreet() {
		return street;
	}
	public String getZip() {
		return zip;
	}
*/
	public String getPhone() {
		return phone;
	}
	public String getPicture() {
		return picture;
	}
	public boolean getIs_active() {
		return is_active;
	}
	public String getDate_created() {
		return date_created;
	}
	
}
