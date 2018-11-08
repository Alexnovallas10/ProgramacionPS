//Escribir un programa que pida por teclado tres números (datos enteros). Muestre el mayor de los tres números introducidos.

#include <stdio.h>

int main(){

	int n1, n2, n3;

	printf("Introdice el primer numero: ");
	scanf("%d",&n1);
  printf("Introdice el segundo numero: ");
	scanf("%d",&n2);
  printf("Introdice el tercer numero: ");
	scanf("%d",&n3);

  if(n1>n2&&n1>n3){
    printf( "El numero %d es el mayor de los 3.", n1);
    }else{
    if(n2>n3){
      printf( "El numero %d es el mayor de los 3.", n2);
    }else{
      printf( "El numero %d es el mayor de los 3.", n3);
    }
  }

	return 0;

}
