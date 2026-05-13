package eh;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;

public class LuminaAdmissions {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=== Lumina Admissions===");
		
		LongTermResident[] residents=new LongTermResident[3];
		
		try {
		for(int i=0; i<residents.length;i++) {
			System.out.println("Bed Slot " + (i + 1) + ":");
			
			System.out.print("Enter Patient Name (or 'empty' for null): ");
            String name = sc.nextLine();
            
            if(name.equalsIgnoreCase("empty")) {
            	residents[i]=null;
            }else {
            	residents[i]=new LongTermResident(i, name, 110000.9);
            }
		}
		FileWriter fw = new FileWriter("patients.txt",true);

        for (int i = 0; i < residents.length; i++) {
            if (residents[i] == null) {
                fw.write("null\n");
            } else {
                fw.write("LUM-0" + i + "," +
                        residents[i].fullName + "," +
                        residents[i].getTreatmentPlan() + "\n");
            }
            
		}
        fw.close();
        
        System.out.println("[System] Data successfully serialized to disk.");

        } catch (IOException e) {
            System.out.println("File writing error: " + e.getMessage());
        }

        System.out.println("--- Recovered Ward Report ---");
		
        try {
            BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
            String line;

            while ((line = br.readLine()) != null) {

                if (line.equals("null")) {
                    System.out.println("[Notice] Bed is currently vacant. No data to display.");
                } else {
                    String[] data = line.split(",");

                    System.out.println("ID: [" + data[0] + "] Name: " +
                            data[1] + " | Plan: " + data[2]);
                }
            }

            br.close();
            } catch (IOException e) {
                System.out.println("File reading error: " + e.getMessage());
            }
        System.out.println("--- Terminal Session Closed ---");
        sc.close();
	}

}
