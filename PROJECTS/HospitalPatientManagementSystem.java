package labEvalTwo;

import java.io.*;
import java.util.Scanner;

abstract class Patient{
	private String patientId;
	private String patientName;
	private String disease;
	
	public Patient(String patientId, String patientName, String disease) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
	}
	
	public String displayPatientDetails() {
		return "patientID: "+patientId+
				"\nname: "+patientName+
				"\ndisease: "+disease;
	}
	
	public abstract double calculateBill();
	
	public final void generateBillSummary() {
		System.out.println("Generating Bill Summary...");
		System.out.println(displayPatientDetails()+" | Bill: "+calculateBill());
	}
	
}

interface MedicalService{
	void scheduleAppointment(String date);
	void cancelAppointment(String date);
}

class ICUPatient extends Patient implements MedicalService{
	
	final int MIN_STAY_DAYS=1;
	
	private String assignedDoctor;
	private double dailyCareCharge;
	private int stayDuration;
	
	public ICUPatient(String patientId, String patientName, String disease, String assignedDoctor,
			double dailyCareCharge, int stayDuration) {
		super(patientId, patientName, disease);
		
		if(stayDuration< MIN_STAY_DAYS) {
			throw new IllegalArgumentException("Invalid stay duration.");
		}
		this.assignedDoctor = assignedDoctor;
		this.dailyCareCharge = dailyCareCharge;
		this.stayDuration = stayDuration;
	}
	@Override
	public double calculateBill() {
		return dailyCareCharge* stayDuration;
	}
	
	@Override
	public void scheduleAppointment(String date) {
		if(assignedDoctor==null|| assignedDoctor.isEmpty()) {
			throw new IllegalArgumentException("No doctor assigned for this patient.");
		}
		System.out.println("Appointment scheduled for: " + date);
	
	}
	@Override
	public void cancelAppointment(String date) {
		System.out.println("appointment cancelled for: "+date);
	}
	
	@Override
	public String displayPatientDetails() {
		return super.displayPatientDetails()
				+"\nAssigned Doctor: " + assignedDoctor +
	               "\nDaily Care Charge: " + dailyCareCharge;
				
	}
}
public class HospitalPatientManagementSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("enter patient id: ");
			String id=sc.nextLine();
			
			System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Disease: ");
            String disease = sc.nextLine();

            System.out.print("Enter Assigned Doctor: ");
            String doctor = sc.nextLine();

            System.out.print("Enter Daily Care Charge: ");
            double charge = sc.nextDouble();

            System.out.print("Enter Stay Duration: ");
            int days = sc.nextInt();
            sc.nextLine();
            
            ICUPatient patient=new ICUPatient(id, name, disease, doctor, charge, days);
            
            System.out.println("Patient record created successfully.");

            System.out.print("Enter Appointment Date: ");
            String date = sc.nextLine();
            
            System.out.println("Press 1 to schedule appointment");
            System.out.println("Press 2 to cancel appointment");
            int choice = sc.nextInt();
            sc.nextLine();
            
            if (choice == 1) {
                patient.scheduleAppointment(date);
                patient.generateBillSummary();
            } else if (choice == 2) {
                patient.cancelAppointment(date);
                
            } else {
                System.out.println("Invalid choice");
            }
            
            
            
            FileWriter fw=new FileWriter("patients.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(patient.displayPatientDetails()+" | Bill: " + patient.calculateBill() + "\n");
            
            
            bw.close();
            fw.close();
            
            sc.close();
            
            System.out.println("Patient details stored in file.");

            // Read from file
            System.out.println("Reading patient records from file...");
            
            FileReader fr=new FileReader("patients.txt");
            BufferedReader br=new BufferedReader(fr);
            
            String line;
            
            while((line=br.readLine())!=null) {
            	System.out.println(line);
            }
            br.close();
            fr.close();
            
            
		}catch(IllegalArgumentException e) {
			System.out.println("error "+e.getMessage());
		}catch(IOException e) {
			System.out.println("File error");
		}
	
	

	}

}
