/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checktheelement;
/**
 *
 * @author revanth
 */
public class CheckTheElement {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
      int[] a = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
      int target = 0;
      
      for (int i = 0; i < a.length; i++) {
         if (a[i] == target) {
            System.out.println("Element found at index " + i);
            break;
         } 
      } 
   }
   /*
        // TODO code application logic here
    }
    
}
