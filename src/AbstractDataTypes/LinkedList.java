package AbstractDataTypes;
public class LinkedList
{
	
	private Node head;
	private int listCount;
	
	/**
	 * Default Constructor
	 * */
	public LinkedList()
	{
		head = new Node(null);
		listCount = 0;
	}
	
	/**
	 * @param data is element that is appended to the LinkedList
	 * */
	public void add(Object data)
	{
		Node temp = new Node(data);
		Node current = head;
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		current.setNext(temp);
		listCount++;
	}
	
	/**
	 * @param data is element that is appended to the LinkedList
	 * @param index is position of the element in the LinkedList
	 * */
	public void add(Object data, int index)
	{
		Node temp = new Node(data);
		Node current = head;
		for(int i = 1; i < index && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		temp.setNext(current.getNext());
		current.setNext(temp);
		listCount++;
	}
	
	/**
	 * @param index is position of the element in the LinkedList
	 * @return Object 
	 */
	public Object get(int index)
	{
		if(index <= 0)
			return null;
		
		Node current = head.getNext();
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return null;
			
			current = current.getNext();
		}
		return current.getData();
	}
	
	
	
	/**
	 * @param index is position of the element in the LinkedList
	 * @return Object
	 */
	public boolean remove(int index)
	{
		if(index < 1 || index > size())
			return false;
		
		Node current = head;
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return false;
			
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		listCount--; 
		return true;
	}
	
	/**
	 * @return int size of the LinkedList
	 */
	public int size()
	{
		return listCount;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		Node current = head.getNext();
		String output = "";
		while(current != null)
		{
			output += "[" + current.getData().toString() + "]";
			current = current.getNext();
		}
		return output;
	}
	
	private class Node
	{
		Node next;
		Object data;

		/**
		 * @param _data 
		 */
		public Node(Object _data)
		{
			next = null;
			data = _data;
		}
		
		/**
		 * @param _data
		 * @param _next
		 */
		public Node(Object _data, Node _next)
		{
			next = _next;
			data = _data;
		}
		
		
		/**
		 * @return object
		 */
		public Object getData()
		{
			return data;
		}
		
		/**
		 * @param _data
		 */
		public void setData(Object _data)
		{
			data = _data;
		}
		
		/**
		 * @return
		 */
		public Node getNext()
		{
			return next;
		}
		
		/**
		 * @param _next
		 */
		public void setNext(Node _next)
		{
			next = _next;
		}
	}
}