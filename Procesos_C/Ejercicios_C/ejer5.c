//Escribir un programa que pida por teclado un número (dato entero) del 1 al 10.
//Muestre por pantalla su equivalente en letras (dato cadena).
//Nota: si el número introducido es menor que 1 ó mayor que 10,
//se mostrará el mensaje: "ERROR: El número debe ser >= 1 y <= 10.". Ejemplo: Entrada 1, Salida “uno”.

#include <stdio.h>

int main(){

	int numero;

	printf("Introdice un numero del 1 al 10: ");
	scanf("%d",&numero);

  if(numero>0&&numero<10){
    switch ( numero )
       {
           case  1 : printf( "\n   uno" );
                break;
           case  2 : printf( "\n   dos" );
                break;
           case  3 : printf( "\n   tres" );
                break;
           case  4 : printf( "\n   cuatro" );
                break;
          case  5 : printf( "\n   cinco" );
                break;
          case  6 : printf( "\n   seis" );
                break;
          case  7 : printf( "\n   siete" );
                break;
          case  8 : printf( "\n   ocho" );
                break;
          case  9 : printf( "\n   nueve" );
                break;
          case  10 : printf( "\n   diez" );
                break;
              }
  }else{
    printf("ERROR: El número debe ser >= 1 y <= 10.");
  }

	return 0;

}
