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
    
    public String [] registrarUsuario() {
        
        // Arreglo de la informacion nueva que se recolectara
        String [] informacionUsuarioNuevo = new String[14];
        
        informacionUsuarioNuevo[0] = "Hola";
        informacionUsuarioNuevo[1] = ;
        informacionUsuarioNuevo[2] = ;
        informacionUsuarioNuevo[3] = ;
        informacionUsuarioNuevo[4] = ;
        informacionUsuarioNuevo[5] = ;
        informacionUsuarioNuevo[6] = ;
        informacionUsuarioNuevo[7] = ;
        informacionUsuarioNuevo[8] = ;
        informacionUsuarioNuevo[9] = ;
        informacionUsuarioNuevo[10] = ;
        informacionUsuarioNuevo[11] = ;
        informacionUsuarioNuevo[12] = ;
        informacionUsuarioNuevo[13] = ;
        informacionUsuarioNuevo[14] = ;

        /*
            Cambiar cualquier cosa a String:
            int no = 2
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
            
            nuevoUsuario = {id.valueOf(id), apellido, segundoNombre, nombre, telefono, generoString, genero, direccion1, direccion2};
            
        }catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo crear usuario", "Eror", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        return vector;
        
    }
    
    
}
