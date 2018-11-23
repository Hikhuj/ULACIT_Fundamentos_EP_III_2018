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
        
        InteraccionConCSV interaccionCSV = new InteraccionConCSV();
        
        // Arreglo de la informacion nueva que se recolectara
        String [] informacionUsuarioNuevo = new String[14];
        
        // Usuario nuevo: Id
        int idUsuarioNuevo = interaccionCSV.setIdNuevo();
        informacionUsuarioNuevo[0] = String.valueOf(idUsuarioNuevo);
        // Usuario nuevo: Nombre
        informacionUsuarioNuevo[1] = JOptionPane.showInputDialog("Ingrese apellido de usuario nuevo");
        // Usuario nuevo: Apellido
        informacionUsuarioNuevo[2] = JOptionPane.showInputDialog("Ingrese Segundo Nombre de usuario nuevo");
        // Usuario nuevo: Segundo Nombre
        informacionUsuarioNuevo[3] = JOptionPane.showInputDialog("Ingrese nombre de usuario nuevo");
        // Usuario nuevo: numero Telefonico
        int telefonoUsuarioNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese telefono nuevo"));
        informacionUsuarioNuevo[4] = String.valueOf(telefonoUsuarioNuevo);
        informacionUsuarioNuevo[5] = JOptionPane.showInputDialog("ingrese genero");
        informacionUsuarioNuevo[6] = ;
        informacionUsuarioNuevo[7] = ;
        informacionUsuarioNuevo[8] = ;
        informacionUsuarioNuevo[9] = ;
        informacionUsuarioNuevo[10] = ;
        informacionUsuarioNuevo[11] = ;
        informacionUsuarioNuevo[12] = ;
        informacionUsuarioNuevo[13] = "true";
        informacionUsuarioNuevo[14] = "false";

        /*
            Cambiar cualquier cosa a String:
            int no = 2
            String strValue = String.valueOf( no );
        */
        
        try{
            
            generoString = JOptionPane.showInputDialog("ingrese genero");
            genero = generoString.charAt(0);
            direccion1 = JOptionPane.showInputDialog("Ingrese Direccion 1 nueva");
            direccion2 = JOptionPane.showInputDialog("Ingrese Direccion 2 nueva");
            ciudad = JOptionPane.showInputDialog("Ingrese ciudad nueva");
            provincia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese provincia nueva"));
            tipoTelefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de telefono"));
            correoElectronico = JOptionPane.showInputDialog("Ingrese correo electronico nuevo");;

        }catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo crear usuario", "Eror", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        return informacionUsuarioNuevo;
        
    }
    
    
}
