package data;

import data.CSVparser;

public class IndexPair {
	
	private int firstIndex;
	private int secondIndex;
	
	public IndexPair() {
		CSVparser parser = new CSVparser("z3data11.csv");
		firstIndex = parser.getFileData().get(0);
		secondIndex = parser.getFileData().get(parser.getFileData().size() - 1);
	}
	
	public IndexPair(int firstIndex, int secondIndex) {
		this.firstIndex = firstIndex;
		this.secondIndex = secondIndex;
	}
	
	
	
	public int getFirstIndex() {
		return firstIndex;
	}
	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}
	public int getSecondIndex() {
		return secondIndex;
	}
	public void setSecondIndex(int secondIndex) {
		this.secondIndex = secondIndex;
	}
	
	
}
