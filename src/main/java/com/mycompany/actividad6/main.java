
package com.mycompany.actividad6;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner ca = new Scanner(System.in);
        int calif[] = new int[5];
        float promedio;
        String nom;
        int suma=0;
        
        System.out.println("Bienvenido al calculador de calificaciones");
        System.out.println("Ingrese el nombre del estudiante");
        nom = ca.next();
        
        System.out.println("Ingrese la primera calificacion");
        calif[0] = ca.nextInt();
        
        System.out.println("Ingrese la segunda calificacion");
        calif[1] = ca.nextInt();
        
        System.out.println("Ingrese la tercera calificacion");
        calif[2] = ca.nextInt();
        
        System.out.println("Ingrese la cuarta calificacion");
        calif[3] = ca.nextInt();
        
        System.out.println("Ingrese la quinta calificacion");
        calif[4] = ca.nextInt();
        
        for(int i=0; i<calif.length; i++){
            suma+=calif[i];
        }
      promedio = (suma/calif.length);
      
      
      System.out.println("Nombre de estudiante: " + nom);
      System.out.println("Calificacion 1: " + calif[0]);
      System.out.println("Calificacion 2: " + calif[1]);
      System.out.println("Calificacion 3: " + calif[2]);
      System.out.println("Calificacion 4: " + calif[3]);
      System.out.println("Calificacion 5: " + calif[4]);
      System.out.println("Tu promedio es: " + promedio);
      
      if(promedio <= 50){
          System.out.println("Tu calificacion es: F");
      }
      if(promedio >= 51 && promedio <= 60){
        System.out.println("Tu calificacion es: E");
    }
      if(promedio >= 61 && promedio <= 70){
        System.out.println("Tu calificacion es: D");
    }
      if(promedio >= 71 && promedio <= 80){
        System.out.println("Tu calificacion es: C");
    }
      if(promedio >= 81 && promedio <= 90){
        System.out.println("Tu calificacion es: B");
    }
      if(promedio >= 91 && promedio <= 100){
        System.out.println("Tu calificacion es: A");
    }
    }
}
