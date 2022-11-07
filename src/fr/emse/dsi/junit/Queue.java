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
		if(this.getElem() == null || this.getSize() == 0) 
			return true;
		else 
			return false; 
	}

	public void push(E elem) {
		List<String> list = new ArrayList<String>();
		String stringelem = (String) elem;
		String test5 = String.valueOf(elem);
		
		E elembis = (E) String.valueOf(this.getElem());
		elembis = (E) elembis.toString().replace("[", "").replace("]", "");
		System.out.println("Elementbis " + elembis);
		
		if(elem == null) {
			this.elem = null;
		} else if (elembis == "null") {
			list.add(test5);
			System.out.println("00000000000000000000000000 ");
		}
		 else {
			 list.add((String) elembis);
			 list.add((String) elem);
		 }
		System.out.println("Après push " + list);
		this.list = list;
	}
	
	public static int[] removeFirstElement(int[] arr) {
        int newArr[] = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        return newArr;
    }

	public E pop() {
		E elembis = (E) list.get(0);
//		elembis = (E) elembis.toString().replace("[","").replace("]","");
//		System.out.println("GET 0 " + list.get(0));
//		Object test6 = list.get(0);
		this.list.remove(0);
		
		return elembis;
	}
	
	public E getElem() {
		System.out.println(this.list);
		return (E) this.list;
	}
	
	public int getSize() {
		List test3 = this.list;
		return test3.size();
	}
}