//Escribir un programa que pida por teclado una hora en horas, minutos y segundos (datos enteros).
// Calcule cuántos segundos han pasado desde las 0:0:0 horas. Muestre por pantalla el resultado (dato entero)*/

#include <stdio.h>

int main(){

	int horas, minutos, segundos, totalsegundos;

	printf("Introdice la hora: ");
	scanf("%d",&horas);
	printf("Introdice los minutos: ");
	scanf("%d",&minutos);
	printf("Introdice los minutos: ");
	scanf("%d",&segundos);

	totalsegundos=horas*3600+minutos*60+segundos;


	printf( "Desde las 0:0:0 han pasado: %d segundos", totalsegundos );


	return 0;



}
