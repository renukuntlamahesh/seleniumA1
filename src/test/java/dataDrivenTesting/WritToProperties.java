package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritToProperties {

	public static void main(String[] args) throws IOException {
		
		//step 1: Convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		
		//step 2: Creat an instance of properties class
		
		Properties property = new Properties();
		
		//Step 3:load all the Key-value pairs into properties object
		property.load(fis);
		
		//step 4:write to properties object
		property.put("user2", "trainee");
		property.put("pwd2", "trainee");
		
		//step 5: save the file and run
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.properties");
		property.store(fos, "updated successfully");
		

	}

}
