package org.generation.nomina; //Si dejamos el *, tendremos acceso a todos los elementos. En este caso, la unica clase que nos importa es la clase Employee


public class testemployee {

	public static void main(String[] args) {
		
		//Constructor definido por Felipe
		Employee Felipe = new Employee("Felipe", "Maqueda", 30, "MAGF920416XXX", 150.65);
		Employee Angel = new Employee ("Angel", "Martinez", 24, "XXXXXXXXXX", 1024.50);
		Employee Karlos = new Employee ("Karlos", "Torres", 3567.57);
		Employee prueba = new Employee (40);
		
		System.out.println(Felipe);
		System.out.println(Angel);
		System.out.println(Karlos);
		System.out.println();
		
		
		System.out.println("Salario de Felipe");
		//ponemos el nombre del objeto.nombre del metodo
		Felipe.calculateSalary(); //metodo que multiplica *21
		Felipe.calculateSalary(10); //metodo que pide los dias trabajados
;		Felipe.calculateSalary(10, 2); //metodo que calcula dias festivos y pide 2 parametros
		System.out.println();
		
		
		System.out.println("Salario de Angel");
		Angel.calculateSalary();
		Angel.calculateSalary(10); //metodo que pide los dias trabajados
		Angel.calculateSalary(10, 2); //metodo que calcula dias festivos y pide 2 parametros
		System.out.println();
		
		
		System.out.println("Salario de Karlos");
		Karlos.calculateSalary();
		Karlos.calculateSalary(10); //metodo que pide los dias trabajados
		Karlos.calculateSalary(10, 2); //metodo que calcula dias festivos y pide 2 parametros
		System.out.println();
		
		//instanciar de nuestro  empleado ()materializar
		Employee zabdiel = new Employee ("zabdiel", "dias", 23 , "zabdiel12345xxx",11150.65);
		
		//instancia para crear un supervisor (alonso)
		supervisor alonso = new supervisor ("alonso", "grajeda", 289 , "algr12345xxx",150000.32,"mentoria",500.00);
		
		System.out.println(zabdiel);
		System.out.println(alonso);
		
	}//main
}//testEmployee
