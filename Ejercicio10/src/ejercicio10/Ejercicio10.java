/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Mateo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int variable1 = 25; 
        int variable2 = 10; 
        int variable3 = 100; 
        int variable4 = 5; 
        int variable5 = 2; 
        
        System.out.println("El enunciado es");
        
        double mateinicial = Math.sqrt(variable1) * variable2; 
        boolean booleano1 = mateinicial >= variable3; 
        boolean booleano2 = (variable2/variable4) >= variable5; 
        boolean resultado = booleano1 && true || false || booleano2; 
        
        System.out.println(resultado);
    }
    
}
