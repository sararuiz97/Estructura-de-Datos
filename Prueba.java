import java.util.Scanner;

public class Prueba{

	public void invierteStack(StackG<Integer> s){
		Queue<Integer> q = new Queue<Integer>();
		while(!s.isEmpty()){
			q.enqueue(s.pop());
		}

		while(!q.isEmpty()){
			s.push(q.dequeue());
		}
	}

	public static void main(String[] args){
		Prueba p=new Prueba();
		Scanner x = new Scanner(System.in);
		StackG<Integer> sg = new StackG<Integer>();

		do{
			System.out.println("Digite el numero de la operacion que desee realizar");
			System.out.println("1) Introducir un elemento");
			System.out.println("2) Sacar un elemento");
			System.out.println("3) Consultar el primer elemento");
			System.out.println("4) Imprimir stack");

			int numero=x.nextInt();
			switch(numero){
				case 1:
					int elemento;
					System.out.println("Elemento: ");
					elemento = x.nextInt();
					sg.push(elemento);
					break;
				case 2:
					sg.pop();
					break;
				case 3:
					sg.top();
					break;
				case 4:
					System.out.println(sg.toString());
					break;
			}

		}
		while(true);
	
	}

}