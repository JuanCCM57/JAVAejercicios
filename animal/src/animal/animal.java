package animal;

public abstract class animal {
	String nombre;
	String colores;
	
public abstract void sonido();
public abstract void desplazarse();	
}

class demoniodetasmania extends animal{

	@Override
	public void sonido() {
		System.out.println("heeeeeeee");
	}

	@Override
	public void desplazarse() {
		System.out.println("correee");
		
	}
	
}

class cascabel extends animal{

	@Override
	public void sonido() {
		System.out.println("suena cascabel xd");
	}

	@Override
	public void desplazarse() {
		System.out.println("Se desliza");
		
	}
	
}

class perro extends animal{

	@Override
	public void sonido() {
		System.out.println("wooff");
	}

	@Override
	public void desplazarse() {
		System.out.println("corre");
		
	}
	
}

class caballo extends animal{

	@Override
	public void sonido() {
		System.out.println("relincho");
	}

	@Override
	public void desplazarse() {
		System.out.println("trotar");
		
	}
	
}

class lobo extends animal{

	@Override
	public void sonido() {
		System.out.println("aulla");
	}

	@Override
	public void desplazarse() {
		System.out.println("corre");
		
	}
	
}

