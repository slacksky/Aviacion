/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviacion.Classes;

/**
 *
 * @author sky
 */
public class Airports {
    private int id;
    private java.lang.String name;
    private java.lang.String city;
    private java.lang.String country;
    private int coord_x;
    private int coord_y;
    
    public Airports (int id, String name, String city, String country, int coord_x, int coord_y){
        this.id=id;
        this.name=name;
        this.city=city;
        this.country=country;
        this.coord_x=coord_x;
        this.coord_y=coord_y;
    }
    //TODO make the rest of the (c)RUD
}
