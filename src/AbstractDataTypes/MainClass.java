package AbstractDataTypes;
import java.util.Stack;

import AbstractDataTypes.StackInteger;
public class MainClass {

	public static void main(String[] args) {
		//Test StackInteger
		StackInteger s = new StackInteger();
		long tStart = System.currentTimeMillis();
		s.push(1);
		s.push(2);
		long eEnd = System.currentTimeMillis();
		System.out.println("Custom Stack Running time: " + (eEnd - tStart));
		System.out.println("Top Element: " + s.peek());
		System.out.println("Pop top element: " + s.pop());
		System.out.println("Top Element: " + s.peek());
		System.out.println();
		
		//Test Stack System
		Stack ss = new Stack();
		long ttStart = System.currentTimeMillis();
		ss.push("Stack");
		ss.push(3);
		long etEnd = System.currentTimeMillis();
		System.out.println("Systems Stack Running time: " + (etEnd - ttStart));
		System.out.println("Top Element: " + ss.peek());
		System.out.println("Pop top element: " + ss.pop());
		System.out.println("Top Element: " + ss.peek());
		System.out.println();
		
		//Test Stack Object
		StackObject sss = new StackObject();
		long tttStart = System.currentTimeMillis();
		sss.push("StackObject");
		sss.push(5);
		long ettEnd = System.currentTimeMillis();
		System.out.println("StackObject Running time: " + (ettEnd - tttStart));
		System.out.println("Top Element: " + sss.peek());
		System.out.println("Pop top element: " + sss.pop());
		System.out.println("Top Element: " + sss.peek());
		System.out.println();
		
		//Test QueueObject
		QueueObject qo = new QueueObject();
		System.out.println("Is the queue Empty ? : " + qo.isEmpty());
		qo.enqueue(1);
		qo.enqueue(2);
		qo.enqueue(3);
		qo.enqueue(4);
		qo.enqueue(5);
		qo.enqueue(6);
		System.out.println("Remove first element that we insert: " + qo.dequeue());
		System.out.println("Peek at the first element in the queue " + qo.peek());
		System.out.println("Is the queue Empty ? : " + qo.isEmpty());
		
		
		
		
		
	}

}
