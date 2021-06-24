/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionpw;

import java.util.Scanner;

/**
 *
 * @author RT
 */
public class EvaluacionPW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*1.(valor 1.0) En una finca entre gallinas y conejos, se cuentan
    50 cabezas y 140 patas ¿Cuántas gallinas y conejos hay en la
    granja?, recuerde
    x=(CE-BF)/(AE-BD)
    Y=(AF-CD)/(AE-BD)*/
        
        /* double x, y;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite el coeficiente A: ");
        final int A=input.nextInt();
        
        System.out.print("Digite el coeficiente B: ");
        final int B=input.nextInt();
        
        System.out.print("Digite el coeficiente C: ");
        final int C=input.nextInt();
        
        System.out.print("Digite el coeficiente D: ");
        final int D=input.nextInt();
        
        System.out.print("Digite el coeficiente E: ");
        final int E=input.nextInt();
        
        System.out.print("Digite el coeficiente F: ");
        final int F=input.nextInt();
        
        //proceso
        x=(C*E-B*F)/(A*E-B*D);
        y=(A*F-C*D)/(A*E-B*D);
        
        //salida
        System.out.println("El numero de Conejos es: "+x);
        System.out.println("El numero de Gallinas es: "+y);*/
        
        
       /* 2.(valor 1.0) Pedir 20 números y contar cuantos de los
        ingresados fueron negativos*/
      
      /* Scanner input = new Scanner(System.in);
       int numero, contador=0, numerosAContar;
      
        System.out.print("Ingrese la cantidad de numeros a contar: ");
        numerosAContar=input.nextInt();
        for (int i=1; i<=numerosAContar;i++){
            System.out.print("Ingrese el "+(i)+" numero: ");
            numero=input.nextInt();
            if(numero<0)
                contador+=1;  
        }
        System.out.println("La cantidad de numeros negativos ingresados es: "+contador);*/
      
      /*3.(valor 1.0) Crear una matriz de enteros (tamaño a elección
      del usuario) y obtener en un nuevo arreglo unidimensional la
      suma de cada columna*/
       
      /*  Scanner input= new Scanner(System.in);
        int filas, columnas, suma=0;
        System.out.print("digite el número de filas de la matriz: ");
        filas=input.nextInt();
        System.out.print("Digite el número de columnas de la matriz: ");
        columnas=input.nextInt();
        int [][] matriz= new int [filas][columnas];
        int [] vector=new int[columnas];
        for (int fila=0; fila<filas; fila++){
            for (int columna=0; columna<columnas; columna++){
                System.out.print("Digite el numero a guardar en "+"["+fila+"]"+"["+columna+"]: ");
                matriz[fila][columna]=input.nextInt();
                
            }
        }
        
        for (int columna=0; columna<columnas; columna++){
            for (int fila=0; fila<filas; fila++){

                suma+=matriz[fila][columna];
            }

            vector[columna]=suma;
            System.out.print(vector[columna]+ " "); 
            suma=0;

        }
        System.out.println(""); */
      
      
      /*Reinaldo Rueda técnico de la selección Colombia
    de futbol, lo contrata para elaborar un programa en JAVA que
    cumpla las siguientes condiciones: 
      op1 Agregar un jugador (solo nombre) a un arreglo
    - op2 Buscar un jugador por nombre y si no existe
        notificarlo
    - op3 Editar un jugador por nombre y si no existe
        notificarlo
    - op4 Mostrar toda la convocatoria de jugadores
    - op5 Salir*/

     /* int opcion;
           Scanner input = new Scanner(System.in);

           do{
               
               System.out.println("Bienvenido al sistema de convocatoria \n");
               System.out.println("Que desea hacer \n");
               
               
               System.out.println("1: Agregar Jugador");
               System.out.println("2: Buscar Jugador");
               System.out.println("3: Editar Jugador");
               System.out.println("4: Mostrar lista de convocados");
               System.out.println("5: Salir \n");
               
               System.out.print("Digite una opcion: ");
               opcion=input.nextInt();
               
               String[] convocados=new String[3];
               switch(opcion){

                       
                   case 1: 
                       
                                                                 
                       for (int i = 0; i <convocados.length ; i++) {
                           System.out.print("Digite el jugador "+(i+1)+" a ingresar ");
                           convocados[i]=input.next();

                       }

                       break;
                   
                   case 2:
                       
                      System.out.print("Digite un jugador a a buscar: ");                
                      String jugadorBuscar=input.next();
                      boolean flag=false;
        
                      for (int i = 0; i <convocados.length ; i++) {
                          if(convocados[i].equals(jugadorBuscar)){
                        flag=true;
                         break;
                
                         }else{
                             flag=false;
                        }
                      }
        
                    if(flag){
                        System.out.println("el jugador se encuentra dentro de la lista de convocados");
                     }else{
                         System.out.println("el numero no se encuentra dentro de la lista de convocados");
                    }
                          
                    break;
                    
                   case 3:
                          
                    break;
                    
                   case 4:
                       for (int k=0; k<convocados.length;k++){
                            System.out.print(convocados[k] + " ");
                       }
                       
                       break;
                               
                       
                   case 5: 
                       break;
                     
                   
               }
               convocados=convocados;
               System.out.println("");
               
           }while(opcion!=5);*/
        
    }
    
}
