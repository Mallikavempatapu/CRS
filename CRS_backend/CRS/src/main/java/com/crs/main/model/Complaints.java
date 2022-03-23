package com.crs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_complaints")
@Setter
@Getter
public class Complaints {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	
	private String customerEmail;
	private String pincode;
	private String complaint;
	private String status = "raised";
	public int getTicketId() {
		// TODO Auto-generated method stub
		return (Integer) null;
	}
	public Object getComplaint() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setComplaint(Object complaint2) {
		// TODO Auto-generated method stub
		
	}
	public Object getCustomerEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPincode() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCustomerEmail(Object customerEmail2) {
		// TODO Auto-generated method stub
		
	}
	public void setPincode(Object pincode2) {
		// TODO Auto-generated method stub
		
	}
	public void setStatus(Object status2) {
		// TODO Auto-generated method stub
		
	}

}
