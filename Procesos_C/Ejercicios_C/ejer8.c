//Escribir un programa que muestre por pantalla todos los números pares que hay entre el 1 y el 30, ambos inclusive.


#include <stdio.h>

int main(){

    int numero;

    for( numero=2; numero<=30; numero=numero+2){
      printf( "Numero: %d \r\n", numero );
    }


	return 0;

}
