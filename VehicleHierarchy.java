package labEvalTwo;

interface Displayable{
	String getSummary();
	String getDetailedInfo();
}

abstract class Vehicle {
    private String vehicleId;
    private String type;
    private int capacity;
    private int manufacturingYear;

    public Vehicle(String vehicleId, String type, int capacity, int manufacturingYear) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.capacity = capacity;
        this.manufacturingYear = manufacturingYear;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    abstract double calculateEmissions(double distanceKm);
    abstract double calculateEnergyCost(double distanceKm);

    public int getVehicleAge() {
        return 2025 - manufacturingYear;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId +
                "\nType: " + type +
                "\nCapacity: " + capacity +
                "\nManufacturing Year: " + manufacturingYear +
                "\nAge: " + getVehicleAge();
    }
}

class ElectricBus extends Vehicle implements Displayable{
	private double batteryCapacityKWh;

    public ElectricBus(String vehicleId, String type, int capacity,
                       int manufacturingYear, double batteryCapacityKWh) {
        super(vehicleId, type, capacity, manufacturingYear);
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    @Override
    double calculateEmissions(double distanceKm) {
        return distanceKm * 0.05;
    }

    @Override
    double calculateEnergyCost(double distanceKm) {
        return distanceKm * 1.20;
    }
    
    @Override
    public String getSummary() {
    	return getType() + " | ID: " + getVehicleId() + " | Capacity: " + getCapacity();
    }
    
@Override
public String getDetailedInfo() {
	return super.toString()+ "\nBattery Capacity: " + batteryCapacityKWh + " kWh";
}

}
class DieselBus extends Vehicle implements Displayable{
	private int engineDisplacementCC;

    public DieselBus(String vehicleId, String type, int capacity,
                     int manufacturingYear, int engineDisplacementCC) {
        super(vehicleId, type, capacity, manufacturingYear);
        this.engineDisplacementCC = engineDisplacementCC;
    }

    @Override
    double calculateEmissions(double distanceKm) {
        return distanceKm * 2.68;
    }

    @Override
    double calculateEnergyCost(double distanceKm) {
        return distanceKm * 8.50;
    }

    @Override
    public String getSummary() {
        return getType() + " | ID: " + getVehicleId() + " | Capacity: " + getCapacity();
    }

    @Override
    public String getDetailedInfo() {
        return super.toString() + "\nEngine Displacement: " + engineDisplacementCC + " cc";
    }

}

class Route{
	private String routeId;
    private String origin;
    private String destination;
    private double distanceKm;
    private Vehicle assignedVehicle;

    public Route(String routeId, String origin, String destination,
                 double distanceKm, Vehicle assignedVehicle) {
        this.routeId = routeId;
        this.origin = origin;
        this.destination = destination;
        this.distanceKm = distanceKm;
        this.assignedVehicle = assignedVehicle;
    }
    
    public double getTotalEmissions() {
    	 if (assignedVehicle == null) {
             throw new IllegalStateException("No vehicle assigned to this route");
    	 }
    	return assignedVehicle.calculateEmissions(distanceKm);
    }
    
    public double getTotalEnergyCost() {
    	return assignedVehicle.calculateEnergyCost(distanceKm);
    }
    
    @Override
    public String toString() {
        return "Route ID: " + routeId +
                "\nOrigin: " + origin +
                "\nDestination: " + destination +
                "\nDistance: " + distanceKm + " km" +
                "\nVehicle: " + ((Displayable) assignedVehicle).getSummary();
    }
    
}

class VehicleFactory{
	private VehicleFactory() {
		//cannot be instantiated, prevents object creation
	}
	public static ElectricBus createElectricBus(String id, int capacity, int year, double batteryKWh) {
		if(capacity<=0) {
			throw new IllegalArgumentException("capacity must be greater than 0");
		}
		if (year < 2000) {
            throw new IllegalArgumentException("Manufacturing year must be 2000 or later");
	}
		return new ElectricBus(id,"Electric Bus", capacity, year, batteryKWh);
}
	public static DieselBus createDieselBus(String id, int capacity,
            int year, int engineCC) {
if (capacity <= 0) {
throw new IllegalArgumentException("Capacity must be greater than 0");
}
if (year < 2000) {
throw new IllegalArgumentException("Manufacturing year must be 2000 or later");
}
return new DieselBus(id, "Diesel Bus", capacity, year, engineCC);
}
}
public class VehicleHierarchy {

	public static void main(String[] args) {
	    try {
	        ElectricBus eb = VehicleFactory.createElectricBus("EB101", 40, 2022, 250.5);
	        DieselBus db = VehicleFactory.createDieselBus("DB202", 50, 2020, 2200);

	        Route r1 = new Route("R001", "Kochi", "Thiruvananthapuram", 210, eb);
	        Route r2 = new Route("R002", "Bangalore", "Mysore", 145, db);

	        System.out.println("----- ROUTE 1 -----");
	        System.out.println(r1);
	        System.out.println("Total Emissions: " + r1.getTotalEmissions() + " kg");
	        System.out.println("Total Energy Cost: INR " + r1.getTotalEnergyCost());

	        System.out.println("\n----- ROUTE 2 -----");
	        System.out.println(r2);
	        System.out.println("Total Emissions: " + r2.getTotalEmissions() + " kg");
	        System.out.println("Total Energy Cost: INR " + r2.getTotalEnergyCost());

	        // Vehicle array + polymorphism
	        Vehicle[] vehicles = {eb, db};

	        System.out.println("\n----- DISPLAYABLE SUMMARIES -----");
	        for (Vehicle v : vehicles) {
	            Displayable d = (Displayable) v;
	            System.out.println(d.getSummary());
	        }

	        // Exception demo
	        System.out.println("\n----- INVALID FACTORY TEST -----");
	        VehicleFactory.createDieselBus("X001", -5, 2023, 1800);

	    } catch (IllegalArgumentException e) {
	        System.out.println("Factory Error: " + e.getMessage());
	    }
	}
}