//Escribir un programa que muestre por pantalla la tabla de multiplicar de un número entero introducido por el usuario.
//El proceso debe repetirse mientras que el usuario lo desee.

#include <stdio.h>

int main(){

    int i, numero;

    printf( "Introduce un numero: " );
    scanf( "%d", &numero );

    for( i=0; i<=10; i++){
      printf( "%d * %d = %d  \r\n",numero, i, i*numero );
    }


	return 0;

}
