package com.shilpa;
public class Customer {
	int customerId;
	String customerName; 
	String customerAddress;
	int customerContact;
	public Address address;
	
	public Customer(){
		
	}
	
	public Customer(int customerId, String customerName, String customerAddress, int customerContact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerContact = customerContact;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}
	
	 public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void printCustomerDetail(){
		 
	        System.out.println("Customer Id \t\t: " + customerId);
	        System.out.println("Customer Name \t\t: " + customerName);
	        System.out.println("Customer Address \t\t: " + customerAddress);
	        System.out.println("Customer Contact no \t: " + customerContact);
	 
	        System.out.println("\n Printing Address details\n");
	        address.printAddressDetail();
	    }
}
