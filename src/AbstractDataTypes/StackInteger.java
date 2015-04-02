package AbstractDataTypes;
import java.util.Arrays;

public class StackInteger
{

	private int currentMaxSize;
	private int [] stack;
	private int currentIndex;


	//Default Constructor
	public StackInteger()
	{
		currentIndex = -1;
		currentMaxSize = 10;
		stack = new int[currentMaxSize];
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
	public void push(int key)	
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
	public int pop()
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
	public int peek()
	{
		return stack[currentIndex];
	}
}

