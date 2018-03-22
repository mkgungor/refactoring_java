package hide_delegate.after;

import java.io.IOException;
import java.util.Enumeration;

public class Main {

	public static void main(String[] args) {

		try {
			AddressFile file = new AddressFile("address.txt");
			file.set("Hanjimin", "test1@dgit.or.kr");
			file.set("Song Hae Gyo", "test2@korea.com");
			file.set("Kim Min Su", "test3@naver.com");
			file.update();

			Enumeration<?> e = file.names();
			while (e.hasMoreElements()) {
				String name = (String) e.nextElement();
				String mail = file.get(name);
				System.out.printf("name=%s, mail=%s%n", name, mail);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
