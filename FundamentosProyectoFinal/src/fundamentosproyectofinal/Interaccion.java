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
    
     public void nombreUsuarioLimpio () 
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
      JOptionPane.showMessageDialog(null, "El nombre ingresado fue: " + limpiezaUsuario.getNombre());
       
      
      
     }

     public void segundoNombreUsuarioLimpio (){
     //este es un caso similar al de nombre, no se permite guardar el apellido si éste contine números
         String segundoNombre;
         segundoNombre= JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente.");
        while (segundoNombre.contains("1") ||segundoNombre.contains("2") 
                || segundoNombre.contains("3")|| segundoNombre.contains("4")
                || segundoNombre.contains("5")|| segundoNombre.contains("6")
                || segundoNombre.contains("7")|| segundoNombre.contains("8")
                || segundoNombre.contains("9")|| segundoNombre.contains("0")) {
                JOptionPane.showMessageDialog(null, "El segundo nombre no debe contener números. "
                        + "Ingréselo de nuevo");
                segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");
     }
     limpiezaUsuario.setSegundoNombre(segundoNombre);
      JOptionPane.showMessageDialog(null, "El segundo nombre ingresado fue: " + limpiezaUsuario.getSegundoNombre());
      
} 

    public void apellidoLimpio(){
        String apellido;
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente");
        while (apellido.contains("1") || apellido.contains("2") 
                || apellido.contains("3")|| apellido.contains("4")
                || apellido.contains("5")|| apellido.contains("6")
                || apellido.contains("7")|| apellido.contains("8")
                || apellido.contains("9")|| apellido.contains("0")) {
             JOptionPane.showMessageDialog(null, "El apellido no debe contener números. "
                       + "Ingréselo de nuevo.");
            apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente.");
        }
     
        limpiezaUsuario.setApellido(apellido);
        JOptionPane.showMessageDialog(null, "El apellido ingresado fue: " + limpiezaUsuario.getApellido());
}
    
    public void tele() {
         boolean done = false;
         int telefono;
        do {
            try {
                String texto = JOptionPane.showInputDialog("Ingrese el número de teléfono (sin espacios "
                        + " ni guiones)");
                telefono = Integer.parseInt(texto);
                done = true;
                limpiezaUsuario.setTelefono(telefono);
               JOptionPane.showMessageDialog(null,"El telefono ingresado es: "+ limpiezaUsuario.getTelefono());
               
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Error al ingresar el teléfono, solo escriba números, no letras.");
            }
        } while (!done); 
        
    }
    
    public void tipoTelefonoLimpio() {
        String tipoTele;
         int opcion=Integer.parseInt (JOptionPane.showInputDialog("Ingrese el"
                 + " número que representa el tipo de teléfono:"
                + " \n 1. Celular. \n2. Hogar \n 3. Oficina. \n 4. Otro."));
                switch (opcion){
                    case 1:
                        tipoTele = "Celular";
                        limpiezaUsuario.setTipoTelefono(tipoTele);
                        JOptionPane.showMessageDialog(null,"El tipo elegido fue: " + limpiezaUsuario.getTipoTelefono());
                        break;
                    case 2:
                        tipoTele = "Hogar";
                        limpiezaUsuario.setTipoTelefono(tipoTele);
                        JOptionPane.showMessageDialog(null,"El tipo elegido fue: " + limpiezaUsuario.getTipoTelefono());
                        
                        break;

                        case 3:
                        tipoTele = "Oficina";
                        limpiezaUsuario.setTipoTelefono(tipoTele);
                        JOptionPane.showMessageDialog(null,"El tipo elegido fue: " + limpiezaUsuario.getTipoTelefono());
                        break;

                        case 4:
                        tipoTele = "Otro";
                        limpiezaUsuario.setTipoTelefono(tipoTele);
                         JOptionPane.showMessageDialog(null,"El tipo elegido fue: " + limpiezaUsuario.getTipoTelefono());
                        break;
    }
    }
    
     public void generoLimpio() {
         char genero;
         int opcion=Integer.parseInt (JOptionPane.showInputDialog("Ingrese el número correspondiente"
                + " al género de la persona: \n 1. Femenino. \n2. Maculino \n 3. Otro." ));
                switch (opcion){
                    case 1:
                        genero= 'F';
                        JOptionPane.showMessageDialog(null,"El género elegido fue: femenino.");
                        limpiezaUsuario.setGenero(genero);
                        break;
                    case 2:
                        genero= 'M';
                        JOptionPane.showMessageDialog(null,"El género elegido fue: masculino.");
                        limpiezaUsuario.setGenero(genero);
                        break;
                    case 3:
                        genero= 'O';
                        JOptionPane.showMessageDialog(null,"El género elegido fue: otro.");
                        limpiezaUsuario.setGenero(genero);
                        break;
    }}
     public void provinciaLimpio() {
         String provincia;
         int opcion=Integer.parseInt (JOptionPane.showInputDialog("Ingrese el número correspondiente"
                 + " a la ciudad donde vive el cliente:"
                + " \n 1. San Jose. \n2. Alajuela \n 3. Heredia. \n 4. Cartago. \n 5. Limón."
                + "\n 6. Puntarenas. \n 7. Guanacaste"));
                switch (opcion){
                    case 1:
                        provincia= "San José";
                        limpiezaUsuario.setProvincia(provincia);
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());
                        
                        
                        break;
                    case 2:
                        provincia= "Alajuela";
                        limpiezaUsuario.setProvincia(provincia);
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());
                        
                        break;
                        
                    case 3:
                        provincia= "Heredia";
                        limpiezaUsuario.setProvincia(provincia);
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());
                        
                        break;

                    case 4:
                        provincia= "Cartago";
                        limpiezaUsuario.setProvincia(provincia);
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());
                        
                        break;
                        
                    case 5:
                        provincia= "Limón";
                        limpiezaUsuario.setProvincia(provincia);
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());
                        
                        break;

                    case 6:
                        provincia= "Puntarenas";
                        limpiezaUsuario.setProvincia(provincia);
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());
                        
                        break;

                    case 7:
                        provincia= "Guanacaste";
                        limpiezaUsuario.setProvincia(provincia);
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + limpiezaUsuario.getProvincia());
                        
                        break;
                
                }
    } 
    
     
}

