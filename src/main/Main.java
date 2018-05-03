package main;

import data.CSVparser;
import stack_implementation.MyStack;
import data.IndexPair;
import stack_implementation.EmptyStackException;
import sorting.QuickSort;
import java.util.ArrayList;


public class Main {
	public static void main (String [] args) throws EmptyStackException{
		
		CSVparser parser = new CSVparser("z3data11.csv");
		parser.read();
		
	
		QuickSort qs = new QuickSort();
		
		ArrayList<Integer> demoList = new ArrayList<Integer>();
		
		demoList.add(1);
		demoList.add(7);
		demoList.add(3);
		demoList.add(8);
		demoList.add(0);
		demoList.add(2);
		demoList.add(4);


		qs.sorting(demoList);
		
		for(Integer number : demoList) {
			System.out.print(number + " ");
		
		}
			
	}
}
