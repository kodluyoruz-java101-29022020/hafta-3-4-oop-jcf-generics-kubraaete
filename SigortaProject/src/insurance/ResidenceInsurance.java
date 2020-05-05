package insurance;

public class ResidenceInsurance extends Insurance{

	@Override
	public double calculate() {
		return getInsuranceCharge()*0.5;
	}

}
