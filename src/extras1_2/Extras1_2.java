/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras1_2;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Extras1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Calcula el área de un circulo pidiendo por pantalla el valor del área
         * por teclado y usando la libreria Math para PI y el radio al cuadrado
         */ 
          Scanner leer = new Scanner (System.in);
        
            double radio;
            System.out.println("Escribir el radio del circulo");
            radio = leer.nextDouble();
            System.out.println("Area = " + Math.PI*Math.pow(radio, 2));
    }
    
}
