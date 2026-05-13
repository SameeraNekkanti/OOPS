package eh;

public class LongTermResident extends Patient implements IBillable {

	private double monthlyCharge;

	public LongTermResident(int patientID, String fullName, double monthlyCharge) {
		super(patientID, fullName);
		this.monthlyCharge = monthlyCharge;
	}
	@Override
	public String getTreatmentPlan() {
		return "Long-term rehabilitative care.";
	}
	
	@Override
	public double calculateBill() {
		return monthlyCharge;
	}
	
	public void displayResidentInfo() {
		displayInfo();
		System.out.println("Current Account Balance: $" + calculateBill());
        System.out.println("-----------------------------------");
        
	}
	
}
