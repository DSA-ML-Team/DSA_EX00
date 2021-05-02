package de.unistuttgart.vis.dsass2021.ex01.p2;

/**
 * 
 * Nutze diese Klasse, um die Methoden aus dem Interface zu implementieren. Der
 * angezeigte Fehler ist beabsichtigt und kommt vor, weil die Methoden des
 * Interfaces noch nicht implementiert wurden. Mit Rechtsklick auf diesen Fehler
 * kannst du 'add unimplemented methods' anklicken, um dir automatisch eine
 * leere Methoden zu erzeugen.
 * 
 * 
 */

public class SpeedList<T> implements ISpeedList<T> {
	int size;

	public static class Node<T> {

		T obj;
		Node<T> next; // the next node
		Node<T> fast;// the next n node

		public Node(T obj, Node<T> next, Node<T> fast) {

			this.obj = obj;
			this.next = next;
			this.fast = fast;

		}

		public Node() {
			obj = null;
			next = null;
			fast = null;
		}

		public T getObj() {
			return obj;
		}

		public void setObj(T obj) {
			this.obj = obj;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public Node<T> getFast() {
			return fast;
		}

		public void setFast(Node<T> fast) {
			this.fast = fast;
		}

	}

	private Node<T> head;

	@Override
	public int size() {
		Node<T> x = head;
		int i = 1;

		if (x.next == null) {
			return 0;
		}

		while (x.next != null) {
			x = x.next;
			i++;
		}
		this.size = i;

		return i;
	}

	@Override
	public void prepend(T t) {
		int n = 3;// die Weite(n), n = 3
		Node<T> node = new Node<T>(t, head, head);
		head = node;
		this.size = size();
		if (size >= n) {
			Node<T> speedNode = Node(n);
			node.setFast(speedNode);

		}
	}

	@Override
	public void append(T t) {
		int n = 3;// die Weite(n), n = 3
		Node<T> lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		Node x = new Node(t, null, null);
		this.size = size();
		if (size < n) {
			lastNode.setNext(x);
		} else {
			lastNode.setNext(x);
			Node<T> speedNode = Node(size - n - 1);
			speedNode.setFast(x);

		}

	}

	@Override
	public T getElementAt(int pos) throws IndexOutOfBoundsException {
		checkIndex(pos);
		return Node(pos).obj; // use a method named Node(int index) to get NEXT
	}

	private void checkIndex(int pos) {
		if (pos < 0 || pos >= size) {
			throw new IndexOutOfBoundsException("The position " + pos + " can't be found");
		}

	}

	public Node<T> Node(int index) {// use index to search a Node
		Node<T> x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	@Override

	public T getPrevious(int pos) {
		// TODO Auto-generated method stub
		return null;

	}

	
	
	public String toString() {

		if (size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder().append("[");
		Node<T> x = head;
		for (Node i = x; i != null; i = i.next) {
			sb.append(i.obj);
			if (i.next == null) {
				return sb.append("]").toString();
			}
			sb.append(",");
		}
		return sb.toString();

	}

}
