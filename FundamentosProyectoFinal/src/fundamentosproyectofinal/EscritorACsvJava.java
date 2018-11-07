/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class EscritorACsvJava {
    
    // Variables
    private String pathDBUsuarios = "src/projectDatabase/usuarios.csv";
    public static final String SEPARADOR = ",";

    public String[] leerCSV(String idUsuario) {

        // BufferedReader: Lee el texto de una entrada de texto, almacenando 
        // los mismo datos a como se reciben para una mejor eficiencia de los
        // caracteres, arreglos y lineas
        
        // Variables
        boolean primeraLinea = true;
        boolean idEncontrado = false;
        String [] informacionUsuario = null;
        
        // Inicializaciones
        BufferedReader bufferLectura = null;
        
        try {
            
            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader(pathDBUsuarios));

            // Leer una linea del archivo
            String linea = bufferLectura.readLine();
            
            // Leer las lineas del objeto iterable mientras que no sea Null
            while (linea != null) {
                
                // La siguiente linea evita leer la primera linea, la cual son los
                // Headers del archivo CSV.
                if(primeraLinea){
                    primeraLinea = false;
                }else{
                    
                    // Separar la linea leída con el separador definido previamente
                    String[] campos = linea.split(SEPARADOR);

                    idEncontrado = idEncontrado(campos, idUsuario);
                    
                    if (idEncontrado(campos, idUsuario) == true) {
                        
                        informacionUsuario = campos;
                        linea = null;
                        break;
                        
                    }

                }
                
                // Volver a leer otra línea del fichero
                linea = bufferLectura.readLine();
                
            }
            
        } catch (IOException err1) {
            // Cierro el buffer de lectura
            if (bufferLectura != null) {
                try {
                    bufferLectura.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        return informacionUsuario;
        
    }
    
 
    public void imprimirArreglo(String [] array) {
        
        /*
            Funcion recibe un arreglo y lo imprime en consola
        */
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ",");
        }
        System.out.println();
    
    }
    
    
    public boolean idEncontrado(String [] array, String idUsuario) {
        
        /*
            Funcion recibe un arreglo y lo imprime en consola
        */
        
        boolean resultado = false;
        long idLong = Long.parseLong(array[0]);
        long idUsuarioLong = Long.parseLong(idUsuario);
        
        if (idLong == idUsuarioLong) {
            resultado = true;
        }
        
        return resultado;
        
    }
    
    
    
    
}