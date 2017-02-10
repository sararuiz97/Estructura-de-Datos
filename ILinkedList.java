

public interface ILinkedList<E>{
	public boolean isEmpty();
	public int size();
	public boolean contains(E data);
	public E get (int index);
	public int indexOf(E data);
	public void add(int index, E data);
	public E remove(int index);
	public String toString();
}