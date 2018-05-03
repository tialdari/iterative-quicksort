package sorting;

import java.util.ArrayList;

public class QuickSort {
	
	public void swap(ArrayList<Integer> array, int firstIndex, int secondIndex) {
		
		int temporary = array.get(firstIndex);
		array.set(firstIndex, array.get(secondIndex));
		array.set(secondIndex, temporary);
	}
	
}
