/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class CalculadoraEdades{

    private int[] edades;

    public CalculadoraEdades(int[] edades){
    this.edades = edades;
}

    public double calcularPromedioMayoresEdad() {
    int sumaEdadesMayores = 0;
    
    int cantidadMayores = 0;
    for (int edad : edades){
    if (edad >= 18){
    sumaEdadesMayores += edad;
    cantidadMayores++;
    }
}
       
    return cantidadMayores>0 ?(double) sumaEdadesMayores/cantidadMayores :0;
}

    public double calcularPromedioMenoresEdad(){
    int cantidadMenores=0;
    int sumaEdadesMenores=0;
    
    for(int edad:edades){
        if(edad< 18){
        sumaEdadesMenores += edad;
        cantidadMenores++;
}
        }
        return cantidadMenores> 0 ? (double)sumaEdadesMenores /cantidadMenores:0;
    }

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de persona en el grupo:");
    int cantidadPersonas = scanner.nextInt();
    int[] edades = new int[cantidadPersonas];
       
    for (int i = 0; i < cantidadPersonas; i++) {
        System.out.println("Ingrese la edad de la persona " +(i + 1)+ ":");
        
        edades[i]=scanner.nextInt();
        }
       
    CalculadoraEdades calculadora = new CalculadoraEdades(edades);
    double promedioMenores = calculadora.calcularPromedioMenoresEdad();
    System.out.println("El promedio de edades de los menores es: " + promedioMenores);
    
    double promedioMayores = calculadora.calcularPromedioMayoresEdad();
    System.out.println("El promedio de edades de los mayores es:" + promedioMayores);
        
    scanner.close();
    }
}