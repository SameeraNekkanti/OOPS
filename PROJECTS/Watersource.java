package eh;

abstract class Watersource{
	private String sourceID;
	private String location;
	private int maxCapacity;
	
	public Watersource(String sourceID, String location, int maxCapacity) {
		this.sourceID = sourceID;
		this.location = location;
		this.maxCapacity = maxCapacity;
	}

	public String getSourceID() {
		return sourceID;
	}

	public String getLocation() {
		return location;
	}


	public int getMaxCapacity() {
		return maxCapacity;
	}

	
	public abstract void displayInfo();
	
	
}


