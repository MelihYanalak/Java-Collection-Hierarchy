//package hw8;
/**
 * 
 * @author Ahmet Melih YANALAK
 *
 * @param <E> Integer or String
 */
public class Iterator<E> {
	private E[] data;
	private int index;
	/**
	 * Constructor with input array parameter
	 * @param input array to initialize
	 */
	public Iterator(E[] input) {
		data = input;
		index = 0;
	}
	/**
	 * 
	 * @param input array to set data
	 */
	public void setData(E[] input) {
		data = input;
	}
	/**
	 * 
	 * @return returns beginning of the data
	 */
	public E begin() {
		index = 0;
		if(data.length != 0) {
			return null;
		}
		return (data[0]);
	}
	/**
	 * Controls if iterator has next value
	 * @return true if it has next value
	 */
	public boolean hasNext() {
		return (index < (data.length));
	}
	/**
	 * get function (like dereference in pointer)
	 * @return data in specified index
	 */
	public E get() {
		return (data[index]);
	}
	/**
	 * Next method to move to the end
	 * @return returns next element in data
	 */
	public E next() {
		return data[index++];
	}
	/**
	 * I don't have time for this :(
	 */
	public void remove() {
		
	}
}
