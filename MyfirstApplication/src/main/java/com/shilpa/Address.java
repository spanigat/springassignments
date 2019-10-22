package com.shilpa;

public class Address {
    
	String street;
	String city;
	String state;
	int zip;
	String country;
	
	public Address(){
	
	}
	public Address(String street, String city, String state, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	 public void printAddressDetail(){
	        System.out.println("Address Street \t\t: " + street);
	        System.out.println("Address City \t\t: " + city);
	        System.out.println("Address State \t\t: " + state);
	        System.out.println("Address Zip Code \t: " + zip);
	       
	    }
	
}
