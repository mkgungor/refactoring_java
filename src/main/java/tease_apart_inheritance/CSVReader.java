package tease_apart_inheritance;

import java.io.*;
import java.util.regex.*;

public abstract class CSVReader {
	protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*"); 
	//콤마 앞위에 공백(A whitespace character: [ \t\n\x0B\f\r]) 포함 
	//test ,test    test, test     test , test    

	public abstract String[] readCSV() throws IOException;

	public abstract void close() throws IOException;
}
