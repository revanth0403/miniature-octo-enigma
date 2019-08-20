/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.Big;


/**
 *
 * @author revanth
 */
public class Big {
  
    
    public static int minimum(int i,int j){
                return i>j?j:i;
        }
        public static int maxmimum(int i,int j){
                return i>j?i:j;
        }
        public static void main(String[] args) {
               
            int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};

            int smallest = numbers[0];
            int largetst = numbers[0];
               
            for(int i=1; i< numbers.length; i++) {
                largetst=maxmimum(largetst,numbers[i]);
                smallest=minimum(smallest,numbers[i]);
            }
              System.out.println("Largest Number is : " + largetst);
            System.out.println("Smallest Number is : " + smallest);
        }

    
    
}
