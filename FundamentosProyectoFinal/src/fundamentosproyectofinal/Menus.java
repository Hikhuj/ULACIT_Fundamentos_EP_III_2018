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
    
    
    /*      METODOS     */
    
    public void inicializador() {
        
        miscelaneos.saludoInicial();
        menuPrincipal();
        
    }
    
    
    
    /*      MENU PRINCIPAL      */
    
    // Opciones: Menu principal
    public String opcionesMenuPrincipal() {
        
        String resultado = "Menu Principal:"
                            + "\n1. Menu de Usuarios"
                            + "\n2. Menu de Peliculas"
                            + "\n3. Consultar informacion"
                            + "\n4. Salir";
                
        return resultado;
                
    }

    // Menu Principal
    public void menuPrincipal() {
        
        /*
            Opciones de menu
            1. Menu de Usuarios
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
                        subMenuUsuarios();
                        break;
                    case 2:
                        subMenuPeliculas();
                        break;
                    case 3:
                        subMenuConsultar();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error", JOptionPane.ERROR_MESSAGE);                
            
            }
            
        }while(opc != 4);
        
        System.exit(0);
        
    }
    
    
    
    /*      MENU: 1.1 MENUS DE USUARIOS     */
    
    // Opociones: Menu 1.1
    public String opcionesSubMenuUsuarios() {
        
        String resultado = "Menu de peliculas:"
                            + "\n1. Ingresar nuevo Usuario"
                            + "\n2. Editar informacion de Usuario (Pendiente)"
                            + "\n3. Volver al menu principal";
                
        return resultado;
        
    }
    
    // Menu 1.1 Menu de usuarios
    public void subMenuUsuarios() {
        
        /*
            Menu de peliculas:
            1. Ingresar nuevo Usuario
            2. Editar informacion de Usuario
            3. Volver al menu principal
        */
        

        int opc = 0;
        
        do{
            
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(opcionesSubMenuUsuarios()));
                
                switch(opc) {
                    case 1:
                        menuPrincipal();
                        break;
                    case 2:
                        registrarCliente();
                        menuPrincipal();
                        break;
                    case 3:
                        menuPrincipal();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
                        
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error: Menu Principal", JOptionPane.ERROR_MESSAGE);                
            
            }
            
        }while(opc != 4);
        
    }

    // Registrar un cliente nuevo
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
    
    
    
    /*      MENU: 1.2 MENU DE PELICULAS     */
    
    // Opciones: Menu 1.2
    public String opcionesSubMenuPeliculas() {
        
        String resultado = "Menu de peliculas:"
                            + "\n1. Ingresar nueva pelicula"
                            + "\n2. Editar informacion de pelicula (pendiente)"
                            + "\n3. Volver al menu principal";
                
        return resultado;
        
    }
    
    // Menu 1.2 Menu de peliculas
    public void subMenuPeliculas() {
        
        /*
            Menu de peliculas:
            1. Ingresar nueva pelicula
            2. Editar informacion de pelicula
            3. Volver al menu principal
        */
        

        int opc = 0;
        
        do{
            
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(opcionesSubMenuPeliculas()));
                
                switch(opc) {
                    case 1:
                        menuPrincipal();
                        break;
                    case 2:
                        menuPrincipal();
                        break;
                    case 3:
                        menuPrincipal();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
                        
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error", JOptionPane.ERROR_MESSAGE);                
            
            }
            
        }while(opc != 4);
        
    }
  
    // Registrar un cliente nuevo
    public void registrarPelicula() {
        
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
    
    
    /*      MENU: 1.3 CONSULTAR INFORMACION     */
    
    // Opciones: Menu 1.3
    public String opcionesSubMenuConsultar() {
        
        String resultado = "Menu de peliculas:"
                            + "\n1. Consultar informacion de usuarios"
                            + "\n2. Consultar informacion de peliculas"
                            + "\n3. Volver al menu principal";
                
        return resultado;
        
    }
    
    // Menu 1.3 Menu de consultas
    public void subMenuConsultar() {
        
        /*
            Menu de peliculas:
            1. Buscar Usuario
            2. Buscar Pelicula
            3. Volver al menu principal
        */
        

        int opc = 0;
        
        do{
            
            try{
                
                opc = Integer.parseInt(JOptionPane.showInputDialog(opcionesSubMenuConsultar()));
                
                switch(opc) {
                    case 1:
                        buscarUsuario();
                        menuPrincipal();
                        break;
                    case 2:
                        buscarPelicula();
                        menuPrincipal();
                        break;
                    case 3:
                        menuPrincipal();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error", JOptionPane.ERROR_MESSAGE);                
            
            }
            
        }while(opc != 3);
        
    }
    
    // Metodo para buscar una pelicula especifica por medio de id
    public void buscarUsuario() {

        miscelaneos.saludoBuscarUsuario();

        int idBuscar;

        try {

            idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el ID del usuario"));

            interaccion.imprimirDatosUsuario(interaccionCSV.buscarUsuario(String.valueOf(idBuscar)));

        }catch(HeadlessException | NumberFormatException error2){

            JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error: Menu Principal", JOptionPane.ERROR_MESSAGE);

        }

    }
    
    // Metodo para buscar una pelicula especifica por medio de id
    public void buscarPelicula() {
        
        miscelaneos.saludoBuscarPelicula();
        
        int idBuscar;
        // String [] informacionUsuario;
        
        try {
            
            idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el ID de la pelicula"));
   
            interaccion.imprimirDatosPelicula(interaccionCSV.buscarPelicula(String.valueOf(idBuscar)));
            
        }catch(HeadlessException | NumberFormatException error2){
        
            JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error: Menu Principal", JOptionPane.ERROR_MESSAGE);
            
        }
        
    }
    
}
