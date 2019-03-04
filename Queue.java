//package hw8;
/**
 * 
 * @author Ahmet Melih YANALAK
 *
 * @param <E> Integer or String
 */
public interface Queue<E> extends Collection<E>{
	public void add(E e);
	public E element();
	public void offer(E e);
	public E poll()throws Exception;
}
