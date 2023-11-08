package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadfFromProperties {

	public static void main(String[] args) throws IOException  {
		// step 1: Convert physical file into java readable object
		// new FileInputStream()---> throws FileNotFoundException
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
         // step 2: Create an instance for properties class
		Properties property=new Properties();
		
		//step 3: Load all key-value pairs from fis to properties object
		// Property.load(fis) ----> throws IOException
		property.load(fis);
		
		//Step 4: Fetch data
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("timeouts"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));
		
	}

}
