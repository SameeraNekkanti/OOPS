package files;
import java.util.Scanner;
public class BankLoan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of applicants: ");
		int n=sc.nextInt();
		
		String[]name=new String[n];
		double[]income=new double[n];
		double[] loan = new double[n];
        double[] ratio = new double[n];
        
        int i=0;
        int choice;
        
        do {
        	System.out.println("\n--- Loan Menu ---");
            System.out.println("1. Add Applicant");
            System.out.println("2. Show All Applicants");
            System.out.println("3. Show Eligible Applicants");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            if(choice==1) {
            	if(i<n) {
            	System.out.println("enter applicant name: ");
            	name[i]=sc.next();
            	
            	System.out.print("Enter monthly income: ");
                income[i] = sc.nextDouble();
                
                if(income[i]<0) {
                	System.out.println("invalid,setting to 0.");
                	income[i]=0;
                	
                }
                System.out.println("enter loan amount");
                loan[i]=sc.nextDouble();
                
                if(income[i]>0) {
                	ratio[i]=loan[i]/income[i];
                }else {
                	ratio[i]=0;
                }
                i++;
                	
            	}else {
            		 System.out.println("Storage full!");
            		 
            	}
            
            }
            else if(choice==2) {
            	if(i==0) {
            		 System.out.println("No applicants.");
            	}else {
            		 System.out.println("\n--- All Applicants ---");
            		 for(int j=0;j<i;j++) {
            			    System.out.println("Name: " + name[j]);
            			    System.out.println("Income: " + income[j]);
            			    System.out.println("Loan: " + loan[j]);
            			    System.out.println("Ratio: " + ratio[j]);
            			    System.out.println("----------------");
            			
            		 }
            	}
            }
            else if(choice==3) {
            	if (i == 0) {
                    System.out.println("No applicants.");
                } else {
                	System.out.println("\nEligible Applicants:");
                	for(int k=0;k<i;k++) {
                		if(ratio[k]<0.5) {
                			  System.out.println(name[k] + " is eligible");
                		}else {
                			System.out.println("no eligble applicants!");
                		}
                	}
                }
            }
            else if(choice==4) {
            	System.out.println("Exiting...");
            }
            else {
            	System.out.println("Invalid choice!");
            }
        

	}while(choice!=4);
        sc.close();
	}

}
