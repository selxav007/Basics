package Properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteNotePad {

	public static void main(String[] args) throws IOException {
		//Create a file
/*		File file = new File(System.getProperty("user.dir")+"\\Note2.txt"); 
	//	File file = new File("C:\\Javabasics\\Note.txt"); 
		file.createNewFile();
		
		//Write a file
		FileWriter fwriter = new FileWriter(file);
		BufferedWriter bfwriter = new BufferedWriter(fwriter);
		bfwriter.write("Dileep first Line11133");
		bfwriter.newLine();
		bfwriter.write("Dileep second Line11133");
		//bfwriter.flush();
		bfwriter.close();
*/		
		//Read a File
		FileReader fReader = new FileReader(System.getProperty("user.dir")+"\\Note2.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		String x= "";
		while((x=bReader.readLine())!= null){
			System.out.println(x); 	
		}
	}
}
