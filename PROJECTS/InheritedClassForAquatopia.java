package labEvalTwo;

class SmartFilter extends WaterSource{
	private String purityCore;

	public SmartFilter(String sourceID, String location, int maxCapacity, String purityCore) {
		super(sourceID, location, maxCapacity);
		this.purityCore = purityCore;
	}
	@Override
	public void displayInfo() {
		 System.out.println("\n--- SMART FILTER DETAILS ---");
	        System.out.println("ID: " + getSourceID());
	        System.out.println("Location: " + getLocation());
	        System.out.println("Capacity: " + getMaxCapacity());
	        System.out.println("Purity Core: " + purityCore);
	}
	
}
