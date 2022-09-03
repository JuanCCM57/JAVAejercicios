package vueltasyvueltas;

import java.util.Scanner;

public class Bluclecitos {
public static void main(String [] args) {
	// WHILE	
//	bucle infinito de while
	/*
	while(true) {
		System.out.println("Hoy no fío, mañana si.");
	}
	*/
/*int suma = 0;
while (suma<=10) {
	System.out.println(suma++);
	
}
*/
	//DO while
	/*int suma = 0;
	boolean disparador = true;
	do {
		System.out.println(++suma);
		disparador = true;
	}while(disparador == true);
	*/
//	Algoritmo de un do while para hacer la suma de los primeros 10 numeros naturales
//	Sumar 1 + 1 = 2, 2 + 2 = 4, 4 + 3 = 7, 7 + 4 = 11 ... n + 10;
	/*
int numero = 0;
int suma = 0;
do {
	suma = suma + numero;
	numero++;
	System.out.println(suma);
}while(numero <= 10);
*/
	
//bucle for
// for infinito
	/*
for (int i = 1; i >=1; i++) {
	System.out.println("hoy no fio mañana si");
}
*/
/*	
for (int i = 0; i <= 100; i++) {
	System.out.println(i);
}
*/
	/*
int suma = 0;
for (int i = 0; i < 10; i++) {
	System.out.println(suma += i);
}
*/
//Ejercicio 01 	
//Escribir un programa que regrese el valor del factorial de un numero;
//Factorial es: (n * n-1* n-2 * n-3) ... n >= 0;
/*
	Scanner factorial = new Scanner (System.in);
System.out.println("ingrese el numero");
int numero = factorial.nextInt();
int res=1;

for (int i = numero; i>0; i--) {
	res *=i;
}
System.out.println(res);
for(int i = 1; i <=50; i++) {
	if(i % 15 == 0) {
		System.out.println("Fizz Buzz " + i);
	}
	if(i % 3 == 0) {
		System.out.println("Fizz " + i);
	}
	if(i % 2 == 0) {
		System.out.println("Buzz " + i);
	}
}
*/
//Variables globales
int cont = 1;
int a = 0;
int c = 0;
int b = 1;

while(cont <= 50) {
	a = b;
	b = c;
	c = a + b;
	cont++;
	System.out.println(c);
}

}
}