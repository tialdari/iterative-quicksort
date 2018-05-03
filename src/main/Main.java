package main;

import data.CSVparser;
import stack_implementation.MyStack;
import data.IndexPair;
import stack_implementation.EmptyStackException;
import sorting.QuickSort;
import java.util.ArrayList;
import sorting.Print;


public class Main {
	public static void main (String [] args) throws EmptyStackException{
		
		CSVparser parser = new CSVparser("z3data33.csv");
		parser.read();
		
		
		ArrayList<Integer> demoList = new ArrayList<Integer>();
		
		demoList.add(3);
		demoList.add(6);
		demoList.add(10);
		demoList.add(4);
		demoList.add(20);
		demoList.add(100);
		demoList.add(3);
		demoList.add(4);
		demoList.add(8);

		
		QuickSort qs = new QuickSort();
	//	qs.sorting(demoList);
		
		Print print11 = new Print("z3data11.csv");
		print.printLast();
		
	
		
	
		
	}
}
