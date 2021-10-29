/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author mateoburvi
 */
public class Ejercicio07 {

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
        int variable6 = 100; 
        int variable7 = 25; 
        
        System.out.println("El enunciado es");
        
        double mateinicial = (Math.sqrt(variable1)+ variable2) / variable3; 
        double matefinal = variable6/variable7;
        boolean booleano2 = variable4 > variable5;
        boolean booleano1 = mateinicial == variable2;
        boolean booleano3 = matefinal > Math.sqrt(variable6);
        boolean resultadoparcial = booleano1 || booleano2;
        boolean resultadototal = resultadoparcial && booleano3 ; 
        
        System.out.println(resultadototal);
        
    }
    
}
