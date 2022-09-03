package org.generation.nomina;

public class DeveloperFrontEnd extends supervisor{
	private int aniosExperiencia;
	private String framework;
	public DeveloperFrontEnd(String firstName, String lastName, int age, String RFC, double salary, String departamento,
			double bono, int aniosExperiencia, String framework) {
		super(firstName, lastName, age, RFC, salary, departamento, bono);
		this.aniosExperiencia = aniosExperiencia;
		this.framework = framework;
	}
	public int getaniosExperiencia () {
		return aniosExperiencia ;
	}
}
