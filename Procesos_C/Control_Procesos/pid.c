//ejemplo e uso de las funciones para obtener el PID de los procesos

#include <stdlib.h>
#include <unistd.h>
#include <stdio.h>

int main(){

    pid_t pid_actual;
    pid_t pid_padre;

    //se obtiene el pid catual
    pid_actual=getpid();
    //se obtiene el pid del proceso padre
    pid_padre=getppid();


    printf("PID de este proceso: %d \n", pid_actual);
    printf("PID del proceso padre: %d", pid_padre);










}
