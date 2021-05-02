package de.unistuttgart.vis.dsass2021.ex01.p2;
import java.lang.reflect.Array;
import java.util.Collections;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import de.unistuttgart.vis.dsass2021.ex01.p2.SpeedList.Node;


/**
 * 
 * Nutze diese Klasse, um die Methoden aus dem Interface zu implementieren.
 * Der angezeigte Fehler ist beabsichtigt und kommt vor, weil die Methoden des Interfaces noch nicht implementiert wurden.
 * Mit Rechtsklick auf diesen Fehler kannst du 'add unimplemented methods' anklicken, um dir automatisch eine leere Methoden zu erzeugen.
 * 
 * 
 */

public class SpeedList<T> implements ISpeedList<T> {

	class Node<T> {
		private T obj;
		private Node<T> next;
		private Node<T> next8;
		private Node<T> head;
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
		return next;
			}
		public void setNext8(Node<T> next8) {
		this.next = next;
			}
		
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
			return i;
			}
		
		
		public void prepend(T t) {
			//head = new Node<T> (t, head,);
		}
		
        public void append(T t) {
			/*Node<T> lastNode = head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;*/
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
				return pos>=0 && pos<size();
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
