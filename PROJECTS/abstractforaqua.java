package eh;

abstract class WaterSource{
    private String sourceID;
    private String location;
    private int maxCapacity;

    public WaterSource(String sourceID2, String location, int maxCapacity) {
        this.sourceID = sourceID2;
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

    public abstract void systemCheck();
}

public class abstractforaqua {
	

}
