/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author Mateo
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int variable1 = 81; 
        int variable2 = 25; 
        int variable3 = 10; 
        
        System.out.println("El enunciado es");
        
        double mateinicial = Math.sqrt(variable1) + Math.sqrt(variable2) 
                *variable3; 
        boolean resultado = mateinicial >= (variable2*2);
        
        System.out.println(resultado);
    }
    
}
