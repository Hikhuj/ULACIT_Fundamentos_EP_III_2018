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
public class Menus {
    
    Miscelaneos miscelaneos = new Miscelaneos();
    Usuario usuario = new Usuario();
    InteraccionConCSV interaccionCSV = new InteraccionConCSV();
    
    
    /******************************************************/
    /*                                                    */        
    /*                        MENUS                       */
    /*                                                    */
    /******************************************************/
    
    public void inicializador() {
        
        miscelaneos.saludoInicial();
        menuPrincipal();
        
    }
    
    // Opciones de menu principal
    public String opcionesMenuPrincipal() {
        
        String resultado = "Menu Principal:"
                            + "\n1. Registrar clientes nuevos"
                            + "\n2. Menu de Peliculas"
                            + "\n3. Consultar informacion"
                            + "\n4. Salir";
                
        return resultado;
                
    }

    // Menu principal
    public void menuPrincipal() {
        
        /*
        Opciones de menu
        1. Registrar clientes nuevos
	2. Menu de Peliculas
	3. Consultar informacion
	4. Salir
        */
        
        // Variables
        int opcionMenu = 1;
        
        while(opcionMenu > 0 && opcionMenu < 4) {
            
            try {
                
                opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(opcionesMenuPrincipal()));
                
                switch(opcionMenu) {
                    case 1:
                        // PENDIENTE: crear funcion
                        registrarCliente();
                        break;
                    case 2:
                        // PENDIENTE: crear funcion
                        menuDePeliculas();
                        break;
                    case 3:
                        // PENDIENTE: crear funcion
                        menuConsultar();
                        break;
                    default:
                        System.exit(1); 
                }
                
            }catch (Exception error) {
                
                JOptionPane.showMessageDialog(null, "Ingreso un numero o no erroneo", "Advertencia", JOptionPane.ERROR_MESSAGE);
                menuPrincipal();
                
            }
            
        }
        
    }
    
    // Funcion de Menu: 1.1 Registrar clientes nuevos
    public void registrarCliente() {
        
        // Variables
        String [] nuevoUsuario = new String[14];
        
        int id;
        String apellido; 
        String segundoNombre;
        String nombre;
        int telefono;
        char genero;
        String generoString;
        String direccion1;
        String direccion2;
        String ciudad;
        int provincia;
        int tipoTelefono;
        String correoElectronico;
        boolean estadoCliente;
        boolean peliculasRentadas;
        
        
        JOptionPane.showMessageDialog(null, "Registrando cliente nuevo", "Nuevo Cliente", JOptionPane.INFORMATION_MESSAGE);
        
        /*
        
        Cambiar cualquier cosa a String:
        
        int no = 2;

        String strValue = String.valueOf( no );
        
        */
        
        try{
            
            id = interaccionCSV.setIdNuevo();
            apellido = JOptionPane.showInputDialog("Ingrese apellido de usuario nuevo");
            segundoNombre = JOptionPane.showInputDialog("Ingrese Segundo Nombre de usuario nuevo");
            nombre = JOptionPane.showInputDialog("Ingrese nombre de usuario nuevo");
            telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese telefono nuevo"));
            generoString = JOptionPane.showInputDialog("ingrese genero");
            genero = generoString.charAt(0);
            direccion1 = JOptionPane.showInputDialog("Ingrese Direccion 1 nueva");
            direccion2 = JOptionPane.showInputDialog("Ingrese Direccion 2 nueva");
            ciudad = JOptionPane.showInputDialog("Ingrese ciudad nueva");
            provincia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese provincia nueva"));
            tipoTelefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de telefono"));
            correoElectronico = JOptionPane.showInputDialog("Ingrese correo electronico nuevo");;
            estadoCliente = true;
            peliculasRentadas = false;
            
            nuevoUsuario = {id, apellido, segundoNombre, nombre, telefono, generoString, genero, direccion1, direccion2};
            
        }catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo crear usuario", "Eror", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
    }
    
    public String menuDePeliculasOpciones() {
        
        String resultado = "Menu de peliculas:"
                            + "\n1. Buscar pelicula"
                            + "\n2. Ingresar nueva pelicula"
                            + "\n3. Editar informacion de pelicula"
                            + "\n4. Volver al menu principal";
                
        return resultado;
        
    }
    
    public void menuDePeliculas() {
        
        /*
        Menu de peliculas:
        1. Buscar pelicula
        2. Ingresar nueva pelicula
        3. Editar informacion de pelicula
        4. Volver al menu principal
        */
        
        // Variables
        int opcionMenu = 1;
        
        while(opcionMenu > 0 && opcionMenu < 5) {
            
            try {
                
                opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(menuDePeliculasOpciones()));
                
                switch(opcionMenu) {
                    case 1:
                        // PENDIENTE: crear funcion
                        // buscarPelicula();
                        menuPrincipal();
                        break;
                    case 2:
                        // PENDIENTE: crear funcion
                        // ingresarNuevaPelicula();
                        menuPrincipal();
                        break;
                    case 3:
                        // PENDIENTE: crear funcion
                        menuConsultar();
                        menuPrincipal();
                        break;
                    case 4:
                        menuPrincipal();
                        break;
                    default:
                        System.exit(1); 
                }
                
            }catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Ingreso un numero o no erroneo", "Advertencia", JOptionPane.ERROR_MESSAGE);
                menuDePeliculas();
            }
        }
        
    }
    
    
    
}
