
package eval_2020_07_30;

import java.util.Scanner;

public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      
         int[]tab = { 2, 4, 6, 3, 4, 8, 2, 9, 4, 2};

     
 
    }
    
       public static void nbOccurences(int[] tab) {
                   
           int nl=tab.length;
            Scanner reader = new Scanner(System.in);
           System.out.println("Saisissez un nombre: ");
           int n= reader.nextInt();
           int occurence;
           tab = new int [nl];
      
           occurence = 0;
           for(int i=0; i<nl ;i++){
               if(n == tab[nl]){
                   occurence=occurence+1;
             }
           }
  
           System.out.print(occurence);

       }
       
    
}
