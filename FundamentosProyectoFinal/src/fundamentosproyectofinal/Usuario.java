/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Usuario {
    
    
    // Lista atributos
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


    // Constructor
    public Usuario(int id, 
                    String apellido, 
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
    }
    
    
    // Metodos
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
        this.apellido = apellido;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
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
        this.telefono = telefono;
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
