package insurance;

public class TravelInsurance extends Insurance{

	@Override
	public double calculate() {
		return super.getInsuranceCharge()*0.7;
	}

}
