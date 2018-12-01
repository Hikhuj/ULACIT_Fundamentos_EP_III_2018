/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Interaccion {

    /*
        VARIABLES
    */
    private final String [] datosDB = {"Id: ", 
                                        "Nombre: ", 
                                        "Anio: ", 
                                        "Sinopsis: ",
                                        "Director: ",
                                        "Genero: ",
                                        "Tipo de Disco: ",
                                        "Estado de pelicula: "};
    
    private final String [] datosDBUsuario = {
                                                "Id: ",
                                                "Apellido: ",
                                                "Nombre: ",
                                                "Segundo Nombre: ",
                                                "Telefono Primario: ",
                                                "Genero: ",
                                                "Direccion 1: ",
                                                "Direccion 2: ",
                                                "Ciudad: ",
                                                "Provincia: ",
                                                "Tipo de Telefono: ",
                                                "Correo Electronico: ",
                                                "Estado del Cliente: ",
                                                "Peliculas Rentadas: ",
                                            };
    
    /*
        INSTANCIAS 
    */

    Pelicula pelicula = null;
    

    /*
        METODOS
    */
    
    // Métodos para limpiar y atrapar errores en el código: USUARIO Y PELICULAS
    
    public String apellidoUsuarioLimpio() {

        String apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");

        while (apellido.contains("1") || apellido.contains("2")
                || apellido.contains("3") || apellido.contains("4")
                || apellido.contains("5") || apellido.contains("6")
                || apellido.contains("7") || apellido.contains("8")
                || apellido.contains("9") || apellido.contains("0")) {
            JOptionPane.showMessageDialog(null, "El apellido no debe contener números. "
                    + "Ingréselo de nuevo.");
            apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente: ");
        }

        return apellido;
        
    }
    
    public String nombreUsuarioLimpio() {

        /*
            se utiliza if String contains para evitar que el bibliotecólogo ingrese un dato tipo
            string con números. Se usa así pues al ingresar un número como tal Java no va a dar una
            excepcion pues acepta el número como un string, pero esto puede más adelante causar problemas
            porque si se quiere buscar a una persona por ejemplo usando el nombre y el dato contiene un número
            que se ingresó por error, no se va a poder encontrar a esa persona.
         */
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");

        while (nombre.contains("1") || nombre.contains("2")
                || nombre.contains("3") || nombre.contains("4")
                || nombre.contains("5") || nombre.contains("6")
                || nombre.contains("7") || nombre.contains("8")
                || nombre.contains("9") || nombre.contains("0")) {
            JOptionPane.showMessageDialog(null, "El nombre no debe contener números. Ingréselo de nuevo");
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        }

        return nombre;

    }
    
    public String segundoNombreUsuarioLimpio() {

        //este es un caso similar al de nombre, no se permite guardar el apellido si éste contine números
        String segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente:");

        while (segundoNombre.contains("1") || segundoNombre.contains("2")
                || segundoNombre.contains("3") || segundoNombre.contains("4")
                || segundoNombre.contains("5") || segundoNombre.contains("6")
                || segundoNombre.contains("7") || segundoNombre.contains("8")
                || segundoNombre.contains("9") || segundoNombre.contains("0")) {
            JOptionPane.showMessageDialog(null, "El segundo nombre no debe contener números. "
                    + "Ingréselo de nuevo");
            segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente:");
        }

        return segundoNombre;
        
    }
    
    public int telefonoLimpio() {

        // Variables
        boolean done = false;
        int telefono = 0;
        String telefonoString;

        do {
            
            telefonoString = JOptionPane.showInputDialog("Ingrese el número de teléfono (sin espacios ni guiones):");
            
            try {
                
                if(telefonoString.length() == 8) {
                    telefono = Integer.parseInt(telefonoString);
                    done = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Error al ingresar el teléfono, ocho digitos son requeridos.");
                }
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar el teléfono, solo escriba números, no letras.");
            }

        } while (!done);
        
        return telefono;

    }

    public String direccion1UsuarioLimpio() {
        
        String var = JOptionPane.showInputDialog("Ingrese la direccion 1 del usuario");
        String resultado = var.replace(',', '.');
        return resultado;
        
    }
    
    public String direccion2UsuarioLimpio() {
        
        String var = JOptionPane.showInputDialog("Ingrese la direccion 2 del usuario");
        String resultado = var.replace(',', '.');
        return resultado;
        
    }
    
    public String tipoTelefonoLimpio() {

        int opc = 0;
        boolean done = true;
        String result = "";
        
        while(done) {
            
            try{
                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de teléfono:"
                + "\n 1. Celular."
                + "\n 2. Hogar "
                + "\n 3. Oficina. "
                + "\n 4. Otro."));
                
                if(opc > 0 && opc < 5){
                    switch(opc) {
                        case 1:
                            result = "Celular";
                            break;
                        case 2:
                            result = "Hogar";
                            break;
                        case 3:
                            result = "Oficina";
                            break;
                        case 4:
                            result = "Otro";
                            break;
                    }
                    done = false;
                }else{
                    JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "No ingreso un valor numerico", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        return result;
        
    }

    public char generoLimpio() {
        
        char genero = 'f';
        boolean done = true;
        int opcion;
        
        while(done){
            
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente al género de la persona:"
                                                                    + "\n1. Femenino."
                                                                    + "\n2. Maculino"
                                                                    + "\n3. Otro"));
                if(opcion > 0 && opcion < 4) {
                    switch (opcion) {
                        case 1:
                            genero = 'f';
                            break;
                        case 2:
                            genero = 'm';
                            break;
                        case 3:
                            genero = 'o';
                            break;
                    }
                    done = false;
                }else{
                    JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Error: Valor no numerico", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        return genero;
        
    }

    public String ciudadLimpio() {
        
        String var = JOptionPane.showInputDialog("Ingrese la ciudad del usuario");
        return var;
        
    }
    
    public String provinciaLimpio() {
        
        String provincia = "";
        boolean done = true;
        int opcion;
        
        while(done){
            
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente a la ciudad donde vive el cliente:"
                                                                        + "\n 1. San Jose. "
                                                                        + "\n 2. Alajuela "
                                                                        + "\n 3. Heredia. "
                                                                        + "\n 4. Cartago. "
                                                                        + "\n 5. Limón."
                                                                        + "\n 6. Puntarenas. "
                                                                        + "\n 7. Guanacaste."));
                if(opcion > 0 && opcion < 8) {
                    switch (opcion) {
                        case 1:
                            provincia = "San Jose";
                            break;
                        case 2:
                            provincia = "Alajuela";
                            break;
                        case 3:
                            provincia = "Heredia";
                            break;
                        case 4:
                            provincia = "Cartago";
                            break;
                        case 5:
                            provincia = "Limon";
                            break;
                        case 6:
                            provincia = "Puntarenas";
                            break;
                        case 7:
                            provincia = "Guanacaste";
                            break;
                    }
                    done = false;
                }else{
                    JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Error: Valor no numerico", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        return provincia;
        
    }

    public String correoElectronico() {
        
        boolean done = true;
        String correoElectronico = "";
        
        while(done) {
            
            correoElectronico = JOptionPane.showInputDialog("Ingrese el correo electronico del cliente: ");
            
            if(correoElectronico.contains("@") && correoElectronico.contains(".")){
                done = false;
            }else{
                JOptionPane.showMessageDialog(null, "Error: Formato de correo no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }

        return correoElectronico;
        
    }
    
    /*
    public void yearPeli() {
        int yearPeli;
        boolean done = false;
        do {
            try {
                String texto = JOptionPane.showInputDialog("Ingrese el año de la película");
                yearPeli = Integer.parseInt(texto);
                limpiezaPelicula.setYear(yearPeli);
                JOptionPane.showMessageDialog(null, "El año ingresado es: " + limpiezaPelicula.getYear());
                done = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar el año, solo escriba números, no letras.");
            }
        } while (!done);
    }
    */

    public String directorLimpio() {
        
        String director;
        
        director = JOptionPane.showInputDialog("Ingrese el nombre del director: ");
        
        while (director.contains("1") || director.contains("2")
                || director.contains("3") || director.contains("4")
                || director.contains("5") || director.contains("6")
                || director.contains("7") || director.contains("8")
                || director.contains("9") || director.contains("0")) {
            JOptionPane.showMessageDialog(null, "El nombre no debe contener números. "
                    + "Ingréselo de nuevo.");
            director = JOptionPane.showInputDialog("Ingrese el nombre del director.");
        }

        return director;
        
    }
    
    public void imprimirDatosPelicula(String [] informacionPelicula) {
        
        if(informacionPelicula != null){
                
            for (int i = 0; i < informacionPelicula.length; i++) {
            
                if(i == (informacionPelicula.length - 1)) {
                    
                    if(informacionPelicula[i].equals("true")) {
                        System.out.println(datosDB[i] + "Activo");
                    }else{
                        System.out.println(datosDB[i] + "No Activo");
                    }
                    
                }else{
                    
                    System.out.println(datosDB[i] + informacionPelicula[i]);
                    
                }
                
            }
                
        }else{
            
            JOptionPane.showMessageDialog(null, "No existe pelicula con ese ID", "Error: Busqueda Pelicula", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
    // VOY POR ACA
    public void imprimirDatosUsuario(String [] informacionUsuario) {
        
        /*
            "Id: ",
            "Apellido: ",
            "Nombre: ",
            "Segundo Nombre: ",
            "Telefono Primario: ",
            "Genero: ",
            "Direccion 1: ",
            "Direccion 2: ",
            "Ciudad",
            "Provincia",
            "Tipo de Telefono: ",
            "Correo Electronico: ",
            "Estado del Cliente: ",
            "Peliculas Rentadas: ",
        */
        
        if(informacionUsuario != null){
                
            for (int i = 0; i < informacionUsuario.length; i++) {
            
                switch(i) {
                    case 12:
                        if(informacionUsuario[i].equals("true")) {
                            System.out.println(datosDBUsuario[i] + "Activo");
                        }else{
                            System.out.println(datosDBUsuario[i] + "No Activo");
                        }
                        break;
                    case 13:
                        if(informacionUsuario[i].equals("true")) {
                            System.out.println(datosDBUsuario[i] + "Si");
                        }else{
                            System.out.println(datosDBUsuario[i] + "No");
                        }
                        break;
                    default:
                    System.out.println(datosDBUsuario[i] + informacionUsuario[i]);
                    
                }
                
            }
                
        }else{
            
            JOptionPane.showMessageDialog(null, "No existe pelicula con ese ID", "Error: Busqueda Pelicula", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }

    public String generoPelicula() {

        String result = "";
        boolean done = true;
        
        do{
        
            try{

                int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente al género"
                    + " de la película: "
                    + "\n 1. Comedia. "
                    + "\n 2. Romance "
                    + "\n 3. Drama. "
                    + "\n 4. Scifi. "
                    + "\n 5. Terror."
                    + "\n 6. Fantasía."
                    + "\n 7. Independiente."));

                switch (opcion) {
                    case 1:
                        result = "Comedia";
                        done = false;
                        break;
                    case 2:
                        result = "Romance";
                        done = false;
                        break;
                    case 3:
                        result = "Drama";
                        done = false;
                        break;
                    case 4:
                        result = "Sci-Fi";
                        done = false;
                        break;
                    case 5:
                        result = "Terror";
                        done = false;
                        break;
                    case 6:
                        result = "Fantasia";
                        done = false;
                        break;
                    case 7:
                        result = "Independiente";
                        done = false;
                        break;
                }

            }catch(Exception e) {

                JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error: Menu Principal", JOptionPane.ERROR_MESSAGE);

            }
        
        }while(done);

        return result;
        
    }

}
