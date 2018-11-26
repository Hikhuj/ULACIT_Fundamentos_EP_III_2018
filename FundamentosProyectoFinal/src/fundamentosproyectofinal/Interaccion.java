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
        INSTANCIAS 
    */
    Usuario limpiezaUsuario = new Usuario();
    Pelicula limpiezaPelicula = new Pelicula();

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

        do {

            try {
                telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de teléfono (sin espacios ni guiones):"));
                done = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar el teléfono, solo escriba números, no letras.");
            }

        } while (!done);
        
        return telefono;

    }

    public String direccionUsuarioLimpio() {
        
        String var = JOptionPane.showInputDialog("Ingrese la direccion 1 del usuario");
        
        return var;
        
    }
    
    public int tipoTelefonoLimpio() {

        int tipoTele = 1;
        
        while(tipoTele < 0 && tipoTele > 4) {
            try{
                tipoTele = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de teléfono:"
                + "\n 1. Celular."
                + "\n 2. Hogar "
                + "\n 3. Oficina. "
                + "\n 4. Otro."));
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Opcion no valida", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        return tipoTele;
        
    }

    public void generoLimpio() {
        char genero;
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente"
                + " al género de la persona: \n 1. Femenino. \n2. Maculino \n 3. Otro."));
        switch (opcion) {
            case 1:
                genero = 'F';
                JOptionPane.showMessageDialog(null, "El género elegido fue: femenino.");
                limpiezaUsuario.setGenero(genero);
                break;
            case 2:
                genero = 'M';
                JOptionPane.showMessageDialog(null, "El género elegido fue: masculino.");
                limpiezaUsuario.setGenero(genero);
                break;
            case 3:
                genero = 'O';
                JOptionPane.showMessageDialog(null, "El género elegido fue: otro.");
                limpiezaUsuario.setGenero(genero);
                break;
        }
    }

    public void provinciaLimpio() {
        String provincia;
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número correspondiente"
                + " a la ciudad donde vive el cliente:"
                + "\n 1. San Jose. "
                + "\n 2. Alajuela "
                + "\n 3. Heredia. "
                + "\n 4. Cartago. "
                + "\n 5. Limón."
                + "\n 6. Puntarenas. "
                + "\n 7. Guanacaste."));
        switch (opcion) {
            case 1:
                provincia = "San José";
                limpiezaUsuario.setProvincia(provincia);
                JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());

                break;
            case 2:
                provincia = "Alajuela";
                limpiezaUsuario.setProvincia(provincia);
                JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());

                break;

            case 3:
                provincia = "Heredia";
                limpiezaUsuario.setProvincia(provincia);
                JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());

                break;

            case 4:
                provincia = "Cartago";
                limpiezaUsuario.setProvincia(provincia);
                JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());

                break;

            case 5:
                provincia = "Limón";
                limpiezaUsuario.setProvincia(provincia);
                JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());

                break;

            case 6:
                provincia = "Puntarenas";
                limpiezaUsuario.setProvincia(provincia);
                JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());

                break;

            case 7:
                provincia = "Guanacaste";
                limpiezaUsuario.setProvincia(provincia);
                JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());

                break;

        }
    }

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

    public void directorLimpio() {
        String director;
        director = JOptionPane.showInputDialog("Ingrese el nombre del director.");
        while (director.contains("1") || director.contains("2")
                || director.contains("3") || director.contains("4")
                || director.contains("5") || director.contains("6")
                || director.contains("7") || director.contains("8")
                || director.contains("9") || director.contains("0")) {
            JOptionPane.showMessageDialog(null, "El nombre no debe contener números. "
                    + "Ingréselo de nuevo.");
            director = JOptionPane.showInputDialog("Ingrese el nombre del director.");
        }
        limpiezaPelicula.setDirector(director);
        JOptionPane.showMessageDialog(null, "El nombre ingresado fue: " + limpiezaPelicula.getDirector());

    }

    public void generoPelicula() {

        String generoPeli;

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
                generoPeli = "Comedia";
                limpiezaPelicula.setGeneroPelicula(generoPeli);
                JOptionPane.showMessageDialog(null, "El género elegido fue: " + limpiezaPelicula.getGeneroPelicula());
                break;
            case 2:
                generoPeli = "Romance";
                limpiezaPelicula.setGeneroPelicula(generoPeli);
                JOptionPane.showMessageDialog(null, "El género elegido fue: " + limpiezaPelicula.getGeneroPelicula());
                break;

            case 3:
                generoPeli = "Drama";
                limpiezaPelicula.setGeneroPelicula(generoPeli);
                JOptionPane.showMessageDialog(null, "El género elegido fue: " + limpiezaPelicula.getGeneroPelicula());
                break;

            case 4:
                generoPeli = "Scifi";
                limpiezaPelicula.setGeneroPelicula(generoPeli);
                JOptionPane.showMessageDialog(null, "El género elegido fue: " + limpiezaPelicula.getGeneroPelicula());
                break;

            case 5:
                generoPeli = "Terror";
                limpiezaPelicula.setGeneroPelicula(generoPeli);
                JOptionPane.showMessageDialog(null, "El género elegido fue: " + limpiezaPelicula.getGeneroPelicula());
                break;

            case 6:
                generoPeli = "Fantasía";
                limpiezaPelicula.setGeneroPelicula(generoPeli);
                JOptionPane.showMessageDialog(null, "El género elegido fue: " + limpiezaPelicula.getGeneroPelicula());
                break;

            case 7:
                generoPeli = "Independiente";
                limpiezaPelicula.setGeneroPelicula(generoPeli);
                JOptionPane.showMessageDialog(null, "El género elegido fue: " + limpiezaPelicula.getGeneroPelicula());
                break;
        }

    }

}
