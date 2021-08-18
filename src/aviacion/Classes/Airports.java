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
    //getter methods Read
    
    public int getid(){
        return id;
    }
    
    public String getname(){
        return name;
    }
    
    public String getcity(){
        return city;
    }
    
    public String getcountry(){
        return country;
    }
    
    public int getcoord_x(){
        return coord_x;
    }
    
    public int getcoord_y(){
        return coord_y;
    }
    
    //setter methods update
    
    public void setid( int id){
        this.id=id;
    }
    
    public void setname(String name){
        this.name=name;
    }
    
    public void setcity(String city){
        this.city=city;
    }
    
    public void setcountry(String country){
        this.country=country;
    }
    
    public void setcoord_x(int coord_x){
        this.coord_x=coord_x;
    }
    
    public void setcoord_y(int coord_y){
        this.coord_y=coord_y;
    }
    //TODO Destroy methods
}
