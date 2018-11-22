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

        InteraccionConCSV backend = new InteraccionConCSV();
        Menus backendDos = new Menus();
        
        String [] array = {"5", "Demo 5", "Demo 5", "Demo Segundo Nombre 5", "22225050", "m", "Demo 5 Address", "Demo 5 Address 2", "", "", "1", "ema@il", "true", "false"};
        String [] array2 = {"23", "Demo nombre", "Demo anio", "Demo descripcion", "demoDirector", "1", "0"};
        
        
        // backend.actualizarDatosUsuario(array, "3");
        // backend.actualizarDatosPelicula(array2, "44444");
        backendDos.inicializador();
        
    }

}
