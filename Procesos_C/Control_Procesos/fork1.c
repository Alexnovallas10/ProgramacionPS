#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

int main(){

	pid_t pid, hijo_pid, pid2, pid_hijo2;

	//fork devuelve -1 si se produce algun error en la ejecucion
	//devuelve 0 se no se produce ningun error y nos encontramos en el proceso hijo
	//devuelve el pid asignado al proceso hijo si no se produce ningun error y nos encontramos en el proceso padre
	pid = fork();

	if(pid == -1){ // error
		printf("No se ha podido crear el proceso hijo....\n");
	}
	else if( pid == 0 ){ // hijo
    pid2 = fork();
		printf("Soy el proceso hijo... \n");
		printf("Mi PID es: %d, y mi proceso padre es: %d\n\n", getpid(), getppid());
  }else

  if(pid2 == -1){ // error
    printf("No se ha podido crear el proceso hijo....\n");
  }
  else if( pid2 == 0 ){ // padre
    pid3 = fork();
    printf("Soy el proceso hijo... \n");
    printf("Mi PID es: %d, y mi proceso padre es: %d\n\n", getpid(), getppid());
	}else{ // padre
		pid_hijo2 = wait(NULL); // Espera a la finalización del proceso hijo, el padre se bloquea
		printf("Soy el proceso padre... \n\t"
            "Mi PID es %d, el PID de mi abuelo es: %d. \n\t"
            "Mi hijo: %d termino.\n",
            getpid(), getppid(), pid2);
		printf("El id del padre es: %d\n", getpid());
	}


	exit(0);
}
