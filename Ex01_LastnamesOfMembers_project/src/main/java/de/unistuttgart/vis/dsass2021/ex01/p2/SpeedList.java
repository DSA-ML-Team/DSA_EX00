package de.unistuttgart.vis.dsass2021.ex01.p2;
import java.lang.reflect.Array;
import java.util.Collections;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public abstract  class SpeedList<T> implements ISpeedList<T> {

	private static Node head;
	private static class Node<T> {
		private T obj;
		private Node<T> next;
		private Node<T> next8;
		
		public Node(T obj,Node next,Node nexy8) {
			this.obj = obj;
			this.next = next;
			this.next8 = next8;
		}
		
		public T getElement() { return obj; }
		public void setElement(T obj) {
		this.obj = obj;
		}
		public Node<T> getNext() {
		return next;
		}
		public void setNext(Node<T> next) {
		this.next = next;
		}
		public Node<T> getNext8() {
		return next8;
			}
		public void setNext8(Node<T> next8) {
		this.next8 = next8;
			}
		
		private int size;
		public int size() {
			Node<T> x = head;
			int i = 1;
			if (next == null) {
			return 0;
			}
			while (x.next != null) {
                 x=x.next;
                 i=i+1;
			}
			size = i;
			return size;
			}
		
		
		public void prepend(T t) {
			Node<T> n = new Node<T>(t, head, head);
			head.setNext(n);	
		}
		
        public void append(T t) {
        	Node<T> l = head;
        	while (l.getNext() != null)
        	l = l.getNext();
        	Node<T> n = new Node<T>(t, null,null);
        	l.setNext(n);
			
		}
		
			public T getElementAt(int pos) {
				checkElementPos(pos);
				return node(pos).obj;
			}
			
			public T getPrevious(int pos) {
				int pos2 = pos-1;
				checkElementPos(pos2);
				return node(pos2).obj;
				}
			
			private Node<T> node(int pos){
				Node x = head;
				for (int i = 0; i< pos; i++) {
					x= x.next;
				}
				return x;
			}
			
			private void checkElementPos(int pos) {
				if(!isElementPos(pos)) {
					throw new IndexOutOfBoundsException("Pos"+ pos +"Size"+ size());
				}
			}
			
			private boolean isElementPos(int pos) {
				return pos>=0 && pos<size;
			}
}
	
	
		

		
		
	
		
		

public class SpeedListTest {

	/**
	 * Just create additional tests by creating new methods according to this
	 * pattern.
	 */
	
	@Test
	public void testAppend() {
		SpeedList speedList = new SpeedList(); //Initialize object of class
		speedList.append(1); // call method of this object what you want to test
		assertEquals("Ausgabebeschreibung", "expected", "actual"); // compare the expected with the actual value
	}

	// Add your test methods here	











@Override
public int size() {
	// TODO Auto-generated method stub
	return 0;
}










@Override
public void prepend(T t) {
	// TODO Auto-generated method stub
	
}










@Override
public void append(T t) {
	// TODO Auto-generated method stub
	
}










@Override
public T getElementAt(int pos) {
	// TODO Auto-generated method stub
	return null;
}










@Override
public T getPrevious(int pos) {
	// TODO Auto-generated method stub
	return null;
}