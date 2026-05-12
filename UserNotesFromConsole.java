package labEvalTwo;
import java.util.Scanner;
import java.io.*;
import java.time.LocalDateTime;

class EmptyNoteException extends Exception{
	public EmptyNoteException(String message) {
		super(message);
		
	}
}
abstract class Logger{
	public abstract String format(String note);
}

class Filelogger extends Logger{
	@Override
	public String format(String note) {
		return "[" + LocalDateTime.now() + "] " + note;
	}
	public void saveFile(String formattedNote)throws IOException{
		 FileWriter fw = new FileWriter("logs.txt", true); // append mode
	        BufferedWriter bw = new BufferedWriter(fw);
	        
	        bw.write(formattedNote);
	        bw.newLine();
	        
	        bw.close();
	        fw.close();
	        
	}
}
public class UserNotesFromConsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String note=sc.nextLine();
			if(note.isEmpty()) {
				throw new EmptyNoteException("note cannot be empty.");
			}
			
			Filelogger logger = new Filelogger();
            String formattedNote = logger.format(note);

            logger.saveFile(formattedNote);

            System.out.println("Note saved to logs.txt: " + formattedNote);
			
		}catch(EmptyNoteException e) {
            System.out.println("Error: " + e.getMessage());
            

	}catch(IOException e) {
        System.out.println("File error: " + e.getMessage());

	}finally {
		sc.close();
	}
	}

}
