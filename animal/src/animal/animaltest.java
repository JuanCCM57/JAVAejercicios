package animal;

public class animaltest {
	public static void main(String args[]) {
		//no podemos instanciar objetos de la clase abstracta
		demoniodetasmania juan = new demoniodetasmania();
		juan.sonido();
		juan.desplazarse();
		
		cascabel julia = new cascabel();
		julia.sonido();
		julia.desplazarse();
		
		perro roberto = new perro();
		roberto.sonido();
		roberto.desplazarse();
		
		caballo aldo = new caballo();
		aldo.sonido();
		aldo.desplazarse();
		
		lobo daniela = new lobo();
		daniela.sonido();
		daniela.desplazarse();
		}//main
}