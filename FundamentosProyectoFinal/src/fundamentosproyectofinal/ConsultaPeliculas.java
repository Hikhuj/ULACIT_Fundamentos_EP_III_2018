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
public class ConsultaPeliculas {
    private String nombrePelicula;
    private int idPelicula;
    private int year;
    private String director;
    private String generoPelicula;

    public ConsultaPeliculas(String nombrePelicula, int idPelicula, int year, String director, String generoPelicula) {
        this.nombrePelicula = nombrePelicula;
        this.idPelicula = idPelicula;
        this.year = year;
        this.director = director;
        this.generoPelicula = generoPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }
    
    
}
