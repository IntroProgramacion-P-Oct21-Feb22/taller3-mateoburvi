/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio06;

/**
 *
 * @author mateoburvi
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int variable1 = 81; 
        int variable2 = 9; 
        int variable3 = 3; 
        int variable4 = 10; 
        int variable5 = 1; 
        
        System.out.println("El enunciado es");
        
        double resultado1 = (Math.sqrt(variable1)+ variable2)/variable3;
        boolean resultado2 = resultado1 == variable2; 
        boolean resultadototal = resultado2 && (variable4 > variable5);
        
        System.out.println(resultadototal);
        
    }
    
}
