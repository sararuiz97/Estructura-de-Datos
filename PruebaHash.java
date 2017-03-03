import java.util.Scanner;

public class PruebaHash{

	public static void main(String[] args){
		PruebaHash ph=new PruebaHash();
		Scanner x = new Scanner(System.in);
		HashTable ht = new HashTable();

		do{
			System.out.println("Digite el numero de la operacion que desee realizar");
			System.out.println("1) Introducir un elemento");
			System.out.println("2) Sacar un elemento");
			System.out.println("3) Devuelve el tamaño");
			System.out.println("4) Verificar si el hash esta vacio");
			System.out.println("5) Multiplicar elementos");

			int numero=x.nextInt();
			switch(numero){
				case 1:
					int llave;
					int valor = 0;
					System.out.println("Llave: ");
					llave = x.nextInt();
					System.out.println("Valor: ");
					ht.put(llave, valor);
					valor = x.nextInt();
					break;
				case 2:
					int llave1;
					System.out.println("Llave: ");
					llave1 = x.nextInt();
					ht.get(llave1);
					break;
				case 3:
					System.out.println(ht.size());
					break;
				case 4: 
					System.out.println(ht.isEmpty());
				case 5:
					int llave2;
					System.out.println("Llave: ");
					llave2 = x.nextInt();
					ht.multMethod(llave2);
					break;
	
			}

		}

		while(true);
	}
}
