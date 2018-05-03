package sorting;

import sorting.QuickSort;
import data.CSVparser;
import java.util.ArrayList;
import stack_implementation.EmptyStackException;

public class Print {
	
	private String name;
	private ArrayList<Integer> sortedNumbers;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Integer> getSortedNumbers() {
		return sortedNumbers;
	}

	public void setSortedNumbers(ArrayList<Integer> sortedNumbers) {
		this.sortedNumbers = sortedNumbers;
	}

	public Print() {
		CSVparser parser = new CSVparser("z3data11.csv");
		parser.read();
		QuickSort qs = new QuickSort();
		try{
			qs.sorting(parser.getFileData());
		}catch(EmptyStackException ex) {}
		
		sortedNumbers = parser.getFileData();
	}
	
	public Print(String name) {
		CSVparser parser = new CSVparser(name);
		parser.read();
		QuickSort qs = new QuickSort();
		try{
			qs.sorting(parser.getFileData());
		}catch(EmptyStackException ex) {}
		
		sortedNumbers = parser.getFileData();
	}
	
	
	public void print() {
		
		System.out.println(String.format("nazwa pliku: %f \n ilość elementów: %d \n %d", getName(), getSortedNumbers().size()));
		
	}
	
}
