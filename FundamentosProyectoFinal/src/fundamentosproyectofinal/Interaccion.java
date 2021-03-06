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
                                        "Pelicula rentada?: "};
    
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
    Miscelaneos miscelaneos = new Miscelaneos();
    

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

        String resultado = apellido.replace(',', '.');
        
        return resultado;
        
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

        String resultado = nombre.replace(',', '.');
        
        return resultado;

    }
    
    public String segundoNombreUsuarioLimpio() {

        //este es un caso similar al de nombre, no se permite guardar el apellido si éste contine números
        String segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente:");

        while (segundoNombre.contains("1") || segundoNombre.contains("2")
                || segundoNombre.contains("3") || segundoNombre.contains("4")
                || segundoNombre.contains("5") || segundoNombre.contains("6")
                || segundoNombre.contains("7") || segundoNombre.contains("8")
                || segundoNombre.contains("9") || segundoNombre.contains("0")) {
            JOptionPane.showMessageDialog(null, "El segundo nombre no debe contener números. Ingréselo de nuevo");
            segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente:");
        }

        String resultado = segundoNombre.replace(',', '.');
        
        return resultado;
        
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
                    miscelaneos.mensajeErrorValorFueraRango();
                }
            }catch(Exception e) {
                miscelaneos.mensajeErrorValorNuloONoNumerico();
            }
            
        }
        
        return result;
        
    }

    public char generoLimpio() {
        
        char genero = 'F';
        boolean done = true;
        int opcion;
        
        while(done){
            
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente al género de la persona:"
                                                                    + "\n1. Femenino"
                                                                    + "\n2. Masculino"
                                                                    + "\n3. Otro"));
                if(opcion > 0 && opcion < 4) {
                    switch (opcion) {
                        case 1:
                            genero = 'F';
                            break;
                        case 2:
                            genero = 'M';
                            break;
                        case 3:
                            genero = 'O';
                            break;
                    }
                    done = false;
                }else{
                    miscelaneos.mensajeErrorValorFueraRango();
                }
                
            }catch(Exception e) {
                miscelaneos.mensajeErrorValorNuloONoNumerico();
            }
            
        }
        
        return genero;
        
    }

    public String ciudadLimpio() {
        
        String var = JOptionPane.showInputDialog("Ingrese la ciudad del usuario");
        String resultado = var.replace(',', '.');
        
        return resultado;
        
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
                    miscelaneos.mensajeErrorValorFueraRango();
                }
                
            }catch(Exception e) {
                miscelaneos.mensajeErrorValorNuloONoNumerico();
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
        
        String resultado = correoElectronico.replace(',', '.');
        
        return resultado;
        
    }

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

        String resultado = director.replace(',', '.');
        
        return resultado;
        
    }
    
    public void imprimirDatosPelicula(String [] informacionPelicula) {
        
        if(informacionPelicula != null){
                
            for (int i = 0; i < informacionPelicula.length; i++) {

                switch(i) {
                    case 7:
                        if(informacionPelicula[i].equals("true")) {
                            System.out.println(datosDB[i] + "Disponible");
                        }else{
                            System.out.println(datosDB[i] + "No disponible");
                        }
                        break;
                    default:
                        System.out.println(datosDB[i] + informacionPelicula[i]);
                }
                
            }
                
        }else{
            
            JOptionPane.showMessageDialog(null, "No existe pelicula con ese ID", "Error: Busqueda Pelicula", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
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
                    case 5:
                        if(informacionUsuario[i].equals("F")) {
                            System.out.println(datosDBUsuario[i] + "Femenino");
                        }else{
                            if(informacionUsuario[i].equals("M")) {
                                System.out.println(datosDBUsuario[i] + "Masculino");
                            }else{
                                System.out.println(datosDBUsuario[i] + "Otro");
                            }
                        }
                        break;
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

                miscelaneos.mensajeErrorValorNuloONoNumerico();

            }

        }while(done);

        return result;
        
    }

    public String nombrePeliculaLimpio() {
        
        String var = JOptionPane.showInputDialog("Ingrese nombre de pelicula");
        String resultado = var.replace(',', '.');
        return resultado;
        
    }
    
    public String descripcionPeliculaLimpio() {
        
        String var = JOptionPane.showInputDialog("Ingrese descripcion de pelicula");
        String resultado = var.replace(',', '.');
        return resultado;
        
    }
    
    public int anioLimpio() {

        // Variables
        boolean done = false;
        int result = 0;
        String anioPelicula;

        do {
            
            anioPelicula = JOptionPane.showInputDialog("Ingrese el anio de pelicula (sin espacios ni guiones):");
            
            try {
                
                if(anioPelicula.length() == 4) {
                    result = Integer.parseInt(anioPelicula);
                    done = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Anio debe ser 4 digitos unicamente.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debe ingresar numeros unicamente.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (!done);
        
        return result;

    }

    public String nombreDirectorPeliculaLimpio() {

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre director de pelicula: ");

        while (nombre.contains("1") || nombre.contains("2")
                || nombre.contains("3") || nombre.contains("4")
                || nombre.contains("5") || nombre.contains("6")
                || nombre.contains("7") || nombre.contains("8")
                || nombre.contains("9") || nombre.contains("0")) {
            JOptionPane.showMessageDialog(null, "El nombre no debe contener números. Ingréselo de nuevo");
            nombre = JOptionPane.showInputDialog("Ingrese el nombre director de pelicula: ");
        }

        String resultado = nombre.replace(',', '.');
        
        return resultado;

    }

    public String tipoDiscoPeliculaLimpio() {

        int opc = 0;
        boolean done = true;
        String result = "";
        
        while(done) {
            
            try{
                opc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de disco de pelicula:"
                + "\n 1. DVD"
                + "\n 2. Blu-ray DISK"
                + "\n 4. Otro"));
                
                if(opc > 0 && opc < 4){
                    
                    switch(opc) {
                        case 1:
                            result = "DVD";
                            break;
                        case 2:
                            result = "Blu-ray DISK";
                            break;
                        case 3:
                            result = "Otro";
                            break;
                    }
                    
                    done = false;
                    
                }else{
                    
                    miscelaneos.mensajeErrorValorFueraRango();
                    
                }
            }catch(Exception e) {
                
                miscelaneos.mensajeErrorValorNuloONoNumerico();
                
            }
            
        }
        
        return result;
        
    }
    
    public boolean estadoClienteLimpio() {
            
        boolean result = true;
        int opc;
        boolean done = true;
        
        do{

            try{

                opc = Integer.parseInt(JOptionPane.showInputDialog("Elija el estado de cliente"
                                                                    + "\n1. Activo"
                                                                    + "\n2. Desactivado"));

                switch(opc) {
                    case 1:
                        result = true;
                        done = false;
                        break;
                    case 2:
                        result = false;
                        done = false;
                        break;
                }

            }catch(Exception e) {

                miscelaneos.mensajeErrorValorNuloONoNumerico();

            }

        }while(done);
        
        return result;
        
    }
    
    public boolean tienePeliculasRentada() {
            
        boolean result = true;
        int opc;
        boolean done = true;
        
        do{

            try{

                opc = Integer.parseInt(JOptionPane.showInputDialog("Cliente tiene peliculas rentadas"
                                                                    + "\n1. Si"
                                                                    + "\n2. No"));

                switch(opc) {
                    case 1:
                        result = true;
                        done = false;
                        break;
                    case 2:
                        result = false;
                        done = false;
                        break;
                }

            }catch(Exception e) {

                miscelaneos.mensajeErrorValorNuloONoNumerico();

            }

        }while(done);
        
        return result;
        
    }
    
    public boolean estadoPelicula() {
            
        boolean result = true;
        int opc;
        boolean done = true;
        
        do{

            try{

                opc = Integer.parseInt(JOptionPane.showInputDialog("Pelicula esta rentada?"
                                                                    + "\n1. Si"
                                                                    + "\n2. No"));

                switch(opc) {
                    case 1:
                        result = true;
                        done = false;
                        break;
                    case 2:
                        result = false;
                        done = false;
                        break;
                }

            }catch(Exception e) {

                miscelaneos.mensajeErrorValorNuloONoNumerico();

            }

        }while(done);
        
        return result;
        
    }
    
    public String [] editorCliente(String [] informacionCliente) {
        
        String [] result = informacionCliente;
        boolean done = true;
        
        do{
            
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Que informacion desea modificar"
                                                + "\n1. Apellido"
                                                + "\n2. Nombre"
                                                + "\n3. Segundo Nombre"
                                                + "\n4. Telefono Primario"
                                                + "\n5. Genero"
                                                + "\n6. Direccion 1"
                                                + "\n7. Direccion 2"
                                                + "\n8. Ciudad"
                                                + "\n9. Provincia"
                                                + "\n10. Tipo Telefono"
                                                + "\n11. Correo Electronico"
                                                + "\n12. Estado Cliente"
                                                + "\n13. Peliculas Rentadas"
                                                + "\n14. Terminar Edicion"));
            
            switch(opc) {
                case 1:
                    miscelaneos.valorAnterior(result[1]);
                    result[1] = apellidoUsuarioLimpio();
                    break;
                case 2:
                    miscelaneos.valorAnterior(result[2]);
                    result[2] = nombreUsuarioLimpio();
                    break;
                case 3:
                    miscelaneos.valorAnterior(result[3]);
                    result[2] = segundoNombreUsuarioLimpio();
                    break;
                case 4:
                    miscelaneos.valorAnterior(result[4]);
                    result[4] = String.valueOf(telefonoLimpio());
                    break;
                case 5:
                    miscelaneos.valorAnterior(result[5]);
                    result[5] = String.valueOf(generoLimpio());
                    break;
                case 6:
                    miscelaneos.valorAnterior(result[6]);
                    result[6] = direccion1UsuarioLimpio();
                    break;
                case 7:
                    miscelaneos.valorAnterior(result[7]);
                    result[7] = direccion2UsuarioLimpio();
                    break;
                case 8:
                    miscelaneos.valorAnterior(result[8]);
                    result[8] = ciudadLimpio();
                    break;
                case 9:
                    miscelaneos.valorAnterior(result[9]);
                    result[9] = provinciaLimpio();
                    break;
                case 10:
                    miscelaneos.valorAnterior(result[10]);
                    result[10] = tipoTelefonoLimpio();
                    break;
                case 11:
                    miscelaneos.valorAnterior(result[11]);
                    result[10] = correoElectronico();
                    break;
                case 12:
                    if(result[12].equals("true")){
                        miscelaneos.valorAnterior("Activo");
                    }else{
                        miscelaneos.valorAnterior("Desactivado");
                    }
                    result[12] = String.valueOf(estadoClienteLimpio());
                    break;
                case 13:
                    if(result[13].equals("true")){
                        miscelaneos.valorAnterior("Si");
                    }else{
                        miscelaneos.valorAnterior("No");
                    }
                    result[13] = String.valueOf(tienePeliculasRentada());
                    break;
                case 14:
                    done = false;
                    break;    
            }

        }while(done);

        return result;
        
    }
    
    public String [] editorPelicula(String [] informacionPelicula) {
        
        String [] result = informacionPelicula;
        boolean done = true;
        
        do{
            
            int opc = Integer.parseInt(JOptionPane.showInputDialog("Que informacion desea modificar"
                                                + "\n1. Nombre"
                                                + "\n2. Anio"
                                                + "\n3. Descripcion"
                                                + "\n4. Director"
                                                + "\n5. Genero de pelicula"
                                                + "\n6. Tipo de disco"
                                                + "\n7. Estado de Pelicula"
                                                + "\n8. Terminar Edicion"));
            
            switch(opc) {
                case 1:
                    miscelaneos.valorAnterior(result[1]);
                    result[1] = nombrePeliculaLimpio();
                    break;
                case 2:
                    miscelaneos.valorAnterior(result[2]);
                    result[2] = String.valueOf(anioLimpio());
                    break;
                case 3:
                    miscelaneos.valorAnterior(result[3]);
                    result[2] = descripcionPeliculaLimpio();
                    break;
                case 4:
                    miscelaneos.valorAnterior(result[4]);
                    result[4] = nombreDirectorPeliculaLimpio();
                    break;
                case 5:
                    miscelaneos.valorAnterior(result[5]);
                    result[5] = generoPelicula();
                    break;
                case 6:
                    miscelaneos.valorAnterior(result[6]);
                    result[6] = tipoDiscoPeliculaLimpio();
                    break;
                case 7:
                    if(result[7].equals("true")){
                        miscelaneos.valorAnterior("Rentada");
                    }else{
                        miscelaneos.valorAnterior("No rentada");
                    }
                    result[7] = String.valueOf(estadoPelicula());
                    break;
                case 8:
                    done = false;
                    break;    
            }

        }while(done);

        return result;
        
    }
    
}