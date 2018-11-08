//Escribir un programa que pida por teclado una cantidad (dato entero) en pesetas.
//Calcule su equivalente en euros. Muestre por pantalla el resultado (dato real).

#include <stdio.h>

int main(){

	int pesetas;
	float euros;

	printf("Introdice la cantidad de pesetas: ");
	scanf("%d",&pesetas);


	euros=pesetas/166.386;


	printf( "%d pesetas son %.2f euros", pesetas, euros);


	return 0;



}
