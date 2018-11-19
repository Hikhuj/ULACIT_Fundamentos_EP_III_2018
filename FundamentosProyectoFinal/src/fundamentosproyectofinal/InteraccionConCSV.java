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
    private final String pathDBTemp = "src/projectDatabase/tempDB.csv";
    public static final String SEPARADOR = ",";
    private int posicionUsuario;
    private int cantidadLineasUsuarioCSV;
    private int cantidadColumnasUsuarioCSV;
    private int cantidadLineasPeliculaCSV;
    private int cantidadColumnasPeliculaCSV;
    
    
    /*
        Funciones
    */
    
    public String[] buscarUsuario(String idUsuario) {

        // BufferedReader: Lee el texto de una entrada de texto, almacenando 
        // los mismo datos a como se reciben para una mejor eficiencia de los
        // caracteres, arreglos y lineas
        
        // Variables
        boolean primeraLinea = true;
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
        
        for (String array1 : array) {
            System.out.print(array1 + ",");
        }
        
        System.out.println();
    
    }
    
    
    private boolean idEncontrado(String [] array, String idUsuario) {
        
        /*
            Funcion recibe un arreglo y lo imprime en consola
        */
        
        boolean resultado = false;
        
        if (idUsuario.equals(array[0])) {
            resultado = true;
        }

        return resultado;
        
    }
    
    
    public boolean guardarDatosUsuario(String [] array, String idUsuario) {
        
        /* 
            BufferedWriter: Escribe texto a una salida de texto, almacenando los mismo datos 
            a como se reciben para una eficaz escritura de los caracteres, arreglos y lineas
        */
        
        // Crear archivo temporal donde se escribiran todos los datos y los nuevos
        boolean result = false;
        BufferedReader br = null;
        boolean primeraLinea = true;
        String tempPath;
        
        // BufferedReader debe ir en Try con el fin de probar el codigo, puede llegar a devolver errores
        try{
            
            // BufferedReader me permite leer datos de una entrada de datos recibida (como un archivo en este caso)
            // FileReader: permite leer "Streams" de datos y de archivos (Steam: fuente o destino de bytes) Streams
            // mas comunes --> archivos.
            br = new BufferedReader(new FileReader(pathDBUsuarios));
            
            // Almacenar una linea del objeto 'br' en una variable tipo String.
            String linea = br.readLine();
            
            // Se crea el archivo temporal que almacenara
            tempPath = crearArchivoTemp();
            
            // Crear un ciclo que permita leer cada linea del objeto mientras no sea NULA
            while(linea != null) {
                
                // Separar la linea leída con el separador definido previamente
                String[] campos = linea.split(SEPARADOR);
                
                if(primeraLinea){
                    
                    escribirEnTemp(campos,tempPath);
                    primeraLinea = false;
                    
                }else{
                    
                    if(idEncontrado(campos, idUsuario) == true) {
                        
                        escribirEnTemp(array,tempPath);
                        
                    }else{
                        
                        escribirEnTemp(campos,tempPath);
                        
                    }
                    
                }
                
                // Volver a leer otra línea del fichero
                linea = br.readLine();

            }

            br.close();
            
        }catch(IOException e) {
            // Cierro el buffer de lectura
            if (br != null) {
                try {
                    br.close();
                } catch (IOException err2) {
                    JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
        return result;
        
    }


    public void escribirEnTemp(String [] array, String path) {
        
        /*
            Agrega la informacion recibida al CSV. La informacion se obtiene por
            medio de un arreglo son sus valores previamente limpiados.
        */

        try {

            FileWriter fw = new FileWriter(path, true);
            
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                
                int contadorComas = (array.length - 1);
                
                for(int i = 0; i < array.length; i++) {
                    bw.write(array[i]);
                    if(i < contadorComas ) {
                        bw.write(",");
                    }
                }
                
                bw.write("\n");
                bw.flush();

            }
            
        }catch(IOException e) {

            JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
        
        }

    }
    
    
    public String crearArchivoTemp() {
        
        File temp;
        
        String path = "src/projectDatabase/tempFile.csv";
        
        try {
        
            // Crear nuevo objeto en Path dado + nombre de archivo
            temp = new File(path);

            if(temp.createNewFile()) {
                System.out.println("Archivo temporal creado correctamente");
            }
            
        }catch(IOException e) {
            
            System.err.println("El archivo no se pudo crear pues ya existe o bien contacte a su programador");
        
        }
        
        return path;
        
    }
    
    
    public void crearUsuarioNuevo(String [] informacionUsuario) {
        
        /*
            Agrega la informacion recibida al CSV. La informacion se obtiene por
            medio de un arreglo son sus valores previamente limpiados.
        */

        try {
            FileWriter fw = new FileWriter(pathDBUsuarios, true);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("\n");
                
                int contadorComas = (informacionUsuario.length - 1);
                
                for(int i = 0; i < informacionUsuario.length; i++) {
                    bw.write(informacionUsuario[i]);
                    if(i < contadorComas ) {
                        bw.write(",");
                    }
                }
                
                bw.flush();
            }
            
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }

    
    public void crearPeliculaNueva(String [] informacionPelicula) {
        
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
            
        }catch(IOException e) {
            JOptionPane.showMessageDialog(null, "El archivo no existe", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }

    }
    

    public void contadorLineasColumnasUsuariosCSV() {
        
        // Variables
        int cantidadLineas = 0;
        int cantidadColumnas = 0;
        boolean primeraLinea = true;
        
        // Inicializaciones
        BufferedReader bufferLectura = null;
        
        try {
            
            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader(pathDBUsuarios));

            // Leer una linea del archivo
            String linea = bufferLectura.readLine();
            
            // Leer las lineas del objeto iterable mientras que no sea Null
            while (linea != null) {
                
                if(primeraLinea){
                    String[] campos = linea.split(SEPARADOR);
                    
                    cantidadColumnas = campos.length;
                    
                    primeraLinea = false;
                    cantidadLineas++;
                }else{
                    cantidadLineas++;
                }
                
                linea = bufferLectura.readLine();
                
            }
            
            bufferLectura.close();
            
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
        
        this.cantidadLineasUsuarioCSV = cantidadLineas;
        this.cantidadColumnasUsuarioCSV = cantidadColumnas;
        
    }
    
    
    public void contadorLineasColumnasPeliculasCSV() {
        
        // Variables
        int cantidadLineas = 0;
        int cantidadColumnas = 0;
        boolean primeraLinea = true;
        
        // Inicializaciones
        BufferedReader bufferLectura = null;
        
        try {
            
            // Abrir el .csv en buffer de lectura
            bufferLectura = new BufferedReader(new FileReader(pathDBPeliculas));

            // Leer una linea del archivo
            String linea = bufferLectura.readLine();
            
            // Leer las lineas del objeto iterable mientras que no sea Null
            while (linea != null) {
                
                if(primeraLinea){
                    String[] campos = linea.split(SEPARADOR);
                    
                    cantidadColumnas = campos.length;
                    
                    primeraLinea = false;
                    cantidadLineas++;
                }else{
                    cantidadLineas++;
                }
                
                linea = bufferLectura.readLine();
                
            }
            
            bufferLectura.close();
            
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
        
        this.cantidadLineasPeliculaCSV = cantidadLineas;
        this.cantidadColumnasPeliculaCSV = cantidadColumnas;
        
    }
    
    
    
    
    
    
}