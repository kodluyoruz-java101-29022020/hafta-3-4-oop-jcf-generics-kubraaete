package insurance;

public class CarInsurance extends Insurance{

	@Override
	public double calculate() {
		return super.getInsuranceCharge()*0.9;
	}

}
