package stack_implementation;

import stack_implementation.EmptyStackException;


public interface IStack<T> {
	
	public boolean isEmpty();
	public T pop() throws EmptyStackException;
	public int size();
	public void push(T t);
	
}
