import java.util.Scanner;

class Person {
	protected String name;
	protected int age;
	protected int ID;
	
	public Person(String name, int age, int ID) {
		this.name=name;
		this.age=age;
		this.ID=ID;
	}
}
class Passenger extends Person{
	String tier;
	String reservationMode;
	
	public Passenger(String name, int age, int ID, String tier, String reservationMode) {
		super(name, age, ID);
		this.tier=tier;
		this.reservationMode=reservationMode;
	}
}
interface TariffRate{
	double At1=120;
	double At2=100;
	double At3=80;
	double Ageneral=50;
	
	double St1=90;
	double St2=75;
	double St3=60;
	double Sgeneral=35;
	
	double kid1=60;
	double kid2=50;
	double kid3=40;
	double kidGeneral=20;
	
	double calculateTicketPrice();
	
}
class BookingApp implements TariffRate{
	Passenger passenger;
	double fare;
	
	//composition
	public BookingApp(Passenger passenger) {
		this.passenger=passenger;
	}
	public double calculateTicketPrice() {
		String tier=passenger.tier.toLowerCase();
		int age=passenger.age;
		
		if(age>=60) {
			if(tier.equals("tier1")) {
				fare= St1;
				
			}else if(tier.equals("tier2")){
				fare=St2;
				
			}else {
				fare=St3;
			}
			
		}
		else if(13<=age || age<=59) {
			if(tier.equals("tier1")) fare=At1;
			else if(tier.equals("tier2"))fare=At2;
			else if(tier.equals("tier3"))fare=At3;
			else fare=At3;
			
		}else {
			if(tier.equals("tier1")) fare=kid1;
			else if(tier.equals("tier2"))fare=kid2;
			else if(tier.equals("tier3"))fare=kid3;
			else fare=kidGeneral;
			
			
		}
		return fare;
	}
	
	public void TicketDetails(){
		System.out.println("ticket booked");
		System.out.println("Passenger: " + passenger.name);
        System.out.println("Age: " + passenger.age);
        System.out.println("Tier: " + passenger.tier);
        System.out.println("Reservation Mode: " + passenger.reservationMode);
        System.out.println("Ticket Fare: " + calculateTicketPrice());
		
	}
	
}
public class RailwayBooking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		
		System.out.println("enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter ID:");
        int ID = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter tier (Tier1/Tier2/Tier3/General):");
        String tier = sc.nextLine();

        System.out.println("Enter reservation mode:");
        String reservationMode = sc.nextLine();
		
		Passenger p1=new Passenger(name,age,ID,tier,reservationMode);
		
		BookingApp booking=new BookingApp(p1);
		booking.TicketDetails();
		
		sc.close();
		

	}
}
