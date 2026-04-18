import java.util.Scanner;

interface ServiceMode{
	double calculateFare(double distance);
	boolean isAvailable();
	String getServiceType();	
	
}
class EconomyService implements ServiceMode{
	private final int maxCapacity=4;
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public double calculateFare(double distance) {
		return 10*distance;
	}
	public boolean isAvailable() {
		return true;
	}
	public String getServiceType() {
		return "Economy";
	}
}

class LuxuryService implements ServiceMode{
	private final int maxCapacity=2;
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public double calculateFare(double distance) {
		return 20*distance;
	}
	public boolean isAvailable() {
		return true;
	}
	public String getServiceType() {
		return "Luxury";
	}
}

class SharedrideService implements ServiceMode{
	private final int maxCapacity=6;
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public double calculateFare(double distance) {
		return 5*distance;
	}
	public boolean isAvailable() {
		return true;
	}
	public String getServiceType() {
		return "Shared";
	}
}

public class RideSharingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Ride Sharing System!");
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
		
		
		boolean hasLuxury=false;
		boolean hasShared=false;
		
		while(true) {
			System.out.println("Choose Service: ");
			System.out.println("1. Economy");
            System.out.println("2. Luxury");
            System.out.println("3. Shared");
            System.out.println("4. Exit");
            
            int choice=sc.nextInt();
            sc.nextLine();
            
            ServiceMode service=null;
            
            switch(choice) {
            case 1:
            	service=new EconomyService();
            	break;
            	
            case 2:
            	if(hasShared) {
            		System.out.println("Luxury cannot be combined with Shared rides!");
            		continue;
            	}
            	service=new LuxuryService();
            	hasLuxury=true;
            	break;
            	
            case 3:
            	if(hasLuxury) {
            		System.out.println("Shared cannot be combined with Luxury rides!");
            		continue;
            	}
            	service= new SharedrideService();
            	hasShared=true;
            	break;
            	
            case 4:
            	System.out.println("Exiting...");
                sc.close();
                return;
                
                default:
                	System.out.println("Invalid choice!");
                    continue;
       
            }
            double fare=service.calculateFare(distance);
            System.out.println("Service Type: " + service.getServiceType());
            System.out.println("Fare: ₹" + fare);
		}
	}
}
