/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

import java.io.*;
import java.util.*;

/**
 *
 * @author rogerjoseulaterivera
 */
public class FundamentosProyectoFinal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        // Menus menus = new Menus();
        InteraccionConCSV backendCSV = new InteraccionConCSV();
        
        String [] informacionPelicula = {"demo1", "demo2", "demo3", "demo4", "demo5"};
        
        
        /*
        String [] array = null;
        
        array = backendCSV.leerCSV("9044526861");
        
        System.out.println("Imprimiendo arreglo obtenido");
        backendCSV.imprimirArreglo(array);
        */
        
        // menus.inicializador();
        
        backendCSV.editarCSV(informacionPelicula, "33033");
        
        
    }

}