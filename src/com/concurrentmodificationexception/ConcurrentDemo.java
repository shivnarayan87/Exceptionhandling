package com.concurrentmodificationexception;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentDemo {
	
	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();
		 
	        // Adding element to ArrayList
	        // using add() method
	 
	        // Custom integer input entries
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	 
	        // Display the value of ArrayList
	        System.out.println("List Value Before Iteration:"
	                           + list);
	 
	        // Creating an iterator object
	        // to iterate over the ArrayList
	        Iterator<Integer> itr = list.iterator();
	 
	        // Condition check
	        // it holds true till there is single element
	        // remaining in the List
	        while (itr.hasNext()) {
	 
	            // next() method() loos out for next element in
	            // the List
	            Integer value = itr.next();
	 
	            // Here we are trying to remove the one entry of
	            // ArrayList base on the given if condition and
	            // hence
	 
	            // We will get Concurrent ModificationException
//	            if (value.equals(3))
//	                list.remove(value);
	            
	            // We will get Resolve Concurrent ModificationException by iterator remove method calling
	            if (value.equals(3))
	                itr.remove();
	            
	        }
	        // Display the value of ArrayList
	        System.out.println("List Value After iteration:"
	                           + list);
	}

}
