/*
public class variables {
*/	
	//public static void main(String[] args) {
		
		//Todo lo que necesitemos que se ejecuten, lo que ponemos en el main

		/*
		 * variables
		 */
		
		// Todo lo que necesitamos que se ejecute, lo ponemos dentro de main

        /* Tipos de datos
         * 
         * - Grupo de datos primitivos
         *     -byte: 1 byte -128 al 127
         *     -short: 2 bytes (-32768 al 32767)
         *     -int: 4 bytes (-2,147,483,648 al 2,147,483,647)

         *     -long: 8 bytes (-9,223,372,036,854,775,808 al 9,223,372,036,854,775,807)
 
         *     -float: 4 bytes, almacena numeros fraccionarios, 6 o 7 digitos decimales.
         *     -double: 8 bytes, almacena numeros fraccionarios, 15 digitos decimales.
         *     -boolean: 1 bit, almacena datos true o false
         *     -char: 2 bytes, almacena caracteras o letras en formato ASCII
         * 
         * - Grupo de datos no primitivos
         * 
         */
		/*
//numeros
		byte edadhumano =17;
		short edadTortuga = 150;
		int edadtierra=454300;
		long edaduniverso = 1111111112;
		float pi = 3.1416f;
	     double piGrande = 3.14159265359d;

	     boolean estudiamosJAVA = true;
	     boolean quieroHacerExamen = false;

	     char inicialNombre = 'L';

	     byte edad = 1;
	     char edad2 = '1';
	     */
/*Variables en Java
 * 
* Las variables son contenedeores que nos permiten almacenar valores de datos o informacion (vaso de agua, vaso de leche, vaso de refresco, etc.).
* 
* 
* - String: Almacena texto en forma de cadena, y se usan las comillas dobles
* - int: Almacena datos enteros
* - float: Almacena datos de tipo coma flotante
* - char : Almacena caracteres individuales como A, 1 y se usan las comillas simples.
* - booleanos: Almacenan valores con dos estados: true o false
*/
/*
	     String nombre = "martin";
	     int numerodomicilio = 9 ;
	     float estatura = 1.73f;
	     char grupo = 'B';
	     boolean descancito = false;
	     float areatriangulo = 50.0f;
	     
	     //declaracion vs inicializacion 
	     String declaracion; //Me declaracion a mi crush
	     declaracion = "si"; //iniciamos la relacion
	     final int anios ; //usamos final para volver a nuestra variable una constante
	     anios = 70;
	     
	     //println imprime con saltos de linea
	     //print imprime todo de corrido
	     
	     System.out.println("hola mundo");
	     System.out.println("nos vamos a descansito?");
	     System.out.println(anios);
	     System.out.println((5+60));
	     //declarar multiples variables
	     int x = 50;
	     int y = 15;
	     int z = 25;
	     
	     int a=24, b=55, c=50;
	     
	     System.out.println("informacion"+a+""+b+""+c);
	     
	     int h,i,j;
	     h=i=j=50;
	*/     
/*
* Conversion de tipos de datos en JAVA (casting o casteo)
* 
* Es cuando se asigna un valor de un tipo de datos primitivo a otro
* 
* 
* - Ampliacion: de un tipo pequenio a un tipo mas grande
* 
* byte>short>char>int>long>float>double
* 
* - Reduccion (Narrowing): de un tipo mas grande a un tipo mas pequenio
* double>float>long>int>char>short>byte
* 
* 
* 
* 
*/
	/*
	     int pesitos = 60;

	        double pesosConCentavos = pesitos;
	        double usdCents = 35.89d;

	        System.out.println(pesitos + " tipo entero");
	        System.out.println(pesosConCentavos + " tipo decimal");

	        System.out.println(pesitos + usdCents + " funciona pero es mala practica");
	        System.out.println(pesosConCentavos + usdCents + " buena práctica");

	        // Cuando reducimos un valor, es importante agregar (tipoDato) y la variable a castear.
	        double peso = 98.6d;
	        int pesoInt = (int) peso; // redondea hacia abajo

	        System.out.println(peso);
	        System.out.println(pesoInt);
*/
	        /*Operadores en JAVA
	         * 
	         * operadores aritmeticos (+, -, *, /, %, ++, --)
	         * operadores de asignacion (=, +=, -=)
	         * operadores de comparacion (==, !=, >, <, >=, <=)
	         * operadores logicos (&&, ||, !)
	         * operadores bit a bit
	         * 
	         */
//operadores aritmeticos
	      //Operadores aritmeticos
	        /*
			System.out.println("Operadores aritmeticos");
		    numero1++;
		    numero2--;
			int suma = numero1 + numero2;
			int resta = numero2 - numero1;
			int multiplicacion = numero1 * numero2;
			double division = numero1 / numero2;
			float modulo = numero1 % numero2;
			numero1++;
			numero2--;
			
			
			System.out.println(suma);
			System.out.println(resta);
			System.out.println(multiplicacion);
			System.out.println(division);
			System.out.println(modulo);
			System.out.println(numero1);
			System.out.println(numero2);
			//Operadores de asignacion (=)
			System.out.println("Operadores de asignacion");
			int dinero = 4; //asigno valor a int dinero
			dinero += 3; //dinero = dinero + 3
			dinero = dinero + 3; //valor esperado 10
			dinero -= 5;// dinero = dinero - 5
			dinero *= 8;
			dinero /= 4;
			dinero %= 3;//
			//Operadores bit a bit
			dinero &= 5; //
			dinero |=5;
			dinero >>= 3;
			System.out.println("El valor de la variable dinero es: " + dinero);
*/
//Ejemplo con reasignacion usando ++
	        /*
		int ahorro = 10;
		int domingo = ++ahorro; //11
		//ahorro = ahorro + 1
		System.out.println("Mi primer ahorro es: " + ahorro);
		
		//Ejemplo usando operador suma (+)
		int ahorro2 = 10;
		int domingo2 = 1 + ahorro2; //		
		
		System.out.println("Mi segundo ahorro es: "+ ahorro2);
		*/
//operadores de comparacion
/*
 *en JS, usamos un operador llamado "estrictamente igual (===).
 *Este nos permitia evaluar el tipo de dato y el valor, los cuales deben coincidir 
 */
	/*
		int numero3 = 5;
		int numero4 = 6;
		
		boolean igual = numero3 == numero4; //false
		boolean noIgual = numero3 != numero4; //true
		boolean mayorQue = numero3 > numero4; //false
		boolean menorQue = numero3 < numero4; //true
		boolean mayorIgualQue = numero3 >= numero4; //false
		boolean menorIgualQue = numero3 <= numero4; //true


		System.out.println(igual);
		System.out.println(noIgual);
		System.out.println(mayorQue);
		System.out.println(menorQue);
		System.out.println(mayorIgualQue);
		System.out.println(menorIgualQue);
		*/
		/*
		//Ejemplo con reasignacion usando ++
				int ahorro = 10;
				int domingo = ++ahorro; //11
				//ahorro = ahorro + 1
				System.out.println("Mi primer ahorro es: " + ahorro);
				
				//Ejemplo usando operador suma (+)
				int ahorro2 = 10;
				int domingo2 = 1 + ahorro2; //		
				
				System.out.println("Mi segundo ahorro es: "+ ahorro2);
		

	//}//main
}
	*/