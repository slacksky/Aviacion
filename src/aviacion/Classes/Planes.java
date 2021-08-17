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
public class Planes {
    private int id;
    private java.lang.String model;
    private int seats;
    private int bathrooms;
    private int max_weight;

    
    //Constructor Create/
    public Planes(int id, String model, int seats, int bathrooms, int max_weight){
        this.id=id;
        this.model=model;
        this.seats=seats;
        this.bathrooms=bathrooms;
        this.max_weight=max_weight;
    }
    
    
    //retuning functions "Read/SHOW"
    public int show_id(){
    return id;
    }
    
    public String show_model(){
    return model;
    }
    
    public int show_seats(){
    return seats;
    }
    
    public int show_bathrooms(){
    return bathrooms;
    }
    
    public int show_max_weight(){
    return max_weight;
    }
    
    //Updated the objects
    
}
