public class EjemploLinkedList{

	public static void main(String[] args){
		SLinkedList<Integer> ll = new SLinkedList<Integer>();
		ll.add(0, 12);
		ll.add(1, 5);
		ll.add(2, 2);
		ll.add(0, 9);
		//ll.remove(1);

		System.out.println("Lista: " +ll);
	}
}