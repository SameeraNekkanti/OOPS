package labEvalTwo;

abstract class WaterSource{
	private String sourceID;
	private String location;
	private int maxCapacity;
	
	public WaterSource(String sourceID, String location, int maxCapacity) {
		this.sourceID = sourceID;
		this.location = location;
		this.maxCapacity = maxCapacity;
	}

	public String getSourceID() {
		return sourceID;
	}

	public void setSourceID(String sourceID) {
		this.sourceID = sourceID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public abstract void displayInfo();
	
	
}

