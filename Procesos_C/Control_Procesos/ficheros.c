//ejemplo de uso para lectura y escritura en ficheros

#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>
#include <string.h>


int main(){

    char mensaje[] = "Hola";
    char buffer[10];
    int fd, bytesleidos;

    fd = open("fichero.txt",1);// 0 lectura, 1 escritura, 2 lectura escritura

    if(fd==-1){
      printf("Error al abrir el fichero");
      exit(-1);
    }
    printf("Comenzamos a escribir en el fichero \n");

    write(fd, mensaje, strlen(mensaje));

    close(fd);

    fd = open("fichero.txt",0);

    printf("Vamos a leer el fichero \n");

    bytesleidos = read(fd, buffer, 1);
    while(bytesleidos!=0){
      printf("%1c", buffer[0]);
      bytesleidos=read(fd, buffer, 1);
    }

    close(fd);



}
