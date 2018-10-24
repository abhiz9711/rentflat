package com.cg.frs.dto;

public class FlatRegistrationDTO {
	private int flatId;
	private String flatType;
	private double flatArea;
	private float desiredRent;
	private float depositAmt;
	
	
	
	public int getFlatId() {
		return flatId;
	}
	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	public double getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(double flatArea) {
		this.flatArea = flatArea;
	}
	public float getDesiredRent() {
		return desiredRent;
	}
	public void setDesiredRent(float desiredRent) {
		this.desiredRent = desiredRent;
	}
	public float getDepositAmt() {
		return depositAmt;
	}
	public void setDepositAmt(float depositAmt) {
		this.depositAmt = depositAmt;
	}
	public FlatRegistrationDTO(int flatId, String flatType, double flatArea,
			float desiredRent, float depositAmt) {
		super();
		this.flatId = flatId;
		this.flatType = flatType;
		this.flatArea = flatArea;
		this.desiredRent = desiredRent;
		this.depositAmt = depositAmt;
	}
	@Override
	public String toString() {
		return "FlatRegistrationDTO [flatId=" + flatId + ", flatType="
				+ flatType + ", flatArea=" + flatArea + ", desiredRent="
				+ desiredRent + ", depositAmt=" + depositAmt + "]";
	}
	public FlatRegistrationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
