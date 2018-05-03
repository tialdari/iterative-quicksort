package sorting;

import java.util.ArrayList;

public class QuickSort {
	
	public void swap(ArrayList<Integer> toBeSorted, int firstIndex, int secondIndex) {
		
		int temporary = toBeSorted.get(firstIndex);
		toBeSorted.set(firstIndex, toBeSorted.get(secondIndex));
		toBeSorted.set(secondIndex, temporary);
	}
	
	public int partition(ArrayList<Integer> toBeSorted, int start, int end) {

		int pivot = toBeSorted.get(toBeSorted.size() - 1);						// set the pivot as the last element
		
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
	
}
