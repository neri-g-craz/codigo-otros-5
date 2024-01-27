package org.generation.codigootros5;
import java.util.Scanner; //Se añadió la importación

//Paulina Mendoza me dio 5

// El desarrollador mantuvo en todo momento la camara activa y explico cada una de las correcciones que hizo

public class Codigo5 {
    public static void main(String[] args) { //Se agrego la clase para materializar

        Scanner s = new Scanner(System.in); //Se agregó un system in para q¿poder ingresar al sistema la información del escaner
        
        System.out.print("Introduzca un número: "); //Se usó solo ""
        
        int ni = s.nextInt(); //Se cambió a un tipo de dato primitivo int
        
        int c = ni;
        int afo = 0;
        int noAfo = 0;
        
        do {
          int digito = ni % 10; //Se eliminó la doble declaración de int
          if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
            afo++;
          } else {
            noAfo++;
          
          ni /= 10;
        }} while (afo<=1 && noAfo<=1); //Se cambió el ciclo while a un do-while para evitar un ciclo
        if (afo > noAfo) {
          System.out.println("El " + c + " es un número afortunado."); //Estaba mal escrito el método
        } else {
          System.out.println("El " + c + " no es un número afortunado.");
        }
        
        }
    }