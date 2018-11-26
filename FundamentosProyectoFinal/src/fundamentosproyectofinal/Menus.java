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
    
    // INSTANCIAS
    
    Miscelaneos miscelaneos = new Miscelaneos();
    Usuario usuario = new Usuario();
    InteraccionConCSV interaccionCSV = new InteraccionConCSV();
    Interaccion interaccion = new Interaccion();
    
    
    // METODOS
    
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
        
        // Variables
        int opcionMenu = 1;
        
        while(opcionMenu > 0 && opcionMenu < 4) {
            
            try {
                
                opcionMenu = Integer.parseInt(JOptionPane.showInputDialog(opcionesMenuPrincipal()));
                
                switch(opcionMenu) {
                    case 1:
                        // PENDIENTE: crear funcion
                        registrarCliente();
                        menuPrincipal();
                        break;
                    case 2:
                        // PENDIENTE: crear funcion
                        subMenuPeliculas();
                        menuPrincipal();
                        break;
                    case 3:
                        // PENDIENTE: crear funcion
                        subMenuConsultar();
                        menuPrincipal();
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
    
    
    /*     
        MENU: 1.1 REGISTAR CLIENTES NUEVOS
    */
    
    // Opciones: Menu 1.1
    public void registrarCliente() {

        
        
    }
    
    
    /*     
        MENU: 1.1 REGISTAR CLIENTES NUEVOS
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
                subMenuPeliculas();
            }
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
