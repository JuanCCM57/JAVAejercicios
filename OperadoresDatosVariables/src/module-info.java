public class OperadoresDatosVariables {
	public static void main(String[] args) {
	
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
//numeros
		byte edadhumano =17;
		short edadTortuga = 150;
		int edadtierra=454300;
		long edaduniverso = 4567780204861;
		float pi = 3.1416f;
	     double piGrande = 3.14159265359d;

	     boolean estudiamosJAVA = true;
	     boolean quieroHacerExamen = false;

	     char inicialNombre = 'L';

	     byte edad = 1;
	     char edad2 = '1';
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

	     String nombre = "martin";
	     int numerodomicilio = 9 ;
	     float estatura = 1.73f;
	     char grupo = "b";
	     boolean descancito = false;
	     float areatriangulo = 50.0f;
	     
	     //declaracion vs inicializacion 
	     String declaracion; //Me declaracion a mi crush
	     declaracion = "si"; //iniciamos la relacion
	     final int anios ; //usamos final para volver a nuestra variable una constante
	     anios = 70;
	     
	     //println imprime con saltos de linea
	     //print imprime todo de corrido
	     
	     system.out.println("hola mundo");
	     system.out.println("nos vamos a descansito?");
	     system.out.println(anios);
	     system.out.println((5+60));
	     
	}//main
}//class