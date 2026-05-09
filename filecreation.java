package files;
import java.io.File;
import java.io.*;
public class filecreation {

	public static void main(String[] args) {
		File obj=new File("donations.txt");
		
		try {
			if(obj.createNewFile()) {
				System.out.println("file created!");
			}else {
				System.out.println("file already exists.");
			}
		}catch(IOException e) {
			System.out.println("error occured.");
		}
	}

	}


