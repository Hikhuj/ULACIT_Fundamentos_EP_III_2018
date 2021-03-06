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
public class Miscelaneos {
      
    
    /******************************************************/
    /*                                                    */        
    /*                       MENSAJES                     */
    /*                                                    */
    /******************************************************/

    
    public void saludoInicial() {
        
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de control de video.", "Bienvenida", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void saludoBuscarPelicula() {
        
        JOptionPane.showMessageDialog(null, "Vamos a buscar pelicula por ID unicamente.", "Buscar pelicula", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void saludoBuscarUsuario() {
        
        JOptionPane.showMessageDialog(null, "Vamos a buscar usuario por ID unicamente.", "Buscar usuario", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void despedida() {
        
        System.out.println("\n");
	System.out.println("* --------------------------------------- *");
	System.out.println("|                                         |");
	System.out.println("|           Saliendo del Sistema          |");
	System.out.println("|                                         |");
	System.out.println("|              Guardando Datos            |");
	System.out.println("|                                         |");
	System.out.println("* --------------------------------------- *");
	System.out.println("\n");
        
    }
    
    public void mensajeRegistrarClienteNuevo() {
        
        System.out.println("\n");
	System.out.println("* --------------------------------------- *");
	System.out.println("|                                         |");
	System.out.println("|         REGISTRAR CLIENTE NUEVO         |");
	System.out.println("|                                         |");
	System.out.println("* --------------------------------------- *");
	System.out.println("\n");
        
    }

    public void mensajeMenuPeliculas() {
        
        System.out.println("\n");
        System.out.println("* --------------------------------------- *");
        System.out.println("|                                         |");
        System.out.println("|            MENU DE PELICULAS            |");
        System.out.println("|                                         |");
        System.out.println("* --------------------------------------- *");
        System.out.println("\n");
                
    }

    public void mensajeMenuInformacionCliente() {
        
        System.out.println("\n");
        System.out.println("* --------------------------------------- *");
        System.out.println("|                                         |");
        System.out.println("|       INFORMACION DE LOS CLIENTES       |");
        System.out.println("|                                         |");
        System.out.println("* --------------------------------------- *");
        System.out.println("\n");

    }

    public void mensajeMenuPrincipal() {
        
        System.out.println("\n");
        System.out.println("* --------------------------------------- *");
        System.out.println("|                                         |");
        System.out.println("|              MENU PRINCIPAL             |");
        System.out.println("|                                         |");
        System.out.println("* --------------------------------------- *");
        System.out.println("\n");
        
    }
    
    /*
        Mensajes de Menu 1.1
    */
    public void registroDeUsuarioNuevo(){
        JOptionPane.showMessageDialog(null, "Registrando nuevo usuario", "Usuario Nuevo", JOptionPane.INFORMATION_MESSAGE);
    }
    

    // Registro de pelicula nueva
    public void registroDePeliculaNueva(){
        JOptionPane.showMessageDialog(null, "Registrando nueva pelicula", "Pelicula Nueva", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mensajeErrorValorFueraRango() {
        
        JOptionPane.showMessageDialog(null, "Opcion fuera de rango", "Error", JOptionPane.ERROR_MESSAGE);
        
    }
    
    public void mensajeErrorValorNuloONoNumerico() {
    
        JOptionPane.showMessageDialog(null, "Ingreso o no un valor no numerico", "Error", JOptionPane.ERROR_MESSAGE);

    }

    public void saludoEditarCliente() {
        
        JOptionPane.showMessageDialog(null, "Editar informacion de un usuario", "Editar Informacion Usuario", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void saludoEditarPelicula() {
        
        JOptionPane.showMessageDialog(null, "Editar informacion de pelicula", "Editar Informacion Pelicula", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void infoUsuarioInexistente() {
        
        JOptionPane.showMessageDialog(null, "ID no registrado en sistema", "Error", JOptionPane.ERROR_MESSAGE);
        
    }
    
    public void valorAnterior(String var) {
        
        JOptionPane.showMessageDialog(null, "Valor anterior: " + var, "Valor Anterior", JOptionPane.ERROR_MESSAGE);

    }
    
    public void actualizacionExitosa(){
        
        JOptionPane.showMessageDialog(null, "Actualizacion de datos exitosa", "Actualizacion Datos", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void actualizacionSinExito(){
        
        JOptionPane.showMessageDialog(null, "Actualizacion de datos de sin exito", "Actualizacion Datos", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
