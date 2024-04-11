/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6com1;

import java.util.TreeSet;
import tp6com1.entidades.Categoria;
import tp6com1.entidades.Producto;

/**
 *
 * @author Usuario
 */
public class Tp6Com1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TreeSet<Producto> lista=new TreeSet<>();
        Producto arroz=new Producto(12,"Arroz Gallo x 1kg",1300,10,new Categoria(1,"Comestible"));
        Producto cafe=new Producto(5,"Cafe Cabrale",5000,20,new Categoria(1,"Comestible"));
        Producto fideos=new Producto(12,"Fideos",3200,12,new Categoria(1,"Comestible"));
        System.out.println(lista.add(arroz));
        System.out.println(lista.add(cafe));
        System.out.println(lista.add(fideos));
               
        
        for(Producto prod:lista){
        
            System.out.println(prod.getCodigo());
            System.out.println(prod.getDescripcion());
        }
    }
    
}
