package sorting;

import sorting.QuickSort;
import data.CSVparser;
import java.util.ArrayList;
import stack_implementation.EmptyStackException;

public class Print {
	
	private String name;
	private ArrayList<Integer> sortedNumbers;
	private QuickSort qs;
	
	public Print() {
		CSVparser parser = new CSVparser("z3data11.csv");
		parser.read();
		qs = new QuickSort();
		try{
			qs.sorting(parser.getFileData(), "last");
		}catch(EmptyStackException ex) {}
		
		sortedNumbers = parser.getFileData();
	}
	
	public Print(String name) {
		this.name = name;
		CSVparser parser = new CSVparser(name);
		parser.read();
		qs = new QuickSort();
		
		sortedNumbers = parser.getFileData();
	}
	
	
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

	
	
	
	public void printLast() throws EmptyStackException{
		
		qs.sorting(getSortedNumbers(), "last");
		System.out.println(String.format("nazwa pliku: %s   ilość elementów: %d   pivot: ostatni "
				+ " maksymalna wysokość stosu: %d  liczba zamian: %d ", getName(), getSortedNumbers().size(), 
				qs.getStack().getMaxHeight(), qs.getSwapNumber()));
	}
	
	public void printMedian() throws EmptyStackException{
		
		qs.sorting(getSortedNumbers(), "median");
		System.out.println(String.format("nazwa pliku: %s   ilość elementów: %d   pivot: mediana "
				+ " maksymalna wysokość stosu: %d  liczba zamian: %d ", getName(), getSortedNumbers().size(), 
				qs.getStack().getMaxHeight(), qs.getSwapNumber()));
	}
	
	public void printRandom() throws EmptyStackException{
		
		qs.sorting(getSortedNumbers(), "random");
		System.out.println(String.format("nazwa pliku: %s   ilość elementów: %d   pivot: losowy "
				+ " maksymalna wysokość stosu: %d  liczba zamian: %d ", getName(), getSortedNumbers().size(), 
				qs.getStack().getMaxHeight(), qs.getSwapNumber()));
	}
	
}
