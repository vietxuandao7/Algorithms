package AbstractDataTypes;

import java.util.Arrays;

public class StackObject {
	private int currentMaxSize;
	private Object [] stack;
	private int currentIndex;


	//Default Constructor
	public StackObject()
	{
		currentIndex = -1;
		currentMaxSize = 10;
		stack = new Object[currentMaxSize];
	}

	/**
	* Increase the size if we have less than 5 spot in the array.
	* */
	private void increaseStackSize()
	{
		stack = Arrays.copyOf(stack, currentMaxSize+10);
	}
	
	/**
	 * @param key is the value that we insert into Stack.
	 * */
	public void push(Object key)	
	{
		stack[++currentIndex] = key;
		if(currentMaxSize - currentIndex < 5)
		{	
			increaseStackSize();	
		}
	
	}
	
	/**
	 * @return top element (last insert) in the Stack.
	 * The top element in stack has been changed. The element that 
	 * is inserted before this element now become top element.
	 * */
	public Object pop()
	{
		return stack[currentIndex--];
	}
	
	/**
	 * @return true if Stack has no element, otherwise return false.
	 * */
	public boolean isEmpty()
	{
		return currentIndex == -1;
	}
	
	
	/**
	 * @return top element (last insert) in the Stack.\
	 * No update in Stack. The top element is stay the same
	 * */
	public Object peek()
	{
		return stack[currentIndex];
	}
}
