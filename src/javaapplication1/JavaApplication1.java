/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author robsom.mathei
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        
        pessoa1.setCodigo(1);
        
        System.out.println("Pessoa1 = " + pessoa1.getCodigo() + "\n");
    }
    
}
