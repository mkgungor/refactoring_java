package tease_apart_inheritance.after.add;

import java.io.*;
import java.util.regex.*;

public class CSVReader {
	protected final BufferedReader bufReader;

	protected CSVReader(BufferedReader bufReader) {
		this.bufReader = bufReader;
	}

	protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");
	// 콤마 앞위에 공백(A whitespace character: [ \t\n\x0B\f\r]) 포함
	// test ,test test, test test , test

	public String[] readCSV() throws IOException {
		String line = bufReader.readLine();
		
		if (line != null) {
			String[] item = CSV_PATTERN.split(line);
			return item;
		}
		return null;
	}

	public void close() throws IOException {
		bufReader.close();
	}
}
