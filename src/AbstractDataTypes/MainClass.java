package AbstractDataTypes;
import java.util.Stack;

import AbstractDataTypes.StackInteger;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInteger s = new StackInteger();
		long tStart = System.currentTimeMillis();
		s.push(1);
		long eEnd = System.currentTimeMillis();
		System.out.println("Custom Stack Running time: " + (eEnd - tStart));
		System.out.println("Top Element: " + s.peek());
		System.out.println("Pop top element: " + s.pop());
		//System.out.println("Top Element: " + s.peek());
		
		Stack ss = new Stack();
		long ttStart = System.currentTimeMillis();
		ss.push("Stte");
		long etEnd = System.currentTimeMillis();
		System.out.println("Systems Stack Running time: " + (etEnd - ttStart));
		System.out.println("Top Element: " + ss.peek());
		System.out.println("Pop top element: " + ss.pop());
		//System.out.println("Top Element: " + ss.peek());
		
	}

}
