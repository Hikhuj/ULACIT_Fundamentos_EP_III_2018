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
public class InteraccionConCSV {
    
    /*
        Variables
    */
    
    private final String pathDBUsuarios = "src/projectDatabase/usuarios.csv";
    private final String pathDBPeliculas = "src/projectDatabase/peliculas.csv";
    public static final String SEPARADOR = ",";
    
    
    /*
        Funciones
    */
    
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
                        bufferLectura.close();
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
    
    
    private boolean idEncontrado(String [] array, String idUsuario) {
        
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
    
    
    public boolean editarCSV(String [] array, String idUsuario) {
        
        /* 
            BufferedWriter: Escribe texto a una salida de texto, almacenando los mismo datos 
            a como se reciben para una eficaz escritura de los caracteres, arreglos y lineas
        */
        
        String tempFile = "src/projectDatabase/";
        File oldFile = new File(pathDBPeliculas);
        File newFile = new File(tempFile);
        
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x = new Scanner(new File(pathDBPeliculas));
            x.useDelimiter("[,\n]");
            
            int i = 0;
            while(x.hasNext()) {
                
            }
        }catch(Exception e) {
            
        }
        
        
    }
    
    
    public void reemplazarValoresCSV(String [] array) {
    
        
    
    }
    
    
    public void usuarioNuevo(String [] informacionUsuario) {
        
        /*
            Agrega la informacion recibida al CSV. La informacion se obtiene por
            medio de un arreglo son sus valores previamente limpiados.
        */

        try {
            FileWriter fw = new FileWriter(pathDBUsuarios, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("\n");

            int contadorComas = (informacionUsuario.length - 1);

            for(int i = 0; i < informacionUsuario.length; i++) {
                bw.write(informacionUsuario[i]);
                if(i < contadorComas ) {
                    bw.write(",");
                }
            }

            bw.flush();
            bw.close();
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
    public void peliculaNueva(String [] informacionPelicula) {
        
        /*
            Agrega la informacion recibida al CSV. La informacion se obtiene por
            medio de un arreglo son sus valores previamente limpiados.
        */

        try {
            FileWriter fw = new FileWriter(pathDBPeliculas, true);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("\n");
                
                int contadorComas = (informacionPelicula.length - 1);
                
                for(int i = 0; i < informacionPelicula.length; i++) {
                    bw.write(informacionPelicula[i]);
                    if(i < contadorComas ) {
                        bw.write(",");
                    }
                }
                
                bw.flush();
            }
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    
    
    
    
    
    
}