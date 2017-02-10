import java.util.NoSuchElementException;
import java.lang.*;

public class SLinkedList<E> implements ILinkedList<E>{
	private Node<E> firstNode;
	private int size;

	public SLinkedList(){
		this.firstNode = null;
		this.size = 0;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public int size(){
		return this.size;
	}

	public E getFirst(){ //Devuelve el elemento que se encuentra en la primera posición de la lista, en caso de lista vacía, lanzar la excepción NoSuchElementException.
		if(this.firstNode != null){
			return firstNode.getData();
		}
		else{       
			throw new NoSuchElementException ("Empty List!!!");
		}
	}

	public E getLast(){
		return null;
	}//Devuelve el elemento que se encuentra en la última posición de la lista, en caso de lista vacía, lanzar la excepción NoSuchElementException.



	public void add(int index, E data){
		if(index<0||index>this.size){
			throw new IndexOutOfBoundsException("Index out of bounds");
		}
		if(index==0){
			addFirst(data);
		}else{
			Node<E> ant;
			int aux=0;
			ant=this.firstNode;
			while(aux<index-1){
				ant=ant.getNext();
				aux++;
			}
			Node<E> nuevo=new Node<E>(data, ant.getNext());
			ant.setNext(nuevo);
			size++;
		}
	}

	public boolean contains(E data){
			int a=this.indexOf(data);
			return a != -1;
	}

	public int indexOf(E item){
		int aux=-1;
		if(size>0){
			Node<E> ant;
			ant=this.firstNode;
			aux++;
			while(aux<=size){
				if(item.equals(ant.getData())){
					return aux;
				}
				ant=ant.getNext();
				aux++;
			}
		}
		return -1;		
	}

	public E get(int index){
		if(index<0||index>=this.size){
			throw new IndexOutOfBoundsException("Indice out of bounds");
		}
		Node<E> ant;
		int aux=0;
		ant=this.firstNode;
		while(aux<index){
			ant=ant.getNext();
			aux++;
		}
		return ant.getData();
	}

	public String toString(){
		if(this.size==0){
			return "";
		}else{
			StringBuilder sb=new StringBuilder();
			Node<E> actual=this.firstNode;
			for(int i=0;i<this.size;i++){
				sb.append("[" + actual.getData() + "]");
				actual=actual.getNext();
			}
			return sb.toString();
		}
	}

	public E remove(int index) throws NullPointerException{
		Node<E> ant = new Node<E>();
		Node <E> eliminar = new Node<E>();
		int i = 0;
		try{
			if(index == 0){
				this.firstNode = this.firstNode.getNext();
				this.size--;
			}
			else{
				ant = this.firstNode;
				while(i < index&&index <= this.size){
					if(i == index-1){
						eliminar = ant.getNext();
						ant.setNext(eliminar.getNext());
						eliminar.setData(null);
						eliminar.setNext(null);
						this.size--;
					}
					ant = ant.getNext();
					i++;
				}
			}
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		return null;
	}
	public E removeFirst(){
		return null;
	} //Remueve el primer elemento de la lista, debes verificar que la lista no esté vacía, en caso de estarlo se lanza la excepción NoSuchElementException, regresa el elemento que se eliminó.

	public E removeLast(){
		return null;
	} //Remueve el último elemento de la lista, debes verificar que la lista no esté vacía, en caso de estarlo se lanza la excepción NoSuchElementException, regresa el elemento que se eliminó.

	public void addFirst(E data){
		this.firstNode=new Node<E>(data, this.firstNode);
		this.size++;
	}

	public void addLast(E ítem){
	} //Agrega el ítem como último elemento de la lista.

	
}