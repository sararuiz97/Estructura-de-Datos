import java.util.EmptyStackException;

public class StackG<E> implements IStack<E>{
	private Node<E> last;
	private int size;

	public StackG(){
		last=null;
		size=0;
	}

	public boolean isEmpty(){
		return last == null;
	}

	public void push(E data){ //introduce un elemento
		this.last=new Node<E>(data, this.last);
		this.size++;
	}

	public E pop(){ //saca un elemento
		if(isEmpty()){
			throw new EmptyStackException();
		}
		Node<E> lastElement=this.last;
		this.last=lastElement.getNext();
		this.size--;
		return lastElement.getData();
	}

	public E top(){ //consulta el primer elemento del stack
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return this.last.getData();
	}

	public String toString(){
		if(this.size==0){
			return "";
		}else{
			StringBuilder sb=new StringBuilder();
			while(!isEmpty()){
				sb.append("[" + pop() + "]");
				
			}
			return sb.toString();
		}
	}

}