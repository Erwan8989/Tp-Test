package fr.emse.dsi.junit;
public class Queue<E> {

	private E elem;

	public boolean isEmpty() {
		
		if(this.getElem(this) == null) {
			return true;
		} else {
			return false; 
		}
	}
	

	public void push(E elem) {
		if(elem == null) {
			this.elem = null;
		} else {
			this.elem = elem;
		}
	}

	public E pop() {
		// TODO
		return null;
	}
	
	public E getElem(Queue<E> queue) {
		return this.elem;
	}
	
}