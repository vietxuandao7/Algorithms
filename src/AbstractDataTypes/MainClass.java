package AbstractDataTypes;
import java.util.Stack;

import AbstractDataTypes.StackInteger;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInteger s = new StackInteger();
		
		s.push(1);
		System.out.println("Top Element: " + s.peek());
		System.out.println("Pop top element: " + s.pop());
		//System.out.println("Top Element: " + s.peek());
		
		Stack ss = new Stack();
		ss.push("2");
		System.out.println("Top Element: " + ss.peek());
		System.out.println("Pop top element: " + ss.pop());
		//System.out.println("Top Element: " + ss.peek());
		
	}

}
