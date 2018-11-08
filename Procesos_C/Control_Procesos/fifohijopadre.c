#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

int main(){
	int fd[2];
	pid_t pid;
	char saludohijo[]="Holaaa";
	char buffer[80];


	pipe(fd);

	pid=fork();

	switch(pid){
		case -1: //error
			printf("no se ha podido crear el hijo\n");
			exit(-1);
		case 0:
      close (fd[0]);
      write (fd[1],saludohijo, strlen(saludohijo));
      printf("el hijo envia un mensaje al pipe...\n");


			break;
		default:
      wait(NULL); // espero al que termina mi hijo
      close (fd[1]);
      read (fd[0],buffer,sizeof(buffer));
      printf("el padre recibe un mensaje del pipe %s \n", buffer);

			break;
	}
}
