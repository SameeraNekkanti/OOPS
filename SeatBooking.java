package labEvalTwo;
import java.util.Scanner;
import java.io.*;

class OutOfBoundsException extends Exception{
	public OutOfBoundsException(String message) {
		super(message);
	}
}
class DataMismatchException extends Exception{
	public DataMismatchException(String message) {
        super(message);
	}
}
class SelectionConflictException extends Exception {
    public SelectionConflictException(String message) {
        super(message);
    }
}
public class SeatBooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[50];
        while(true) {
        	System.out.println("enter seat: ");
        	String input = sc.next();
        	
        	try {
        		int seat;
        		
        		if(!sc.hasNextInt()) {
        			sc.next();
        			throw new DataMismatchException("invalid");
        		}
        		seat=sc.nextInt();
        		
        		if (seat < 1 || seat > 50) {
                    throw new OutOfBoundsException("Invalid range: Please choose between 1-50.");
        		}
        		if (seats[seat - 1]) {
                    throw new SelectionConflictException("Selection conflict: Seat already taken.");
                }

                // Book seat
                seats[seat - 1] = true;
                System.out.println("Seat " + seat + " successfully booked!");
                break;
                    
        		
        	}catch (DataMismatchException e) {
                System.out.println(e.getMessage());

            } catch (OutOfBoundsException e) {
                System.out.println(e.getMessage());

            } catch (SelectionConflictException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
