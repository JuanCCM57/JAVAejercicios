public abstract class Doctor {

	//atributos
	String nombre;
	
	//metodo para atender a un paciente
	public abstract void atenderPaciente();
	
}//clase doctor


class cardiologo extends Doctor{

	@Override
	public void atenderPaciente() {
		System.out.println("el cardiologo nos coloca muchos cables en nuestro coranzoncito");
	}//metodo cardiologo
}
class pediatra extends Doctor{

	@Override
	public void atenderPaciente() {
		System.out.println("te regala una paleta");
	}//metodo pediatra
}



class Nutriologo extends Doctor{
	@Override
	public void atenderPaciente() {
		System.out.println("el nutriologo nos regaña por tomar coca-cola");
	}//metodo nutriologo
}

class textDoctores{
	public static void main(String args[]) {
		//no podemos instanciar objetos de la clase abstracta
		cardiologo juan = new cardiologo();
		juan.atenderPaciente();
		
		Nutriologo Mariana = new Nutriologo();
		Mariana.atenderPaciente();
		
		pediatra Felipe = new pediatra();
		Felipe.atenderPaciente();
		}//main
}//testdoctores