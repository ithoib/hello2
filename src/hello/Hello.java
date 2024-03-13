/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hello;
import java.util.Arrays;
/**
 *
 * @author RPL
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arrayAngka[][] = {{1,2,3,4,5,6,7,8}, {1,2,3,4,5,6,7,8}};
        
        arrayAngka[1][3] = 10;
        
        // for standar
        for (int i=0; i<arrayAngka.length; i++){
            for(int j=0; j<arrayAngka[i].length; j++){
                System.out.print(arrayAngka[i][j] + " ");
            }
            System.out.print("\n");
        }
        
    }
    
}
