//Escribir un programa que muestre por pantalla todos los números múltiplos de 4 que hay entre el 64 y el 44, ambos inclusive.

#include <stdio.h>

int main(){

    int numero;

    for( numero=44; numero<=64; numero=numero+4){
      printf( "Numero: %d \r\n", numero );
    }


	return 0;

}
