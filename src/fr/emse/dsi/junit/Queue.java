package fr.emse.dsi.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.util.*;


public class Queue<E> {

	private E elem;
	private List list;

	public boolean isEmpty() {
		System.out.println("IS EMPTY !!!!! " + this.list);
		if(this.getElem() == null || this.getSize() == 0) 
			return true;
		else 
			return false; 
	}

	public void push(E elem) {
		List<String> list = new ArrayList<String>();
		
		if(elem == null) 
			this.elem = null;
		 else 
			 list.add((String) elem);
			
		
		this.list = list;
		System.out.println("Push" + this.list);
	}
	
	public static int[] removeFirstElement(int[] arr) {
        int newArr[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }

	public E pop() {
		E elembis = this.getElem();
		elembis = (E) elembis.toString().replace("[","").replace("]","");

		System.out.println("Get elem " + elembis);
		this.list.remove(0);
		
		System.out.println("Après remove " + this.list);
		return elembis;
	}
	
	public E getElem() {
		System.out.println("Get elem " + this.list);
		return (E) this.list;
	}
	
	public int getSize() {
		System.out.println("Get elem " + this.list);
		List test3 = this.list;
		return test3.size();
	}
}