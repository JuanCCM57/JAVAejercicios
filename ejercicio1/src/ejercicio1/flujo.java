package ejercicio1;
import java.util.Scanner;
public class flujo {
	public static void main(String[] args) {
		//Var globales
	Scanner sc = new Scanner(System.in);
	System.out.println("ingrese su edad");
	//variables
	int edad = sc.nextInt();
	//logica si es un numero valido
//	Logica
		if(edad > 0) {
			// logica si es un numero valido
			if (edad >= 18) {
				System.out.println("Ahi viene el SAT. Pasa al afore.");
			} else if(edad < 18) {
				System.out.println("Chiquitin");
			}
		} else {
			// logica si no es valido
			System.out.println("Ingrese un numero valido");
		}
//		Misma verificacion, con else if
		
		if(edad <= 0) {
			System.out.println("Ingrese un numero valido");
		} else if (edad < 18) {
			System.out.println("Chiquitin");
		} else {
			System.out.println("Ahi viene el SAT. Pasa al afore.");
		}
		
//primavera
//verano
//jalowin
//navidad
		
// input = 1-4
// verificar a que estacion le pertenece ese numero
// output = la estacion del año
		//System.out.println("ingrese numero");

	    //int numero = sc.nextInt();
	    
	    //variables
	    int estacion = sc.nextInt();
	    switch(estacion) {
	    case 1:
	    	System.out.println("primavera");
	    	break;
	    case 2:
	    	System.out.println("verano");
	    	break;
	    case 3:
	    	System.out.println("jalowin");
	    	break;
	    case 4:
	    	System.out.println("navidad");
	    	break;
	    	default:
	    		System.out.println("su numero no es valido");
	    }
	    /* Ejercicio 01
		 * Calcular el descuento de usuario segun su nivel Fan club cinepolis
		 * 
		 * Variables: Nivel Fan, Descuento
		 * Niveles: 1 - 5%, 2 - 10%, 3 - 20%, 4 - 50%
		 * Output: "Usted es Super Fan de nivel $nivel y su descuento es de $descuento"
		 * 
		 */
System.out.println("Ingrese su nivel de Superfan:");
	    
int nivel = sc.nextInt();
switch(nivel) {
case 1:
	System.out.println("usted es superfan nivel" + nivel + "con descuento del 5%");
	break;
case 2:
	System.out.println("usted es superfan nivel" + nivel + "con descuento del 10%");
	break;
case 3:
	System.out.println("usted es superfan nivel" + nivel + "con descuento del 20%");
	break;
case 4:
	System.out.println("usted es superfan nivel" + nivel + "con descuento del 50%");
	break;
	default:
		System.out.println("No existe ese nivel");	
		sc.close();
}
/* Ejercicio 02
 * 
 * Calcular la mensualidad de el usuario segun su nivel y cupon de descuento
 * int cupon = 10;
 * Variables: Nivel, Mensualidad, Cupon
 * Niveles: Basico, Intermedio, Completo, Pro
 * Output: "Suscripcion $suscripcion de: $mensaulidad aplicando cupon de promocion"
 * 
 * Monto: Basico = $100, Intermedio = 120, Completo = 170, Pro = 250;
 * 
 * Mensualidad: monto - (monto * cupon);
 * resultado = monto - (monto * %);
 * 
 * 100 * .10 = 10% = 
 */
System.out.println("Ingrese su nivel de Mensualidad para obtener su descuento");
final double cupon = .10;
double mensualidad;
int nivelUsuario, monto;
nivelUsuario = sc.nextInt();

switch(nivelUsuario) {
    case 1:
        monto = 100;
        mensualidad = monto - (monto * cupon);
        System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + "aplicando cupon de promocion");
        break;
    case 2:
        monto = 120;
        mensualidad = monto - (monto * cupon);
        System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + "aplicando cupon de promocion");
        break;
    case 3:
        monto = 170;
        mensualidad = monto - (monto * cupon);
        System.out.println("Suscripcion " + nivelUsuario + "de: " + mensualidad + " " + " aplicando cupon de promocion");
        break;
    case 4:
        monto = 250;
        mensualidad = monto - (monto * cupon);
        System.out.println("Suscripcion " + nivelUsuario + " de: " + mensualidad + " " + " aplicando cupon de promocion");
        break;
        default:
            System.out.println("Ingresa un valor valido");
}

}
}