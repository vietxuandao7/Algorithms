package AbstractDataTypes;

public class QueueObject {
	private Object [] queue;
	private int lastQueuePos;
	private int currentMaxSize;
	
	
	/**
	 * Default Constructor
	 * */
	public QueueObject ()
	{
		currentMaxSize = 10;
		queue = new Object [currentMaxSize];
		lastQueuePos = 0;
	}
	
	/**
	 * @param e add items into the queue (Integer, String, ...etc)
	 * */
	public void enqueue(Object e)
	{
		queue[lastQueuePos++] = e;
	}
	
	

	/**
	 * @return object remove item which is first inserted into the queue
	 * */
	public Object dequeue()
	{
		Object e = null;
		for(int i = 0; i < lastQueuePos; ++i)
		{
			if(i == 0)
			{
				e = queue[i];
			}
			else
			{
				queue[i-1] = queue[i];
			}
		}
		if(lastQueuePos > 0)
			--lastQueuePos;
		return e;
	}
	/**
	 * 
	 * 
	 * */
	
	public Object peek()
	{
		return queue[0];
	}
	

	/**
	 * @return int number of items int the queue
	 * */
	public int size()
	{
		return lastQueuePos;
	}

	/**
	 * @return boolean return whether the queue has no items
	 * */
	public boolean isEmpty()
	{
		return lastQueuePos == 0;
	}
	
}
