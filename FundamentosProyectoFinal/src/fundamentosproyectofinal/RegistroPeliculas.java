/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Karla
 */
public class RegistroPeliculas {
    private String nombrePelicula;
    private int idPelicula;
    private int year;
    private String director;
    private String sinopsis;
    private String generoPelicula;

    public RegistroPeliculas(String nombrePelicula, int idPelicula, int year, String director, String sinopsis, String generoPelicula) {
        this.nombrePelicula = nombrePelicula;
        this.idPelicula = idPelicula;
        this.year = year;
        this.director = director;
        this.sinopsis = sinopsis;
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

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(String generoPelicula) {
        this.generoPelicula = generoPelicula;
    }
    
 

}
