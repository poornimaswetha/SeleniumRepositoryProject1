package Session24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class DataProperties {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Properties Prop=new Properties();
		FileInputStream fis=new FileInputStream("data.properties");
		Prop.load(fis);
		System.out.println(Prop.getProperty("url"));
		System.out.println(Prop.getProperty("email"));
		System.out.println(Prop.getProperty("pwd"));
		
		
		Prop.setProperty("result", "Pass");
		FileOutputStream fos=new FileOutputStream("data.properties");
		Prop.store(fos, null);
		fis.close();
		fos.close();
	}

}
