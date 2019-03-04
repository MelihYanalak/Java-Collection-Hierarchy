//package hw8;
/**
 * 
 * @author Ahmet Melih YANALAK
 *
 * @param <E> can be String or Integer
 */
public interface Collection<E> {
	/**
	 * Inserts if collection does not include parameter
	 * @param e parameter to insert
	 */
	public void add(E e);
	/**
	 *  Inserts all elements in input collection into this collection
	 * @param c input collection
	 */
	public void addAll(Collection<E> c);
	/**
	 * Clears this collection
	 */
	public void clear();
	/**
	 * 
	 * @param e input value to control
	 * @return true if e exists in this collection
	 */
	public boolean contains(E e);
	/**
	 * 
	 * @param c collection input to control
	 * @return true if this collection includes all elements of collection c
	 */
	public boolean containsAll(Collection<E> c);
	/**
	 * 
	 * @return true if collection is empty
	 */
	public boolean isEmpty();
	/**
	 *  removes element if it exists
	 * @param e element to remove
	 */
	public void remove(E e);
	/**
	 *  removes elements of collection c if it exists
	 * @param c collection to remove its elements
	 */
	public void removeAll(Collection<E> c);
	/**
	 * Clears collection and create new with elements of collection c
	 * @param c collection to keep its values
	 */
	public void retainAll(Collection<E> c);
	/**
	 * 
	 * @return size
	 */
	public int size();
	/**
	 * 
	 * @return iterator over this collection
	 */
	public Iterator<E> iterator();
}
