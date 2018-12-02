/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentosproyectofinal;

/**
 *
 */
public class Pelicula {

    /*
        Atributos
    */
    
    // Se crea la clase pelìculas con los atributos necesarios tanto para poder 
    // crear peliculas nuevas mediante el método correspondiente como para poder buscarla 
    //dentro del método de consulta de películas.
    
    private int idPelicula;
    private String nombrePelicula;
    private int year;
    private String sinopsis;
    private String director;
    private String generoPelicula;
    private String tipoDisco;
    private boolean estadoPelicula;
    

    /*
        Constructores
    */

    public Pelicula() {
    }
    
    public Pelicula(int idPelicula, String nombrePelicula, int year, String sinopsis, String director, String generoPelicula, String tipoDisco, boolean estadoPelicula) {
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.year = year;
        this.sinopsis = sinopsis;
        this.director = director;
        this.generoPelicula = generoPelicula;
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

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGeneroPelicula(String generoPelicula) {
        /*
            Genero manejado en Peliculas:
            1. Comedia
            2. Romance
            3. Drama
            4. Scifi
            5. Terror
            6. Fantasía
            7. Independiente
        */
        
        this.generoPelicula = generoPelicula;
    }

    public void setTipoDisco(String tipoDisco) {
        this.tipoDisco = tipoDisco;
    }

    public void setEstadoPelicula(boolean estadoPelicula) {
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

    public String getSinopsis() {
        return sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public String getTipoDisco() {
        return tipoDisco;
    }

    public boolean isEstadoPelicula() {
        return estadoPelicula;
    }

    public String [] getPeliculaNueva() {
        
        String [] peliculaNueva = {String.valueOf(getIdPelicula()),
                                    String.valueOf(getNombrePelicula()),
                                    String.valueOf(getYear()),
                                    String.valueOf(getSinopsis()),
                                    String.valueOf(getDirector()),
                                    String.valueOf(getGeneroPelicula()),
                                    String.valueOf(getTipoDisco()),
                                    String.valueOf(isEstadoPelicula())};
        
        return peliculaNueva;
        
    }
    
    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", nombrePelicula=" + nombrePelicula + ", year=" + year + ", sinopsis=" + sinopsis + ", director=" + director + ", generoPelicula=" + generoPelicula + ", tipoDisco=" + tipoDisco + ", estadoPelicula=" + estadoPelicula + '}';
    }
    
    
}
