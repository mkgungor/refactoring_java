package tease_apart_inheritance.after.add;

import java.io.IOException;

public abstract class CSVPrinter {
	protected final CSVReader csvReader;
	
	protected CSVPrinter(CSVReader csvReader) {
		this.csvReader = csvReader;
	}

	public String[] readCSV() throws IOException {
		return csvReader.readCSV();
	}
	
	public abstract void print() throws IOException;
}
