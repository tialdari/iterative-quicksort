package main;

import data.CSVparser;
import stack_implementation.MyStack;
import stack_implementation.IStack;
import data.IndexPair;
import stack_implementation.EmptyStackException;


public class Main {
	public static void main (String [] args) throws EmptyStackException{
		
		CSVparser parser = new CSVparser("z3data11.csv");
		parser.read();
		
//		for(Integer number : parser.getFileData()) {
//			System.out.print(number + " ");
//		}
//		
		
		MyStack stack = new MyStack<IndexPair>();
		
		IndexPair ip = new IndexPair(1, 4);
		stack.push(ip);
		System.out.println(((IndexPair) stack.pop()).getFirstIndex());

		
	}
}
