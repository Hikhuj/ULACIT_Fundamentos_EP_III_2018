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
    InterfazRegistrarClientes interfazRegistrarClientes= new  InterfazRegistrarClientes();
    InterfazRegistrarPeliculaNueva InterfazRegistrarPeliculaNueva= new InterfazRegistrarPeliculaNueva();
    
    
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
                        miscelaneos.mensajeErrorValorFueraRango();
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                miscelaneos.mensajeErrorValorNuloONoNumerico();                
            
            }
            
        }while(opc != 4);
        
        System.exit(0);
        
    }
    
    
    
    /*      MENU: 1.1 MENUS DE USUARIOS     */
    
    // Opociones: Menu 1.1
    public String opcionesSubMenuUsuarios() {
        
        String resultado = "Menu de peliculas:"
                            + "\n1. Ingresar nuevo Usuario"
                            + "\n2. Editar informacion de Usuario"
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
                        registrarCliente();
                        subMenuUsuarios();
                        break;
                    case 2:
                        editarCliente();
                        subMenuUsuarios();
                        break;
                    case 3:
                        menuPrincipal();
                        break;
                    default:
                        miscelaneos.mensajeErrorValorFueraRango();
                        
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                miscelaneos.mensajeErrorValorNuloONoNumerico();               
            
            }
            
        }while(opc != 4);
        
    }

    // Registrar un cliente nuevo
    public void registrarCliente() {
        
        // Mensaje de menu
        miscelaneos.registroDeUsuarioNuevo();
        
        // Crear arreglo donde almacenar informacion de usuario
        usuario = new Usuario(interaccionCSV.setIdNuevoUsuario(),
                                interfazRegistrarClientes.apellidoUsuarioLimpio(),
                                interfazRegistrarClientes.nombreUsuarioLimpio(),
                                interfazRegistrarClientes.segundoNombreUsuarioLimpio(),
                                interfazRegistrarClientes.telefonoLimpio(),
                                interfazRegistrarClientes.generoLimpio(),
                                interfazRegistrarClientes.direccion1UsuarioLimpio(),
                                interfazRegistrarClientes.direccion2UsuarioLimpio(),
                                interfazRegistrarClientes.ciudadLimpio(),
                                interfazRegistrarClientes.provinciaLimpio(),
                                interfazRegistrarClientes.tipoTelefonoLimpio(),
                                interfazRegistrarClientes.correoElectronico(),
                                true,
                                false);
        
//        usuario = new Usuario(interaccionCSV.setIdNuevoUsuario(),
//                                interaccion.apellidoUsuarioLimpio(),
//                                interaccion.nombreUsuarioLimpio(),
//                                interaccion.segundoNombreUsuarioLimpio(),
//                                interaccion.telefonoLimpio(),
//                                interaccion.generoLimpio(),
//                                interaccion.direccion1UsuarioLimpio(),
//                                interaccion.direccion2UsuarioLimpio(),
//                                interaccion.ciudadLimpio(),
//                                interaccion.provinciaLimpio(),
//                                interaccion.tipoTelefonoLimpio(),
//                                interaccion.correoElectronico(),
//                                true,
//                                false);
                
        // Escribir usuario nuevo
        interaccionCSV.crearUsuarioNuevo(usuario.getUsuarioNuevo());
    
    }

    // Editar informacion usuario
    public void editarCliente() {
        
        miscelaneos.saludoEditarCliente();

        int idBuscar;
        
        String [] info;
        String [] infoTemp;
        boolean done;

        try {

            idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID de usuario a modificar"));

            info = interaccionCSV.buscarUsuario(String.valueOf(idBuscar));
            
            if(info != null){
            
                infoTemp = interaccion.editorCliente(info);
                
                if(interaccionCSV.actualizarDatosUsuario(infoTemp, String.valueOf(idBuscar))){
                    
                    miscelaneos.actualizacionExitosa();
                    
                }else{
                    
                    miscelaneos.actualizacionSinExito();
                    
                }
                
            }else{
                
                miscelaneos.infoUsuarioInexistente();
                
            }

        }catch(HeadlessException | NumberFormatException error2){

            miscelaneos.mensajeErrorValorNuloONoNumerico();

        }
        
    }
    
    
    /*      MENU: 1.2 MENU DE PELICULAS     */
    
    // Opciones: Menu 1.2
    public String opcionesSubMenuPeliculas() {
        
        String resultado = "Menu de peliculas:"
                            + "\n1. Ingresar nueva pelicula"
                            + "\n2. Editar informacion de pelicula"
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
                        registrarPelicula();
                        subMenuPeliculas();
                        break;
                    case 2:
                        editarPelicula();
                        subMenuPeliculas();
                        break;
                    case 3:
                        menuPrincipal();
                        break;
                    default:
                        miscelaneos.mensajeErrorValorFueraRango();
                        
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                miscelaneos.mensajeErrorValorNuloONoNumerico();               
            
            }
            
        }while(opc != 4);
        
    }
  
    // Registrar un cliente nuevo
    public void registrarPelicula() {
        
        // Mensaje de menu
        miscelaneos.registroDePeliculaNueva();
        
        // Crear arreglo donde almacenar informacion de usuario
        
        pelicula = new Pelicula(interaccionCSV.setIdNuevoPelicula(),
                                InterfazRegistrarPeliculaNueva.nombrePeliculaLimpio(),
                                InterfazRegistrarPeliculaNueva.anioLimpio(),
                                InterfazRegistrarPeliculaNueva.descripcionPeliculaLimpio(),
                                InterfazRegistrarPeliculaNueva.nombreDirectorPeliculaLimpio(),
                                InterfazRegistrarPeliculaNueva.generoPelicula(),
                                InterfazRegistrarPeliculaNueva.tipoDiscoPeliculaLimpio(),
                                InterfazRegistrarPeliculaNueva.estadoPelicula());
                
//        pelicula = new Pelicula(interaccionCSV.setIdNuevoPelicula(),
//                                interaccion.nombrePeliculaLimpio(),
//                                interaccion.anioLimpio(),
//                                interaccion.descripcionPeliculaLimpio(),
//                                interaccion.nombreDirectorPeliculaLimpio(),
//                                interaccion.generoPelicula(),
//                                interaccion.tipoDiscoPeliculaLimpio(),
//                                true);
                
        // Escribir usuario nuevo
        interaccionCSV.crearPeliculaNueva(pelicula.getPeliculaNueva());
    
    }
    
    public void editarPelicula() {
        
        miscelaneos.saludoEditarPelicula();

        int idBuscar;
        
        String [] info;
        String [] infoTemp;
        boolean done;

        try {

            idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID de pelicula a modificar"));

            info = interaccionCSV.buscarPelicula(String.valueOf(idBuscar));
            
            if(info != null){
            
                infoTemp = interaccion.editorPelicula (info);
                
                if(interaccionCSV.actualizarDatosPelicula(infoTemp, String.valueOf(idBuscar))){
                    
                    miscelaneos.actualizacionExitosa();
                    
                }else{
                    
                    miscelaneos.actualizacionSinExito();
                    
                }
                
            }else{
                
                miscelaneos.infoUsuarioInexistente();
                
            }

        }catch(HeadlessException | NumberFormatException error2){

            miscelaneos.mensajeErrorValorNuloONoNumerico();

        }
        
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
                        subMenuConsultar();
                        break;
                    case 2:
                        buscarPelicula();
                        subMenuConsultar();
                        break;
                    case 3:
                        menuPrincipal();
                        break;
                    default:
                        miscelaneos.mensajeErrorValorFueraRango();
                }
                
            }catch(HeadlessException | NumberFormatException error1) {
            
                miscelaneos.mensajeErrorValorNuloONoNumerico();               
            
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

            miscelaneos.mensajeErrorValorNuloONoNumerico();

        }

    }
    
    // Metodo para buscar una pelicula especifica por medio de id
    public void buscarPelicula() {
        
        miscelaneos.saludoBuscarPelicula();
        
        int idBuscar;

        try {
            
            idBuscar = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el ID de la pelicula"));
   
            interaccion.imprimirDatosPelicula(interaccionCSV.buscarPelicula(String.valueOf(idBuscar)));
            
        }catch(HeadlessException | NumberFormatException error2){
        
            miscelaneos.mensajeErrorValorNuloONoNumerico();
            
        }
        
    }
    
}
