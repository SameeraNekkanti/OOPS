package files;
import java.io.FileInputStream;
public class readFirstChar {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("demo.txt");
		int i=fis.read();
		System.out.println("first char: "+(char)i);
		fis.close();

	}

}
//f.delete() to delete files
