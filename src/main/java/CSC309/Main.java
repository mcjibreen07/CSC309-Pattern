/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC309;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author cyber-devil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        String name = sn.next();
        Lexems lx = new Lexems(name);
        char k = lx.getAll();
       while(k<0)
       {
       out.println(lx.toString());
       }
    }
    
}



public class Lexems {
    private int index = 0;
    private String txt;
    
    
    public  Lexems(String input){
        this.txt = input;
    }
     
    public char getAll(){
    if(index<txt.length())
     
        return txt.charAt(index++);   
    else 
        return ('N');
    }
}

