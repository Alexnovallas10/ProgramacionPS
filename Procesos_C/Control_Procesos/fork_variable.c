

#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

int main(){

	pid_t pid, hijo_pid;
  int v = 0;

	//fork devuelve -1 si se produce algun error en la ejecucion
	//devuelve 0 se no se produce ningun error y nos encontramos en el proceso hijo
	//devuelve el pid asignado al proceso hijo si no se produce ningun error y nos encontramos en el proceso padre
	pid = fork();


	if(pid == -1){ // error
		printf("No se ha podido crear el proceso hijo....\n");
	}
	else if( pid == 0 ){ // hijo
		printf("Soy el proceso hijo... \n\t");
      v-=5;
      printf("variable: %d \n", v);
	}else{ // padre
		hijo_pid = wait(NULL); // Espera a la finalización del proceso hijo, el padre se bloquea
		printf("Soy el proceso padre... \n\t");
      v+=5;
		printf("variable: %d \n", v);
	}

	exit(0);
}
