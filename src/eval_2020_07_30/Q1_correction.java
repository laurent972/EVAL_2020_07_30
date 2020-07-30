/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval_2020_07_30;

/**
 *
 * @author Formation
 */
public class Q1_correction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          int n=4;
          int[] t1 = { 2, 4, 6, 3, 4, 8, 2, 9, 4, 2};
          System.out.printf("Nombre d'occurence: %d%n", NbOccurences(t1,n));
          
          int[][] t2 = {
                        { 4, 5, 6, 3, 4, 8, 2, 9, 4, 2},
                        { 2, 4, 6, 3, 4, 8, 2, 9, 4, 2}
                 };
          System.out.printf("Nombre d'occurence: %d%n", NbOccurences(t2,n));
   
        
    }
    
    
    
    public static int NbOccurences(int [] tab, int n) {
        
        int compteur =0;
        for(int i=0; i<tab.length;i++){
            if(tab[i]==n){
                compteur++;
            }
        }
        return compteur;

    }
    
    public static int NbOccurences(int [][] tab, int n) {
        
        int compteur =0;
        for(int i=0; i<tab.length;i++){
            for(int j=0; j<tab[0].length; j++){
               if(tab[i][j]==n){
                compteur++;
                }
            }
        }
        return compteur;
        
        /* compteur =0;
            for(int i=0; i<tab.length; i++)
                compteur = compteur + NbOccurrences(tab[i],n);
            return compteur;*/
    }
    
}
