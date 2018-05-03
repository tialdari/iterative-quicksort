package sorting;

import java.util.ArrayList;
import stack_implementation.MyStack;
import data.IndexPair;
import stack_implementation.EmptyStackException;
import java.util.Random;

public class QuickSort {
	
	public void swap(ArrayList<Integer> toBeSorted, int firstIndex, int secondIndex) {
		
		int temporary = toBeSorted.get(firstIndex);
		toBeSorted.set(firstIndex, toBeSorted.get(secondIndex));
		toBeSorted.set(secondIndex, temporary);
	}
	
	public int partition(ArrayList<Integer> toBeSorted, int start, int end, String pivotChoice) {
		
		int pivot;
		int temporary;
		
		
		if(pivotChoice == "last") {					//dla danego przedziału ArrayListy wyznaczamy pivota wg danego kryterium
			
			pivot = toBeSorted.get(end);				
	 
		}else if(pivotChoice == "random") {
		
			Random rdm = new Random();
			int random = start - 1;
			while(random < start) {
				random = rdm.nextInt(end);
			}
			pivot = toBeSorted.get(random);
			
			temporary = toBeSorted.get(end);
			toBeSorted.set(end, pivot);
			toBeSorted.set(random, temporary);
			
		
		}else if(pivotChoice == "median"){
		
			pivot = pivotMedian(toBeSorted, start, end);
			
			temporary = toBeSorted.get(end);
			toBeSorted.set(end, pivot);
			toBeSorted.set(toBeSorted.indexOf(pivot), temporary);
		}else {
			pivot = 0;
		}
		
		
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
		stack.setMaxHeight(1);
		
		
		while(!stack.isEmpty()) {
			
			int start = stack.peek().getFirstIndex();
			int end = stack.peek().getSecondIndex();
			
			if(stack.size() > stack.getMaxHeight()) {
				stack.setMaxHeight(stack.size());
			}

			stack.pop();
			
			
			
			int pivotIndex = partition(toBeSorted, start, end, "median");
			
			//System.out.println(start + " " + end + " "+ pivotIndex);

			
			if(start < pivotIndex - 1) {
				stack.push(new IndexPair(start, pivotIndex - 1));
			}
			
			if(end > pivotIndex + 1) {
				stack.push(new IndexPair(pivotIndex + 1, end));
			}
		}
		
		System.out.println("stack max size: " + stack.getMaxHeight());
	}
	
	public int pivotMedian(ArrayList<Integer> toBeSorted, int lowIndex, int highIndex) {		//wylicza pivota będącego medianą liczb: 
														//pierwszej, ostatniej i środkowej z danego przedziału ArrayListy	
		int pivotMedian = 0;
		int firstNumber = toBeSorted.get(lowIndex);
		int median = toBeSorted.get((int) Math.floor((lowIndex + highIndex) / 2));
		int lastNumber = toBeSorted.get(highIndex);
		
		double average = (firstNumber + lastNumber + median) / 3;					//średnia arytmetyczna wskazanych liczb
		
		int [] abs = new int[3];
		abs[0] = Math.abs((int)average - firstNumber);		//obliczanie wartości bezwzględnej różnicy pomiędzy każdą z liczb, 
		abs[1] = Math.abs((int)average - lastNumber);			//a średnią arytmetyczną
		
		abs[2] = Math.abs((int)average - median);
		
		
		int min = abs[0];
		
		for(int k = 0; k < 3; k++) {				//liczba, dla wyliczona wartość bezwzględna jest najmniejsza, będzie szukanych pivotem
			if(abs[k] < min) {					
			
			min = abs[k];
			}
		}
		
		if(min == abs[0]) {
			pivotMedian = firstNumber;
		}else if (min == abs[1]) {
			pivotMedian = lastNumber;
		}else if(min == abs[2]) {
			pivotMedian = median;
		}	
		return pivotMedian;
	}
	
	

	
}
