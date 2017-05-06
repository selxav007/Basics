package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		//FileInputStream fis = new FileInputStream("C:\\Javabasics\\src\\Properties\\Properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\Properties\\Properties");
		prop.load(fis);
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Age"));
		System.out.println(prop.getProperty("Course"));
		System.out.println(System.getProperty("user.dir"));
	}
}
