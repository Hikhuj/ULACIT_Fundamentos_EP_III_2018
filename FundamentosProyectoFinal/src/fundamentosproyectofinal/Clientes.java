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
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private int telefono;
    private String tipoTelefono;
    private char genero;
    private String provincia;
    private String ciudad;
    private String direccion1;
    private String direccion2;
    private String correoElectronico;
   
// constructor con todos los datos

    public Clientes(int id, String nombre, String segundoNombre, String apellido, int telefono, String tipoTelefono, char genero, String provincia, String ciudad, String direccion1, String direccion2, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.tipoTelefono = tipoTelefono;
        this.genero = genero;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
       this.nombre = JOptionPane.showInputDialog("Ingrese el primer nombre del cliente");
        while (this.nombre.contains("1") || this.nombre.contains("2") 
                || this.nombre.contains("3")|| this.nombre.contains("4")
                || this.nombre.contains("5")|| this.nombre.contains("6")
                || this.nombre.contains("7")|| this.nombre.contains("8")
                || this.nombre.contains("9")|| this.nombre.contains("0")) {
                JOptionPane.showMessageDialog(null, "El nombre no debe contener números. "
                        + "Ingréselo de nuevo");
                this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente");
        }
         JOptionPane.showMessageDialog(null, "El nombre ingresado fue: " + this.nombre);
    }  
    
    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre()  {
        //este es un caso similar al de nombre y apellido.
        this.segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente.");
        while (this.segundoNombre.contains("1") || this.segundoNombre.contains("2") 
                || this.segundoNombre.contains("3")|| this.segundoNombre.contains("4")
                || this.segundoNombre.contains("5")|| this.segundoNombre.contains("6")
                || this.segundoNombre.contains("7")|| this.segundoNombre.contains("8")
                || this.segundoNombre.contains("9")|| this.segundoNombre.contains("0")) {
                JOptionPane.showMessageDialog(null, "El segundo nombre no debe contener números. "
                        + "Ingréselo de nuevo");
                this.segundoNombre = JOptionPane.showInputDialog("Ingrese el segundo nombre del cliente");
        }
         JOptionPane.showMessageDialog(null, "El segundo nombre ingresado fue: " + this.segundoNombre);
    }

   
  public String getApellido() {
        return apellido;
    }

    public void setApellido( ) {
        //se utiliza if String contains para evitar que el bibliotecólogo ingrese un dato tipo
        //string con números. Se usa así pues al ingresar un número como tal Java no va a dar una
        //excepcion pues acepta el número como un string, pero esto puede más adelante causar problemas
        //porque si se quiere buscar a una persona por ejemplo usando el nombre y el dato contiene un número
        // que se ingresó por error, no se va a poder encontrar a esa persona.
        this.apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente");
        while (this.apellido.contains("1") || this.apellido.contains("2") 
                || this.apellido.contains("3")|| this.apellido.contains("4")
                || this.apellido.contains("5")|| this.apellido.contains("6")
                || this.apellido.contains("7")|| this.apellido.contains("8")
                || this.apellido.contains("9")|| this.apellido.contains("0")) {
             JOptionPane.showMessageDialog(null, "El apellido no debe contener números. "
                       + "Ingréselo de nuevo.");
             this.apellido = JOptionPane.showInputDialog("Ingrese el apellido del cliente.");
        }
         JOptionPane.showMessageDialog(null, "El apellido ingresado fue: " + this.apellido);
    }
    public int getTelefono() {
        
        return telefono;
    }

    public void setTelefono() {
         
        boolean done = false;
        do {
            try {
                String texto = JOptionPane.showInputDialog("Ingrese el número de teléfono (sin espacios "
                        + " ni guiones)");
                this.telefono = Integer.parseInt(texto);
                JOptionPane.showMessageDialog(null,"El telefono ingresado es: "+ this.telefono);
                done = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Error al ingresar el teléfono, solo escriba números, no letras.");
            }
        } while (!done);
    }
  public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono() {
        
         int opcion=Integer.parseInt (JOptionPane.showInputDialog("Ingrese el"
                 + " número que representa el tipo de teléfono:"
                + " \n 1. Celular. \n2. Hogar \n 3. Oficina. \n 4. Otro."));
                switch (opcion){
                    case 1:
                        this.tipoTelefono = "Celular";
                        JOptionPane.showMessageDialog(null,"El tipo elegido fue: " + this.tipoTelefono);
                        break;
                    case 2:
                        this.tipoTelefono = "Hogar";
                        JOptionPane.showMessageDialog(null,"El tipo elegido fue: " + this.tipoTelefono);
                        break;

                        case 3:
                        this.tipoTelefono = "Oficina";
                        JOptionPane.showMessageDialog(null,"El tipo elegido fue: " + this.tipoTelefono);
                        break;

                        case 4:
                        this.tipoTelefono = "Otro";
                        JOptionPane.showMessageDialog(null,"El tipo elegido fue: " + this.tipoTelefono);
                        break;
                       
                }
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero() {
        this.genero = genero;
        int opcion=Integer.parseInt (JOptionPane.showInputDialog("Ingrese el número correspondiente"
                + " al género de la persona: \n 1. Femenino. \n2. Maculino \n 3. Otro." ));
                switch (opcion){
                    case 1:
                        this.genero= 'F';
                        JOptionPane.showMessageDialog(null,"El género elegido fue: femenino.");
                        break;
                    case 2:
                        this.genero= 'M';
                        JOptionPane.showMessageDialog(null,"El género elegido fue: masculino.");
                        break;
                    case 3:
                        this.genero= 'O';
                        JOptionPane.showMessageDialog(null,"El género elegido fue: otro.");
                        break;
   }}

     public String getProvincia() {
        return provincia;
    }

    public void setProvincia() {
        
         int opcion=Integer.parseInt (JOptionPane.showInputDialog("Ingrese el número correspondiente"
                 + " a la ciudad donde vive el cliente:"
                + " \n 1. San Jose. \n2. Alajuela \n 3. Heredia. \n 4. Cartago. \n 5. Limón."
                + "\n 6. Puntarenas. \n 7. Guanacaste"));
                switch (opcion){
                    case 1:
                        this.provincia= "San José";
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + this.provincia);
                        break;
                    case 2:
                        this.provincia= "Alajuela";
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + this.provincia);
                        break;
                        
                        case 3:
                        this.provincia= "Heredia";
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + this.provincia);
                        break;

                        case 4:
                        this.provincia= "Cartago";
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + this.provincia);
                        break;
                        
                        case 5:
                        this.provincia= "Limón";
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + this.provincia);
                        break;

                        case 6:
                        this.provincia= "Puntarenas";
                       JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + this.provincia);
                        break;

                        case 7:
                        this.provincia= "Guanacaste";
                        JOptionPane.showMessageDialog(null, "La provincia elegida fue: " + this.provincia);
                        break;
                
                }
    }
    
     public String getCiudad() {
        
        
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
        
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    
}
