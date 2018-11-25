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
     Usuario  limpiezaUsuario= new Usuario();
     Pelicula limpiezaPelicula= new Pelicula();
        
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
//        informacionUsuarioNuevo[6] = ;
//        informacionUsuarioNuevo[7] = ;
//        informacionUsuarioNuevo[8] = ;
//        informacionUsuarioNuevo[9] = ;
//        informacionUsuarioNuevo[10] = ;
//        informacionUsuarioNuevo[11] = ;
//        informacionUsuarioNuevo[12] = ;
//        informacionUsuarioNuevo[13] = "true";
        informacionUsuarioNuevo[14] = "false";

        /*
            Cambiar cualquier cosa a String:
            int no = 2
            String strValue = String.valueOf( no );
        */
        
        try{
            
//            generoString = JOptionPane.showInputDialog("ingrese genero");
//            genero = generoString.charAt(0);
//            direccion1 = JOptionPane.showInputDialog("Ingrese Direccion 1 nueva");
//            direccion2 = JOptionPane.showInputDialog("Ingrese Direccion 2 nueva");
//            ciudad = JOptionPane.showInputDialog("Ingrese ciudad nueva");
//            provincia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese provincia nueva"));
//            tipoTelefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tipo de telefono"));
//            correoElectronico = JOptionPane.showInputDialog("Ingrese correo electronico nuevo");;

        }catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo crear usuario", "Eror", JOptionPane.ERROR_MESSAGE);
            
        }
        
        
        return informacionUsuarioNuevo;
        
    }
    
    /*
    /*  METODOS INTECCION 
    */
    
    //métodos para limpiar y atrapar errores en el código
    
     public String nombreUsuarioLimpio () 
     //se utiliza if String contains para evitar que el bibliotecólogo ingrese un dato tipo
    //string con números. Se usa así pues al ingresar un número como tal Java no va a dar una
    //excepcion pues acepta el número como un string, pero esto puede más adelante causar problemas
    //porque si se quiere buscar a una persona por ejemplo usando el nombre y el dato contiene un número
    // que se ingresó por error, no se va a poder encontrar a esa persona.
   {
    String nombre= JOptionPane.showInputDialog("Ingrese el primer nombre del cliente");
    while (nombre.contains("1") || nombre.contains("2") 
                || nombre.contains("3")|| nombre.contains("4")
                || nombre.contains("5")|| nombre.contains("6")
                || nombre.contains("7")|| nombre.contains("8")
                || nombre.contains("9")|| nombre.contains("0")) {
                JOptionPane.showMessageDialog(null, "El nombre no debe contener números. "
                        + "Ingréselo de nuevo");
               nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        }
       limpiezaUsuario.setNombre(nombre);
      JOptionPane.showMessageDialog(null, "El nombre ingresado fue: " + nombre);
      return nombre;
     }

}

