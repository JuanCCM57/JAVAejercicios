
public class triangulo extends figura {

	int base;
	int altura;

	//metodo que viene de la figura@Overide
	public float area() {
		return this.base*this.altura/2;
	}//metodo
}//triangulo
/*
 *  Sobrecarga != Sobreescritura (overload/override)
 *  
 *  
 *  Sobrecarga de metodos: El mismo metodo con parametros distintos.
 * 	Sobreescritura de metodos: El mismo metodo, con cuerpos distintos.
 * 
 */
