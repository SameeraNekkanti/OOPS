package eh;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AquaMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<AutoSmartFilterx> units = new ArrayList<>();
		
		try {
			 System.out.println("--- Welcome to the Aquatopia Distribution Grid ---");
	            System.out.print("Enter number of units to calibrate: ");
	            int n = sc.nextInt();
	            
	            
	            for(int i=0; i<n;i++) {
	            	  System.out.println("\n--- Calibrating Unit #" + (i + 1) + " ---");
	            	  
	            	  System.out.print("Source ID: ");
	            	  String sourceID = sc.nextLine();
	                  sc.nextLine();

	                  System.out.print("Location Name: ");
	                  String location = sc.nextLine();

	                  System.out.print("Max Capacity (L): ");
	                  int maxCapacity = sc.nextInt();

	                  System.out.print("Purity Core Level (0-100): ");
	                  int purity = sc.nextInt();
	                  
	                  if(purity<0||purity>100) {
	                	  throw new InputMismatchException("Purity must be between 0 and 100.");
	                  }
	                  
	                  System.out.print("Maintenance Cycle (Days): ");
	                  int maintenance = sc.nextInt();

	                  AutoSmartFilterx unit = new AutoSmartFilterx(sourceID, location, maxCapacity, purity, maintenance);
	                  
	                  units.add(unit);
	            }
	            
	            FileWriter fw=new FileWriter("ledger.txt",true);
	            BufferedWriter bw= new BufferedWriter(fw);
	            
	            for(AutoSmartFilterx unit: units) {
	            	bw.write("System Check: Source ID [" + unit.getSourceID() + "] at " + unit.getLocation());
	            	bw.newLine();
	            	bw.write("Purity Core Level: " + unit.getPurity() + "%");
	            	bw.newLine();
	            	
	            	 if (unit.getPurity() < 10) {
	            	        bw.write("[!] CRITICAL: SHUTDOWN TRIGGERED AT SOURCE " + unit.getSourceID());
	            	        bw.newLine();
	            	        bw.write("[!] REASON: Purity level below zero-waste threshold.");
	            	    } else {
	            	        bw.write("Status: FLOW STABLE. AQUATOPIA STANDARDS SECURE.");
	            	    }
	            	 	bw.newLine();
	            	    bw.write("-------------------------------------------");
	            	    bw.newLine();
	            }
	            
	            bw.close();
	            fw.close();
	            
	            System.out.println("\n[System] All units burned into Hydrology Ledger.");
	            
		
	          
		
		}catch(InputMismatchException e){
			System.out.println("error: "+e.getMessage());
			
		}catch(IOException e){
			System.out.println("file error!");
		}
		
		try {
			System.out.println("\n--- ACCESSING THE HYDROLOGY LEDGER ---");
			
			FileReader fr=new FileReader("ledger.txt");
			BufferedReader br=new BufferedReader(fr);
			
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
			fr.close();
		}
		catch(IOException e) {
		    System.out.println("Error reading file!");
		}
	
		sc.close();
		

	}

}
