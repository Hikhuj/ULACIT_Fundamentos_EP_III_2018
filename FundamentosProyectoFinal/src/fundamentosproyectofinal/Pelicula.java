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
public class Pelicula {

    // Se crea la clase pelìculas con los atributos necesarios tanto para poder 
    // crear peliculas nuevas mediante el método correspondiente como para poder buscarla 
    //dentro del método de consulta de películas. 
    private int idPelicula;
    private String nombrePelicula;
    private int year;
    private String director;
    private String sinopsis;
    private String generoPelicula;
    private int tipoDisco;
    private int estadoPelicula;

    //constructores:
    public Pelicula(int idPelicula, String nombrePelicula, int year, String director, String sinopsis, String generoPelicula, int tipoDisco, int estadoPelicula) {
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.year = year;
        this.director = director;
        this.sinopsis = sinopsis;
        this.generoPelicula = generoPelicula;
        this.tipoDisco = tipoDisco;
        this.estadoPelicula = estadoPelicula;
    }

 

    public Pelicula() {
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

    public void setYear() {
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
    public void setDirector() {
        
         this.director = JOptionPane.showInputDialog("Ingrese el nombre del director.");
        while (this.director.contains("1") || this.director.contains("2") 
                || this.director.contains("3")|| this.director.contains("4")
                || this.director.contains("5")|| this.director.contains("6")
                || this.director.contains("7")|| this.director.contains("8")
                || this.director.contains("9")|| this.director.contains("0")) {
             JOptionPane.showMessageDialog(null, "El nombre no debe contener números. "
                       + "Ingréselo de nuevo.");
             this.director = JOptionPane.showInputDialog("Ingrese el nombre del director.");
        }
        JOptionPane.showMessageDialog(null,"El nombre ingresado fue: " +this.director);
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis( ) {
        this.sinopsis = sinopsis;
    }

    public String getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula() {
        
         int opcion=Integer.parseInt (JOptionPane.showInputDialog("Ingrese el número correspondiente al género"
                 + " de la película: "
                + " \n 1. Comedia. \n 2. Romance \n 3. Drama. \n 4. Scifi. \n 5. Terror."
                + "\n 6. Fantasía. \n 7. Independiente."));
                switch (opcion){
                    case 1:
                        this.generoPelicula= "Comedia";
                        JOptionPane.showMessageDialog(null, "El género elegido fue: " + this.generoPelicula);
                        break;
                    case 2:
                        this.generoPelicula= "Romance";
                        JOptionPane.showMessageDialog(null, "El género elegido  fue: " + this.generoPelicula);
                        break;
                        
                        case 3:
                        this.generoPelicula= "Drama";
                        JOptionPane.showMessageDialog(null, "El género elegido fue: " + this.generoPelicula);
                        break;

                        case 4:
                        this.generoPelicula= "Scifi";
                        JOptionPane.showMessageDialog(null, "El género elegido fue: " + this.generoPelicula);
                        break;
                        
                        case 5:
                        this.generoPelicula= "Terror";
                        JOptionPane.showMessageDialog(null, "El género elegido fue: " + this.generoPelicula);
                        break;

                        case 6:
                        this.generoPelicula= "Fantasía";
                       JOptionPane.showMessageDialog(null, "El género elegido fue: " + this.generoPelicula);
                        break;

                        case 7:
                        this.generoPelicula= "Independiente";
                        JOptionPane.showMessageDialog(null, "El género elegido fue: " + this.generoPelicula);
                        break;
                
                }
    }
    
 

}
