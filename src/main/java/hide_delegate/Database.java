package hide_delegate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Database {
	private final Properties properties;
	private final String filename;
	
	
	public Database(String filename) {
		this.filename = filename;
		properties = new Properties();
		
		try (InputStream is = new FileInputStream(filename)) {
			properties.load(is);
		} catch (IOException e) {
			
		}
	}
	
	public void set(String key, String value) {
		properties.setProperty(key, value);
	}
	
	public String get(String key) {
		return properties.getProperty(key, null);
	}
	
	public void update() throws FileNotFoundException, IOException {
		properties.store(new FileOutputStream(filename), "");
//		properties.storeToXML(new FileOutputStream(filename), "");
	}

	public Properties getProperties() {
		return properties;
	}
}
