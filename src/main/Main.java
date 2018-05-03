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
		
		Print printer11 = new Print("z3data11.csv");
		printer11.printLast();
		printer11.printMedian();
		printer11.printRandom();
		
		Print printer12 = new Print("z3data12.csv");
		printer12.printLast();
		printer12.printMedian();
		printer12.printRandom();
		

		Print printer13 = new Print("z3data13.csv");
		printer13.printLast();
		printer13.printMedian();
		printer13.printRandom();
		

		Print printer21 = new Print("z3data21.csv");
		printer21.printLast();
		printer21.printMedian();
		printer21.printRandom();
		

		Print printer22 = new Print("z3data22.csv");
		printer22.printLast();
		printer22.printMedian();
		printer22.printRandom();
		

		Print printer23 = new Print("z3data23.csv");
		printer23.printLast();
		printer23.printMedian();
		printer23.printRandom();
		

		Print printer31 = new Print("z3data31.csv");
		printer31.printLast();
		printer31.printMedian();
		printer31.printRandom();
		

		Print printer32 = new Print("z3data32.csv");
		printer32.printLast();
		printer32.printMedian();
		printer32.printRandom();
		

		Print printer33 = new Print("z3data33.csv");
		printer33.printLast();
		printer33.printMedian();
		printer33.printRandom();
		
		
	
		
	
		
	}
}
