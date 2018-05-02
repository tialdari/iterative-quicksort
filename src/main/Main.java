package main;

import data.CSVparser;

public class Main {
	public static void main (String [] args) {
		
		CSVparser parser = new CSVparser("z3data11.csv");
		parser.read();
		
		for(Integer number : parser.getFileData()) {
			System.out.print(number + " ");
		}
	}
}
