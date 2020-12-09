/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho1;

import entities.Categoria;

/**
 *
 * @author drico
 */
public class Trabalho1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setDescricao("teste");
        categoria.persist();
        
    }
    
}
