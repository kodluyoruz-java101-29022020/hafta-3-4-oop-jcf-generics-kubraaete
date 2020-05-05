package insurance;

public class HealthInsurance extends Insurance{

	@Override
	public double calculate() {
		return super.getInsuranceCharge()*0.3;
		
	}

}
