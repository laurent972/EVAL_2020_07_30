/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval_2020_07_30;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Q2_correction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       
       System.out.print("Saisir un mot : ");
       String mot = reader.next();
       
       System.out.println(Estpalindrome(mot) ? "palindrome" : "Non Palindrome");  
       
       String[] dico= {"kayak","radar", "bonjour", "soleil"};
       System.out.printf("Nombre palindrome : %d%n", NbPld(dico));
       
    }
    
    
    public static boolean Estpalindrome(String mot) {
       
        String motInverse = "";
        
        int n = mot.length();
        for(int i=n-1; i>=0; i--){
            motInverse = motInverse+mot.charAt(i);           
        }
        
        return mot.equals(motInverse);
        
    }
    
      public static int NbPld(String[] tab) {
       
          int n= tab.length;
          int compteur = 0;
         /* for(int i=0; i<n; i++)
              if(Estpalindrome(tab[i])) compteur++;
          return compteur;*/
          
         // Boucle foreach
         for(String s:tab){
             if(Estpalindrome(s)) compteur++;
         }
         return compteur;
       
    }
    
}
