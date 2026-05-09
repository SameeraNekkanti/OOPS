package files;
import java.io.FileOutputStream;//bytes only
import java.io.FileInputStream; //A=65, B=66 ASCII
public class writeToFile {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("demo.txt");
		FileInputStream fis=new FileInputStream("demo.txt");
		FileOutputStream copy=new FileOutputStream("copy.txt");
		
		
		String str="hello students";
		byte b[]=str.getBytes(); //converts string to bytes
		fos.write(b);
		fos.close();
		System.out.println("data written successfully!");
		int i;
		while((i=fis.read())!=-1){
			copy.write(i);
			
			System.out.println((char)i); //convert to character
		}
		fos.close();
		copy.close();
		fis.close();

	}

}
//UTF-8 for character encoding bytes
