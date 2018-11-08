//Escribir un programa que pida por teclado dos números (datos enteros).
///Calcule la suma y multiplicación de los dos números introducidos.

#include <stdio.h>

int main(){

	int a, b, suma, multi;

	printf("Introdice el primer numero: ");
	scanf("%d",&a);
	printf("Introdice el segundo numero: ");
	scanf("%d",&b);

	suma=a+b;
	multi=a*b;

	printf( "La suma es: %d", suma );
	printf( " La multiplicacion es: %d", multi);

	return 0;



}
