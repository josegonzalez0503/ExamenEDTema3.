import java.util.Scanner;

/**
*<p>Programa suma, para calcular la suma de dos valores introducidos por teclado</p>
*@version v1.0
*@author Miquel
*@see <p>Para mas informacion ver <a href="https://www.google.com/?hl=ca">Google</a></p>
*/

public class FuncionSuma {

	/**
	*@param Primer sumando de la operacion suma
	*/	
	/**
	
	
	
	
	private static int primerSumando;
	
	/**
	*@param Segundo sumando de la operacion suma
	*@return Devuelve el resultado de sumar los dos sumandos	
*/
		

	private static int segundoSumando; 
	
	/**
	*@param args Funcion principal del rprograma
	*Funcion principal del programa	
	*/
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		

	/**
	*Variable para guardar el primer sumando
	*/	
		primerSumando = in.nextInt();
		in.nextLine();

		

		System.out.println("Introduce el segundo sumando:");

	/**
	*Variable para guardar el segundo sumando
	*/
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " + suma(primerSumando, segundoSumando));
		
		in.close();

	}
	
	/**
	*@param Funcion que realiza la suma de los dos operandos
	*/	
	private static int suma (int sumando1, int sumando2) {
		return sumando1+sumando2;
	}

}
