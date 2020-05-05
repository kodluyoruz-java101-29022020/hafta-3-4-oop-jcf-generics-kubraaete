package insurance;

import java.util.Date;

public abstract class Insurance {
	private String insuranceName;
	private double insuranceCharge;
	private Date insuranceStartEndDate;
	
	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public double getInsuranceCharge() {
		return insuranceCharge;
	}

	public void setInsuranceCharge(double insuranceCharge) {
		this.insuranceCharge = insuranceCharge;
	}

	public Date getInsuranceStartEndDate() {
		return insuranceStartEndDate;
	}

	public void setInsuranceStartEndDate(Date insuranceStartEndDate) {
		this.insuranceStartEndDate = insuranceStartEndDate;
	}

	public abstract double calculate();

}
