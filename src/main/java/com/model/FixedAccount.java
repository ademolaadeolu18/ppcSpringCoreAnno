package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "fda")
public class FixedAccount implements InterestCalculator {

	@Value("3")
	private int duration;
	@Value("3.5")
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
	public FixedAccount() {
		System.out.println("inside FDA");
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*duration/roi;
	}

	
	
}
