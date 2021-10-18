package com.model;
import org.springframework.stereotype.Component;

@Component(value = "loan")

public class LoanAccount implements InterestCalculator {

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
	public LoanAccount() {
		System.out.println("inside Loan Account");
	}
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*duration/roi;
	}

}
