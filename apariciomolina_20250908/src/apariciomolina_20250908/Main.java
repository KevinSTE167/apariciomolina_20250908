/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apariciomolina_20250908;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        //tamaño del arreglo
        int cantidad_elementos = 5;
        
        //creacion e instancia de numeros desordenados
        int[] numeros_desordenados = new int[cantidad_elementos];
        
        //creacion e instancia de numeros ordenados
        int[] numeros_ordenados = new int[cantidad_elementos];
        
        //creacion e instancia del objeto escanner
        Scanner scanner = new Scanner(System.in);
        
        //notificacion al usuario para indicar que debe ingresar valores enteros
        System.out.println("Por favor ingrese "+cantidad_elementos+" numeros enteros de manera desordenada");
        
        //se recorre el arreglo de umeros enteros que por defecto el valor tiene numero cero
        for(int i = 0; i<numeros_desordenados.length; i++){
            //se solicita al usuario el ingreso de un valor
            System.out.print("Digite el elemento: "+(i+1)+": ");
            
            //se digita un valor desde el teclado de tipo entero
            numeros_desordenados[i] = scanner.nextInt();
            
        }
        
        //se importa una salida al usuario para mostrar lo que ha digitado
        System.out.println("Usted digito los siguientes numeros:");
        
        //se recorre el arreglo de valores digitados
        for(int j = 0; j<numeros_desordenados.length ;j++){
            
            //se imprimen los valores digitados, almacenados en el arreglo numeros desordenados
            System.out.print(numeros_desordenados[j]+" ");
            
        }
        //salto de linea
        System.out.println();
        
        //invocamos la funcion para ordenar elarreglo
        numeros_ordenados = ordenar(numeros_desordenados);
        
        //imprimimos la salida al usurio
        System.out.print("Los numeros ordenados son: ");
        
        //se recorre el arreglo para obtener cada valor del arreglo
        for(int k=0; k<numeros_ordenados.length ;k++){
            
            //se imprime el valor de cada elemento
            System.out.print(numeros_ordenados[k]+" ");
            
        }
        //salto de linea
        System.out.println();
        
    }
    
    //funcion para ordenar un arreglo unidimensional
    public static int[] ordenar(int[] arreglo ){
        
        //se recorre el arreglo para evaluar cada posicion
        for(int i=0; i<arreglo.length-1 ;i++){
            
            //se hace un segundo recorrido para poder comparar
            //la posicion actual con la posicion siguiente
            for(int j=0; j<arreglo.length-1 ;j++){
                
                //se evalua el valor de cada elemento del arreglo
                if (arreglo[j]>arreglo[j+1]){
                    
                    //si es mayor, se crea una variable para almacenar el valor
                    //del elemento mayor
                    int mayor = arreglo[j];
                    
                    //se cambia la posicion del elemento actual
                    arreglo[j] = arreglo[j+1];
                    
                    //se intercambia la posicion del siguiente elemento
                    //asignando el valor mayor
                    arreglo[j+1] = mayor;
                }
                
                
            }
            
            
        }
        return arreglo;
    }
}
