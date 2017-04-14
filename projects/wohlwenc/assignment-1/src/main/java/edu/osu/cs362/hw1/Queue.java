package edu.osu.cs362.hw1;

public class Queue<T> {
	
	private Node<T> start;
	private Node<T> end;
	private int size;
	
	public Queue() {
		start = null;
		end = null;
		size = 0;
	}
	
	public void add(T elem) {
		Node<T> newElem = new Node<>(elem);
		if(size == 0) {
			start = newElem;
			end = newElem;
			size++;
		}
		else {
			start.setNext(newElem);
			start = newElem;
			size++;
		}
	}
	
	public T remove() {
		Node<T> ret = end;
		if(ret != null) {
			end = ret.getNext();
			ret.setNext(null);
		}
		size--;
		return ret.getElem();
	}
	
	public T peek() {
		return end.getElem();
	}
	
	public int size() {
		return size;
	}
	
	private class Node<U> {
		Node<U> next;
		U elem;
		
		public Node(U elem) {
			this.elem = elem;
			next = null;
		}
		
		public U getElem() {
			return elem;
		}

		public void setNext(Node<U> next) {
			this.next = next;
		}
		
		public Node<U> getNext() {
			return next;
		}
		
	};
}
