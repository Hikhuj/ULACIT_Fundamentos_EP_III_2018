/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *
 */
public class Peliculas {

    // Se crea la clase pelìculas con los atributos necesarios tanto para poder 
    // crear peliculas nuevas mediante el método correspondiente como para poder buscarla 
    //dentro del método de consulta de películas. 
    private String nombrePelicula;
    private int idPelicula;
    private int year;
    private String director;
    private String sinopsis;
    private String generoPelicula;

    public Peliculas(String nombrePelicula, int idPelicula, int year, String director, String sinopsis, String generoPelicula) {
        this.nombrePelicula = nombrePelicula;
        this.idPelicula = idPelicula;
        this.year = year;
        this.director = director;
        this.sinopsis = sinopsis;
        this.generoPelicula = generoPelicula;
    }

    public Peliculas() {
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
        int i = 0;
        boolean done = false;
        do {
            try {
                String texto = JOptionPane.showInputDialog("Ingrese el año de la película");
                this.year = Integer.parseInt(texto);
                JOptionPane.showMessageDialog(null,"El año ingresado es: "+ this.year);
                done = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Error al ingresar el año, solo escriba números, no letras.");
            }
        } while (!done);
       
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
