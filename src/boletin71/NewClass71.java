

package boletin71;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class NewClass71 {
    int num1,num2;
    
    public int pedirNumeroEnteiro(){
        int num;
        String res =JOptionPane.showInputDialog("Introduce o numero");
        num=Integer.parseInt(res);
        return num;}
        
public void comparar(int num1,int num2){
        
         if(num1> num2)
         System.out.println("o maior e:"+num1);
         else if(num2> num1)
             System.out.println("o maior e:"+num2);
         
         else
             System.out.println("son iguais");
        }
    
    
}
