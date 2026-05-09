package files;
import java.io.FileWriter;
public class saveFile {

	public static void main(String[] args) throws Exception{
		int a=10;
		int b=20;
		int sum=a+b;
		FileWriter fw=new FileWriter("result.txt");
		fw.write("sum: "+sum);
		fw.close();
		System.out.println("saved in file.");

	}

}
//String line;
//while((line=br.readLine()!=null)
//read: input, write: output