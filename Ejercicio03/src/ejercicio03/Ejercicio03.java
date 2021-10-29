/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author mateoburvi
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int variable1 = 10; 
        int variable2 = 16; 
        int variable3 = 20; 
        int variable4 = 1; 
        int variable5 = 11; 
        
        System.out.println("Resultado total");
        
        double resultado = Math.pow(variable1, 2) + Math.sqrt(variable2) + 
                           variable3 / (variable4 + variable5); 
        
        System.out.println(resultado);
    }
    
}
