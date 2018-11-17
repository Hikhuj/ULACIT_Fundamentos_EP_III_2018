/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Karla
 */
public class Clientes {
    //se crean los atributos de la clase clientes que serán usados en el método de crear cliente
    // o en el método de consultar clientes. 
    private int id;

    private String apellido;

    private String segundoNombre;

    private String nombre;

    private int telefono;

    private char genero;

    private String direccion1;

    private String direccion2;

    private String ciudad;

    private int provincia;

    private int tipoTelefono;

    private String correoElectronico;
// constructor con todos los datos
    public Clientes(int id, String apellido, String segundoNombre, String nombre, int telefono, char genero, String direccion1, String direccion2, String ciudad, int provincia, int tipoTelefono, String correoElectronico) {
        this.id = id;
        this.apellido = apellido;
        this.segundoNombre = segundoNombre;
        this.nombre = nombre;
        this.telefono = telefono;
        this.genero = genero;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.tipoTelefono = tipoTelefono;
        this.correoElectronico = correoElectronico;
    }

    public Clientes() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        //se utiliza if String contains para evitar que el bibliotecólogo ingrese un dato tipo
        //string con números. Se usa así pues al ingresar un número como tal Java no va a dar una
        //excepcion pues acepta el número como un string, pero esto puede más adelante causar problemas
        //porque si quiere buscar a una persona por ejemplo usando el nombre y el dato contiene un número
        // que se ingresó por error, no voy a poder encontrar a esa persona.
        this.apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente");
        while (this.apellido.contains("1") || this.apellido.contains("2") 
                || this.apellido.contains("3")|| this.apellido.contains("4")
                || this.apellido.contains("5")|| this.apellido.contains("6")
                || this.apellido.contains("7")|| this.apellido.contains("8")
                || this.apellido.contains("9")|| this.apellido.contains("0")) {
             JOptionPane.showMessageDialog(null, "El apellido no debe contener números. "
                       + "Ingréselo de nuevo");
             this.apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente");
//            if (this.apellido.contains("1")) {
//                JOptionPane.showMessageDialog(null, "El apellido no debe contener números. "
//                        + "Ingréselo de nuevo");
//                this.apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente");
//            }
//
//            if (this.apellido.contains("2")) {
//                JOptionPane.showMessageDialog(null, "El apellido no debe contener números. "
//                        + "Ingréselo de nuevo.");
//                this.apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente");
//            } 
//            if (this.apellido.contains("3")){
//                    JOptionPane.showMessageDialog(null,"El apellido no debe contener números. "
//                + "Ingréselo de nuevo.");
//                this.apellido= JOptionPane.showInputDialog("Ingrese el apellido del cliente");}
//          
//            if (this.apellido.contains("4")){
//             JOptionPane.showMessageDialog(null,"El apellido no debe contener números. "
//                          + "Ingréselo de nuevo.");
//                this.apellido= JOptionPane.showInputDialog("Ingrese el apellido del cliente");
//            }
//            
//            if (this.apellido.contains("5")){
//              JOptionPane.showMessageDialog(null,"El apellido no debe contener números. "
//                                    + "Ingréselo de nuevo.");
//                this.apellido= JOptionPane.showInputDialog("Ingrese el apellido del cliente");}
//            
//            if (this.apellido.contains("6")){
//                            JOptionPane.showMessageDialog(null,"El apellido no debe contener números. "
//                                    + "Ingréselo de nuevo.");
//                this.apellido= JOptionPane.showInputDialog("Ingrese el apellido del cliente");}
//            
//            if (this.apellido.contains("7")){
//                            JOptionPane.showMessageDialog(null,"El apellido no debe contener números. "
//                                    + "Ingréselo de nuevo.");
//                this.apellido= JOptionPane.showInputDialog("Ingrese el apellido del cliente");}
//            if (this.apellido.contains("8")){
//                            JOptionPane.showMessageDialog(null,"El apellido no debe contener números. "
//                                    + "Ingréselo de nuevo.");
//                this.apellido= JOptionPane.showInputDialog("Ingrese el apellido del cliente");}
//            if (this.apellido.contains("9")){
//                            JOptionPane.showMessageDialog(null,"El apellido no debe contener números. "
//                                    + "Ingréselo de nuevo.");
//                this.apellido= JOptionPane.showInputDialog("Ingrese el apellido del cliente");}
//            if (this.apellido.contains("0")){
//                            JOptionPane.showMessageDialog(null,"El apellido no debe contener números. "
//                                    + "Ingréselo de nuevo.");
//                this.apellido= JOptionPane.showInputDialog("Ingrese el apellido del cliente");}
//            else {
//                JOptionPane.showMessageDialog(null, "El apellido ingresado es: " + this.apellido);
            //}

        }
    }

    
    
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre)  {
        
        this.segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");
        while (this.segundoNombre.contains("1") || this.segundoNombre.contains("2") 
                || this.segundoNombre.contains("3")|| this.segundoNombre.contains("4")
                || this.segundoNombre.contains("5")|| this.segundoNombre.contains("6")
                || this.segundoNombre.contains("7")|| this.segundoNombre.contains("8")
                || this.segundoNombre.contains("9")|| this.segundoNombre.contains("0")) {
            if (this.segundoNombre.contains("1")) {
                JOptionPane.showMessageDialog(null, "El segundo nombre no debe contener números. "
                        + "Ingréselo de nuevo");
                this.segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");
            }

            if (this.segundoNombre.contains("2")) {
                JOptionPane.showMessageDialog(null, "El segundo nombre no debe contener números. "
                        + "Ingréselo de nuevo.");
                this.segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");
            } 
            if (this.segundoNombre.contains("3")){
                    JOptionPane.showMessageDialog(null,"El segundo nombre no debe contener números. "
                + "Ingréselo de nuevo.");
                this.segundoNombre= JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");}
          
            if (this.segundoNombre.contains("4")){
             JOptionPane.showMessageDialog(null,"El segundo nombre no debe contener números. "
                          + "Ingréselo de nuevo.");
                this.segundoNombre= JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");
            }
            
            if (this.segundoNombre.contains("5")){
              JOptionPane.showMessageDialog(null,"El segundo nombre no debe contener números. "
                                    + "Ingréselo de nuevo.");
                this.segundoNombre= JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");}
            
            if (this.segundoNombre.contains("6")){
                            JOptionPane.showMessageDialog(null,"El segundo nombre no debe contener números. "
                                    + "Ingréselo de nuevo.");
                this.segundoNombre= JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");}
            
            if (this.segundoNombre.contains("7")){
                            JOptionPane.showMessageDialog(null,"El segundo nombre no debe contener números. "
                                    + "Ingréselo de nuevo.");
                this.segundoNombre= JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");}
            if (this.segundoNombre.contains("8")){
                            JOptionPane.showMessageDialog(null,"El apellido no debe contener números. "
                                    + "Ingréselo de nuevo.");
                this.segundoNombre= JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");}
            if (this.segundoNombre.contains("9")){
                            JOptionPane.showMessageDialog(null,"El segundo nombre no debe contener números. "
                                    + "Ingréselo de nuevo.");
                this.segundoNombre= JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");}
            if (this.segundoNombre.contains("0")){
                            JOptionPane.showMessageDialog(null,"El segundo nombre no debe contener números. "
                                    + "Ingréselo de nuevo.");
                this.segundoNombre= JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");}
            else {
                JOptionPane.showMessageDialog(null, "El segundo nombre ingresado es: " + this.segundoNombre);
            }

        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        
        return telefono;
    }

    public void setTelefono(int telefono) {
          int i = 0;
        boolean done = false;
        do {
            try {
                String texto = JOptionPane.showInputDialog("Ingrese el número de teléfono");
                this.telefono = Integer.parseInt(texto);
                JOptionPane.showMessageDialog(null,"El telefono ingresado es: "+ this.telefono);
                done = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Error al ingresar el teléfono, solo escriba números, no letras.");
            }
        } while (!done);
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public int getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(int tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    
}
