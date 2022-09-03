package org.generation.nomina;

public class supervisor extends Employee {

/*
 * 1.Atributos
 * 2.Construccion
 * 3.Metodos
 * 4.toString
 * 5.Getters y Setters	
 */
	//Atributos
	protected String departamento;
	protected double bono;
	//constructor
	public supervisor(String firstName, String lastName, int age, String RFC, double salary, String departamento,
			double bono) {
		super(firstName, lastName, age, RFC, salary);
		this.departamento = departamento;
		this.bono = bono;
	//constructor
		// Metodos
		//getters y setters
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getBono() {
		return bono;
	}
	public void setBono(double bono) {
		this.bono = bono;
	}//set bono
	
	@Override
	public String toString() {
		return "supervisor [departamento=" + departamento + ", bono=" + bono + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", age=" + age + ", RFC=" + RFC + ", salary=" + salary + "]";
	}	//toString
		
	
}