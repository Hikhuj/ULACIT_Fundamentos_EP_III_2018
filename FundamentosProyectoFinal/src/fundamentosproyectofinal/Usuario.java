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
    private String nombre;
    private String segundoNombre;
    private int telefono;
    private char genero;
    private String direccion1;
    private String direccion2;
    private String ciudad;
    private String provincia;
    private String tipoTelefono;
    private String correoElectronico;
    private boolean estadoCliente;
    private boolean peliculasRentadas;

    
    /*
        Constructores
    */

    public Usuario() {
        
    }

    public Usuario(int id, String apellido, String nombre, String segundoNombre, int telefono, char genero, String direccion1, String direccion2, String ciudad, String provincia, String tipoTelefono, String correoElectronico, boolean estadoCliente, boolean peliculasRentadas) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
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
    
    
    /*
        Metodos
    */

    public void setId(int id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
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

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setTipoTelefono(String tipoTelefono) {
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

    public String getNombre() {
        return nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
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

    public String getProvincia() {
        return provincia;
    }

    public String getTipoTelefono() {
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
    
    public String [] getUsuarioNuevo() {
        
        String [] usuarioNuevo = {String.valueOf(getId()),
                                    String.valueOf(getApellido()),
                                    String.valueOf(getNombre()),
                                    String.valueOf(getSegundoNombre()),
                                    String.valueOf(getTelefono()),
                                    String.valueOf(getGenero()),
                                    String.valueOf(getDireccion1()),
                                    String.valueOf(getDireccion2()),
                                    String.valueOf(getCiudad()),
                                    String.valueOf(getProvincia()),
                                    String.valueOf(getTipoTelefono()),
                                    String.valueOf(getCorreoElectronico()),
                                    String.valueOf(isEstadoCliente()),
                                    String.valueOf(isPeliculasRentadas())};
        
        return usuarioNuevo;
        
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", segundoNombre=" + segundoNombre + ", telefono=" + telefono + ", genero=" + genero + ", direccion1=" + direccion1 + ", direccion2=" + direccion2 + ", ciudad=" + ciudad + ", provincia=" + provincia + ", tipoTelefono=" + tipoTelefono + ", correoElectronico=" + correoElectronico + ", estadoCliente=" + estadoCliente + ", peliculasRentadas=" + peliculasRentadas + '}';
    }

    
}