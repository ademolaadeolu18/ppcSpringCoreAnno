package com.model;

import org.springframework.stereotype.Component;

@Component(value = "saving")
public class SavingAccount implements InterestCalculator {
   
	private int duration;
	private double roi;
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public SavingAccount() {
		System.out.println("inside Savings Account");
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*duration/roi;
	}

}
