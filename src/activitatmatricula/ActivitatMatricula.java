/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitatmatricula;

import java.util.Scanner;

/**
 *
 * @author AITOR LEDESMA
 */
public class ActivitatMatricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Introducir el número de UFs matriculadas");
        
        int uf = lector.nextInt();
                
        if (uf >= 12){
            System.out.println("La matricula costará 380 €");
        }else{
            System.out.println("La matricula costará " + uf*30 + " €");
        }
        
    }
    
}
