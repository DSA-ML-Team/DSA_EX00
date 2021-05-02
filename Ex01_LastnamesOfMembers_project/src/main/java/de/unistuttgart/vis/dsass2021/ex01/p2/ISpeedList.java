package de.unistuttgart.vis.dsass2021.ex01.p2;

/**
 * A simple list interface
 * 
 * @param <T>
 *            The type of list element
 */
public interface ISpeedList<T> {

	/**
	 * 
	 * 1 Point if correctly implemented
	 * 
	 * Returns the current number of elements in the list
	 * 
	 * @return Current number of elements in the list
	 */
	public int size();

	/**
	 * 4 Points if correctly implemented
	 * 
	 * Inserts an element at the beginning of the list
	 * 
	 * @param item
	 *            Item to be inserted
	 */
	public void prepend(T t);

	/**
	 * 4 Points if correctly implemented
	 * 
	 * Inserts an element at the end of the list
	 * 
	 * @param item
	 *            Item to be inserted
	 */
	public void append(T t);
	
	/**
	 * 5 Points if correctly implemented
	 * 
	 * Returns the element at the specified position in the list
	 * 
	 * @param pos
	 *            The position of the element in the list starting from 0
	 * 
	 * @return The specified element in the list
	 * 
	 * @throws IndexOutOfBoundsException
	 *             If the requested element is out of range
	 */
	public T getElementAt(int pos);
	
	/**
	 * 
	 * 2 Points
	 * 
	 * Returns the left neighbor node's value of a specified position in the list
	 * 
	 * @param pos
	 *            The position of the selected element in the list starting from 0
	 * 
	 * @return A array with the neighbor nodes 
	 * 
	 * @throws IndexOutOfBoundsException
	 *             If the requested element is out of range
	 */
	public T getPrevious(int pos);
}
