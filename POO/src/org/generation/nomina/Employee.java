package org.generation.nomina;

public class Employee {
	
	//1.- Propiedades
	public String firstName;
	public String lastName;
	public int age;
	public String RFC;
	public double salary;

	
	//2.- Constructor
	
/*En el constructor debemos tomar en cuenta lo siguiente:
 * 
 * 1. Debe coincidir con el nombre de nuestra clase
 * 2. Debe tener los parametros que declaramos anteriormente como parametros
 * 
 * 
*/
	
	//Constructor con todos los campos (constructor que contratamos por fuera)
	public Employee(String firstName, String lastName, int age, String RFC, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.RFC = RFC;
		this.salary = salary;
	}//constructor usando la opcion de "generate with fields"


	//Constructor usando Strings nombre y apellido
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//Constructor usando String para nombre e int para edad
	public Employee(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}
	
	//Constructor autogenerado con los datos que necesito
	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	

	public Employee(int age) {
	}
	
	
	//Metodos o funciones de nuestro sistema contable
	
	//Metodo para imprimir recibo de nomina (ustedes)
	
	
	
	




	//Metodo para calcular salario (Felipe)
	public void calculateSalary() {
		System.out.println("El salario por 21 dias es: " + this.salary *21);
	}//calculateSalary
	
	
	//Metodo para calcular salario (Felipe)
		public void calculateSalary(int days) {
			System.out.println("El salario por x dias trabajados es: " + this.salary *days);
		}//calculateSalary
	
	//Metodo para calcular salario con dias festivos
	public void calculateSalary(int days, int holidays) {
		holidays*=3;
		System.out.println(("El salario con dias festivos trabajados es: " + this.salary*holidays) +" " +
 (this.salary*days));
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", RFC=" + RFC
				+ ", salary=" + salary + "]";
	}

	
	//Estructura de un metodo o una funcion
	
	//modificador de acceso + tipo de retorno + Nombre + Parametros
	
	//Metodo toString para visualizar la informacion dentro de nuestro objeto y no solo el espacio de memoria o hashcode
	
	
	
	
	
	
	
	
	
	

	//3.Metodos (acciones a realizar)
	//Calcular salario por mes
	//Imprimir el recibo de nomina
	
	
	
	
	/*Sistema escolar
	 * 
	 * - Permitir crear alumnos (almacenar con minimo 3 datos)
	 * - Almacenar 5 calificaciones por alumno
	 * - Calcular el promedio de esas calificaciones
	 * - Calcular la materia con la calificacion mas alta y mas baja
	 * - Visualizar la informacion del alumno dos veces:
	 * 		1.- Solo el nombre y la calificacion final
	 * 		2.- Nombre y las calificaciones mayor y menor
	 * - Usar dos paquetes
	 */
	

	
	
	

}//class Employee


/*
 * 1.- Vamos a crear dos clases: Employee y TestEmployee
 * 2.- Clases y objetos
 * 		- Tipos de datos
 * 		- Clases Wrapper
 * 3.- Crear nuestro primer constructor
 * 4.- Crear metodos para calcular salario
 * 5.- Sobrecarga de metodos
 * 6.- Sobrecarga de constructores
 * 7.- Crear paquetes (org.generation.nomina)
 * 8.- Revisar errores
 * 
 */
