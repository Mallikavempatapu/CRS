package com.crs.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_feedbacks")
@Setter
@Getter
public class Feedbacks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int feedbackId;
	
	private int ticketId;
	private String customerEmail;
	private String feedback;
	public char[] getFeedback() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTicketId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setTicketId(String ticketId2) {
		// TODO Auto-generated method stub
		
	}
	public Object getCustomerEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getFeedbackId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setCustomerEmail(Object customerEmail2) {
		// TODO Auto-generated method stub
		
	}
	public void setFeedback(char[] feedback2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
