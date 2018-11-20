/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

/**
 *
 * @author Karla
 */
public class Usuario {
    
    /*
        Atributos
    */
    
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
    private boolean estadoCliente;
    private boolean peliculasRentadas;

    
    /*
        Constructores
    */
    
    public Usuario() {
   
    }
    
    
    public Usuario(int id, String apellido,
                            String segundoNombre,
                            String nombre,
                            int telefono,
                            char genero,
                            String direccion1,
                            String direccion2,
                            String ciudad,
                            int provincia,
                            int tipoTelefono,
                            String correoElectronico,
                            boolean estadoCliente,
                            boolean peliculasRentadas) {
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
        this.estadoCliente = estadoCliente;
        this.peliculasRentadas = peliculasRentadas;
    }
    
    
    public Usuario(int id, String apellido,
                            String segundoNombre,
                            String nombre,
                            int telefono,
                            char genero,
                            String direccion1,
                            String direccion2,
                            String ciudad,
                            int provincia,
                            int tipoTelefono,
                            String correoElectronico) {
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
        this.estadoCliente = true;
        this.peliculasRentadas = false;
    }
    

    /*
        Metodos
    */

    public void setId(int id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public void setTipoTelefono(int tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setEstadoCliente(boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public void setPeliculasRentadas(boolean peliculasRentadas) {
        this.peliculasRentadas = peliculasRentadas;
    }
    
    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public char getGenero() {
        return genero;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getProvincia() {
        return provincia;
    }

    public int getTipoTelefono() {
        return tipoTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public boolean isEstadoCliente() {
        return estadoCliente;
    }

    public boolean isPeliculasRentadas() {
        return peliculasRentadas;
    }
    
}
