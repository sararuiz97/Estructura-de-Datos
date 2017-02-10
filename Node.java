public class Node<E>{
    private E data;
    private Node<E> next;

    public Node(E data, Node<E> n){
        this.next=n;
        this.data=data;
    }

    public Node(){
        this(null, null);
    }

    public Node(E data){
        this(data, null);
    }
    

    public E getData(){
        return this.data;
    }

    public Node<E> getNext(){
        return this.next;
    }

    public void setData(E d){
        this.data = d;
    }

    public void setNext(Node<E> n){
        this.next=n;
    }
}
