/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author mateoburvi
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int variable1 = 10;
        int variable2 = 9; 
        int variable3 = 20; 
        int variable4 = 500; 
        int variable5 = 2; 
        int variable6 = 3; 
        int variable7 = 200; 
        int variable8 = 50; 
        int variable9 = 51; 
        
        System.out.println("El enunciado es");
        
        double mateinicial = (variable1*variable2)+ variable3 
                - (variable4 / variable5) + Math.pow(variable6, 2); 
        boolean booleano1 = mateinicial >= variable7; 
        double matefinal = variable8 - variable8 + variable9; 
        boolean booleano2 = variable8 >= matefinal;
        boolean resultadofinal = booleano1 || booleano2; 
        
        System.out.println(resultadofinal);
    }
    
}
