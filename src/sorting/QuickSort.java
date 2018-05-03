package sorting;

import java.util.ArrayList;
import stack_implementation.MyStack;
import data.IndexPair;
import stack_implementation.EmptyStackException;

public class QuickSort {
	
	public void swap(ArrayList<Integer> toBeSorted, int firstIndex, int secondIndex) {
		
		int temporary = toBeSorted.get(firstIndex);
		toBeSorted.set(firstIndex, toBeSorted.get(secondIndex));
		toBeSorted.set(secondIndex, temporary);
	}
	
	public int partition(ArrayList<Integer> toBeSorted, int start, int end) {

		int pivot = toBeSorted.get(end);						// set the pivot as the last element
		
		int pivotIndex = start;
		
		for (int i = start; i < end; i ++) {
			
			if(toBeSorted.get(i) <= pivot) {
				swap(toBeSorted, i, pivotIndex);				//at the first index nothing happens, since i and pivotIndex are the same index
				pivotIndex++;
			}
		}
		
		swap(toBeSorted, pivotIndex, end);
		
		return pivotIndex;
	}
	
	public void sorting(ArrayList<Integer> toBeSorted) throws EmptyStackException {
		
		MyStack<IndexPair> stack = new MyStack<IndexPair>();
		
		stack.push(new IndexPair(0, toBeSorted.size() - 1));
		
		
		while(!stack.isEmpty()) {
			
			int start = stack.peek().getFirstIndex();
			int end = stack.peek().getSecondIndex();

			stack.pop();
			
			int pivotIndex = partition(toBeSorted, start, end);
			
			System.out.println(start + " " + end + " "+ pivotIndex);

			
			if(start < pivotIndex - 1) {
				stack.push(new IndexPair(start, pivotIndex - 1));
			}
			
			if(end > pivotIndex + 1) {
				stack.push(new IndexPair(pivotIndex + 1, end));
			}
		}
	}
	
}
