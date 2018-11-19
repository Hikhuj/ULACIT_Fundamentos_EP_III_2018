/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

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

        String [] actualizarUsuario = {"1", "Monster", "Ducati", "D", "12345678", "m", "afsdgsdfg", "dsfgdfgdfg", "dfgdfg", "fs", "1", "roger@ducati.com", "true", "false"};
        
        /*
        String [] array = null;
        
        array = backendCSV.leerCSV("9044526861");
        
        System.out.println("Imprimiendo arreglo obtenido");
        backendCSV.imprimirArreglo(array);
        */
        
        // menus.inicializador();
        
        backendCSV.guardarDatosUsuario(actualizarUsuario,"1");
        

        
    }

}