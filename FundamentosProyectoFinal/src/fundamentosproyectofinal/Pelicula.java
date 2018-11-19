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
public class Pelicula {
    
    private int idPelicula;
    private String nombrePelicula;
    private int year;
    private String descripcion;
    private String director;
    private int tipoDisco;
    private int estadoPelicula;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, String nombrePelicula, int year, String descripcion, String director, int tipoDisco, int estadoPelicula) {
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.year = year;
        this.descripcion = descripcion;
        this.director = director;
        this.tipoDisco = tipoDisco;
        this.estadoPelicula = estadoPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setTipoDisco(int tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public void setEstadoPelicula(int estadoPelicula) {
        this.estadoPelicula = estadoPelicula;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public int getYear() {
        return year;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDirector() {
        return director;
    }

    public int getTipoDisco() {
        return tipoDisco;
    }

    public int getEstadoPelicula() {
        return estadoPelicula;
    }

}
