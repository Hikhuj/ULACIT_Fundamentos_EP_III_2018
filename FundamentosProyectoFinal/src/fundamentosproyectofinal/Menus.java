/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Menus {
    
    /*
        INSTANCIAS
    */
    
    Miscelaneos miscelaneos = new Miscelaneos();
    Usuario usuario;
    Pelicula pelicula;
    InteraccionConCSV interaccionCSV = new InteraccionConCSV();
    Interaccion interaccion = new Interaccion();
    
    
    /*
        METODOS
    */
    
    public void inicializador() {
        
        miscelaneos.saludoInicial();
        menuPrincipal();
        
    }
    
    
    
    /*
    
        MENU PRINCIPAL
    
    */
    
    // Opciones: Menu principal
    public String opcionesMenuPrincipal() {
        
        String resultado = "Menu Principal:"
                            + "\n1. Registrar clientes nuevos"
                            + "\n2. Menu de Peliculas"
                            + "\n3. Consultar informacion"
                            + "\n4. Salir";
                
        return resultado;
                
    }

    // Menu Principal
    public void menuPrincipal() {
        
        /*
            Opciones de menu
            1. Registrar clientes nuevos
            2. Menu de Peliculas
            3. Consultar informacion
            4. Salir
        */
        
        int opc = 0;
        
        do{
            
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(opcionesMenuPrincipal()));
                
                switch(opc) {
                    case 1:
                        // Para registrar un cliente nuevo
                        registrarCliente();
                        break;
                    case 2:
                        // Menus sobre la seccion de peliculas
                        subMenuPeliculas();
                        break;
                    case 3:
                        // Funcion Pendiente
                        System.out.println("Opcion 3, salida");
                        break;
                    default:
                        System.exit(0);
                        
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error: Menu Principal", JOptionPane.ERROR_MESSAGE);                
            
            }
            
        }while(opc != 4);
        
    }
    
    
    
    /*
    
        MENU: 1.1 REGISTRAR CLIENTES NUEVOS
    
    */

    public void registrarCliente() {
        
        // Mensaje de menu
        miscelaneos.registroDeUsuarioNuevo();
        
        // Crear arreglo donde almacenar informacion de usuario
        usuario = new Usuario(interaccionCSV.setIdNuevo(),
                                interaccion.apellidoUsuarioLimpio(),
                                interaccion.nombreUsuarioLimpio(),
                                interaccion.segundoNombreUsuarioLimpio(),
                                interaccion.telefonoLimpio(),
                                interaccion.generoLimpio(),
                                interaccion.direccion1UsuarioLimpio(),
                                interaccion.direccion2UsuarioLimpio(),
                                interaccion.ciudadLimpio(),
                                interaccion.provinciaLimpio(),
                                interaccion.tipoTelefonoLimpio(),
                                interaccion.correoElectronico(),
                                true,
                                false);
                
        // Escribir usuario nuevo
        interaccionCSV.crearUsuarioNuevo(usuario.getUsuarioNuevo());
    
    }
    
    
    
    /*
    
        MENU: 1.2 MENU DE PELICULAS
    
    */
    
    // Opciones: Menu 1.2
    public String opcionesSubMenuPeliculas() {
        
        String resultado = "Menu de peliculas:"
                            + "\n1. Buscar pelicula"
                            + "\n2. Ingresar nueva pelicula"
                            + "\n3. Editar informacion de pelicula"
                            + "\n4. Volver al menu principal";
                
        return resultado;
        
    }
    
    // Menu 1.2 Menu de peliculas
    public void subMenuPeliculas() {
        
        /*
            Menu de peliculas:
            1. Buscar pelicula
            2. Ingresar nueva pelicula
            3. Editar informacion de pelicula
            4. Volver al menu principal
        */
        

        int opc = 0;
        
        do{
            
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(opcionesSubMenuPeliculas()));
                
                switch(opc) {
                    case 1:
                        buscarPelicula();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    default:
                        menuPrincipal();
                        
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error: Menu Principal", JOptionPane.ERROR_MESSAGE);                
            
            }
            
        }while(opc != 4);
        
    }
    
    // Metodo para buscar una pelicula especifica por medio de id
    public void buscarPelicula() {
        
        miscelaneos.saludoBuscarPelicula();
        
        int idBuscar;
        String [] informacionUsuario;
        
        try {
            
            idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el ID de la pelicula"));

            informacionUsuario = interaccionCSV.buscarPelicula(String.valueOf(idBuscar));
            
            if(informacionUsuario == null) {
                
                JOptionPane.showMessageDialog(null, "No existe informacion de la pelicula", "Error: Menu Buscar Peliculas", JOptionPane.ERROR_MESSAGE);
                
            }else{
            
                pelicula.toString(informacionUsuario);
            
            }
            
        }catch(HeadlessException | NumberFormatException error2){
        
            JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error: Menu Principal", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }


    
    /*
    
        MENU: 1.3 CONSULTAR INFORMACION
    
    */
    
    // Opciones: Menu 1.3
    public String opcionesSubMenuConsultar() {
        
        String resultado = "Menu de peliculas:"
                            + "\n1. Consultar informacion de usuarios"
                            + "\n2. Consultar informacion de peliculas";
                
        return resultado;
        
    }
    
    // Menu 1.3 Menu de consultas
    public void subMenuConsultar() {
        
        /*
            Menu de Consultas:
            1. Consultar informacion de usuarios
            2. Consultar informacion de peliculas
        */
        
        // Variables
        int opcionMenu = 1;
        
        while(opcionMenu > 0 && opcionMenu < 3) {
            
            try {
                
                opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(opcionesSubMenuPeliculas()));
                
                switch(opcionMenu) {
                    case 1:
                        // PENDIENTE: crear funcion
                        break;
                    case 2:
                        // PENDIENTE: crear funcion
                        break;
                    case 3:
                        // PENDIENTE: crear funcion
                        break;
                    default:
                        System.exit(1); 
                }
                
            }catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Ingreso un numero o no erroneo", "Advertencia", JOptionPane.ERROR_MESSAGE);
                subMenuConsultar();
            }
        }
        
    }
    
}
