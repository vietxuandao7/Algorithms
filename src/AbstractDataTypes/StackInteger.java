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

}


/**

* Increase the size if we have less than 5 spot in the array.

* */

private void increaseStackSize()

{

stack = Arrays.copyOf(stack, currentMaxSize+10);

}


public void push(int key)

{


stack[currentIndex++] = key;

if(currentMaxSize - currentIndex < 5)

{

increaseStackSize();

}

}


public int pop()

{

return stack[currentIndex--];

}


public boolean isEmpty()

{

return currentIndex == -1;

}


public int peek()

{

return stack[currentIndex];

}




}

