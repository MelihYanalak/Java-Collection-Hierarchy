//package hw8;

import java.util.Arrays;
/**
 * 
 * @author Ahmet Melih YANALAK
 *
 * @param <E> Integer or String
 */
public class HashSet<E> implements Set<E> {
	private E[] container;
	private Iterator<E> iter;	
	/**
	 * No parameter constructor
	 */
	public HashSet() {
		container = (E[]) new Object[0];
		iter = new Iterator<E>(container);
	}
	
	/**
	 * 
	 * @param input array to initiliaze collection
	 */
	public HashSet(E[] input) {
		container = (E[]) new Object[0];
		int i = 0;
		while(i < input.length) {
			add(input[i]);
			i++;
		}
		
		iter = new Iterator<E>(container);
	}
	/**
	 * getter method
	 * @return container of collection
	 */
	public E[] getContainer() {
		return container;
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
	@Override
	public void addAll(Collection<E> c) {
		c.iterator().begin();
		while(c.iterator().hasNext()) {
			add(c.iterator().get());
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
			add(c.iterator().get());
			c.iterator().next();
		}
		
	}
	
}
