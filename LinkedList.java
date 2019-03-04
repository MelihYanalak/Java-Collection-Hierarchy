//package hw8;

import java.util.Arrays;
/**
 * 
 * @author Ahmet Melih YANALAK
 *
 * @param <E> Integer or String
 */
public class LinkedList<E> implements List<E>, Queue<E>{
	/**
	 * container to keep data
	 */
	private E[] container;
	/**
	 * iterator to use container
	 */
	private Iterator<E> iter;
	/**
	 * No parameter constructor
	 */
	public LinkedList() {
		container = (E[]) new Object[0];
		iter = new Iterator<E>(container);
	}
	/**
	 * 
	 * @param input initiliaze with input elements
	 */
	public LinkedList(E[] input) {
		container = input;
		iter = new Iterator<E>(container);
	}
	/**
	 * retrieves first element of collection
	 */
	public E element() {
		//THROW HERE
		return (get(0));
	}
	@Override
	public void offer(E e) {
		add(e);
	}
	@Override
	public E poll()throws Exception {
		if(isEmpty()){
			throw new Exception();
		}
		E temp = get(0);
		remove(temp);
		return temp;
		
	}
	/**
	 * 
	 * @return container
	 */
	public E[] getContainer() {
		return container;
	}
	/**
	 * 
	 * @param index index to reach
	 * @return data of container in specified index
	 */
	public E get(int index) {
		return container[index];
	}
	/**
	 * 
	 * @param index index to set
	 * @param element element to put
	 */
	public void set(int index,E element) {
		container[index] = element;
	}
	@Override
	public Iterator<E> iterator(){
		return iter;
	}
	@Override
	public boolean contains(E e) {
		if(container.length == 0) {
			return false;
		}
		iter.begin();
		while(iter.hasNext()) {
			if(e == iter.get()) {
				return true;
			}
			iter.next();
		}
		return false;
	}
	@Override
	public void add(E e) {
		if(contains(e) == false) {
			final int N = container.length;
			container = Arrays.copyOf(container, N + 1);
		    container[N] = e;
		    iter = new Iterator<E>(container);
		}
		else return;
	}
	/**
	 *  Inserts without checking if the element exists(Helper in addAll)
	 * @param e element to insert
	 */
	public void otherAdd(E e) {
		final int N = container.length;
		container = Arrays.copyOf(container, N + 1);
	    container[N] = e;
	    iter = new Iterator<E>(container);
		
	}
	@Override
	public void addAll(Collection<E> c) {
		c.iterator().begin();
		while(c.iterator().hasNext()) {
			otherAdd(c.iterator().get());
			c.iterator().next();
		}
		
	}
	@Override
	public boolean isEmpty() {
		if(container.length == 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public int size() {
		return container.length;
	}
	@Override
	public boolean containsAll(Collection<E> c) {
		c.iterator().begin();
		while(c.iterator().hasNext()) {
			if(contains(c.iterator().get()) == false) {
				return false;
			}
			c.iterator().next();
		}
		return true;
	}
	@Override
	public void clear() {
		E[] temp = (E[]) new Object[0];
		container = temp;
		iter = new Iterator<E>(container);
	}
	@Override
	public void remove(E e) {
		if(contains(e)) {
			E[] temp = (E[])new Object[size()-1];
			int i = 0;
			int j = 0;
			while(i < size()) {
				if(container[i] == e) {
					i++;
				}
				else {
					temp[j] = container[i];
					j++;
					i++;
				}
			}
			container = temp;
			iter = new Iterator<E>(container);
			
		}
	}
	@Override
	public void removeAll(Collection<E> c) {
		c.iterator().begin();
		while(c.iterator().hasNext()) {
			remove(c.iterator().get());
			c.iterator().next();
		}
	}
	@Override
	public void retainAll(Collection<E> c) {
		clear();
		c.iterator().begin();
		while(c.iterator().hasNext()) {
			otherAdd(c.iterator().get());
			c.iterator().next();
		}
		
	}
}
