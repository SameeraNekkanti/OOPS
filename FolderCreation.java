package files;
import java.io.*; //streams
import java.io.IOException; //byte stream classes(file input, file output stream)(8)
							//character stream classes(text)(16)
public class FolderCreation {

	public static void main(String[] args) throws IOException{
		File folder=new File("D:\\JavaFiles");
		if(folder.mkdir()) {
			System.out.println("folder created!");//creates one folder
		}
		File obj= new File("D:\\JavaFiles\\myfile.txt");
		if(obj.createNewFile()) {
			System.out.println("file created");
		}
		System.out.println("folder and file created!");
		
		File folder2=new File("D:\\A\\B\\C");
		folder2.mkdirs();

	}

}
//note:
//input: reads
//output: writes
//buffered: faster
