package com.cmu.tiegen.entity;

import java.io.Serializable;

//rate of a booking
 public class Rate implements Serializable{
     	private static final long serialVersionUID = 6529685098267757690L;

	private int rateId;
	private int userId;
	private int orderId;
	private float rate;
	private String review;
	
	public Rate(){
		
	}
	public Rate(int uid, int oid, int rate, String review){
		this.userId = uid;
		this.orderId = oid;
		this.rate = rate;
		this.review = review;
	}
	
	public int getRateId() {
		return rateId;
	}
	public void setRateId(int rateId) {
		this.rateId = rateId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
}
