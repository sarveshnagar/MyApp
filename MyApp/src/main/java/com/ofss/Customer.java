package com.ofss;

public class Customer {
	
	private String customerName;
	private String Location;
	public Customer(String customerName, String location) {
		super();
		this.customerName = customerName;
		Location = location;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.customerName + " " +this.Location;
	}
	
}
