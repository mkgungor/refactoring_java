package hide_delegate;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;



public class Main {

	public static void main(String[] args) {

		try {
			AddressFile file = new AddressFile("address.txt");
			file.getDatabase().set("Hanjimin", "test1@dgit.or.kr");
			file.getDatabase().set("Song Hae Gyo", "test2@korea.com");
			file.getDatabase().set("Kim Min Su", "test3@naver.com");
			file.getDatabase().update();
			
			Enumeration<String> e = (Enumeration<String>) file.names();
			while(e.hasMoreElements()) {
				String name = e.nextElement();
				String mail = file.getDatabase().get(name);
				System.out.printf("name=%s, mail=%s%n", name, mail);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
