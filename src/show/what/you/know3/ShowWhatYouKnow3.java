/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package show.what.you.know3;
import java.util.ArrayList;

/**
 *
 * @author shqia0005
 */
public class ShowWhatYouKnow3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[]numbers = new int [10];

        
        for(int i = 0; i <= 9; i=i+1) 
        {
          numbers[i] = (int)(Math.random()*99 + 1);
          
        }
        ArrayList questions = new ArrayList();
        for(int i = 0; i <= 9; i=i+1) 
        {
          System.out.println(numbers[i] );
          
          
        }
        int max = numbers[0];
        for(int i = 0; i <= 9; i=i+1)
        {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("The max value is " + max + ".");
        int min = numbers[0];
        for(int i = 0; i <= 9; i=i+1)
        {
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("The min value is " + min + ".");
}
}