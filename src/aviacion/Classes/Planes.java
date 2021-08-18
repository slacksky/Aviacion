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
    public int getid(){
    return id;
    }
    
    public String getmodel(){
    return model;
    }
    
    public int getseats(){
    return seats;
    }
    
    public int getbathrooms(){
    return bathrooms;
    }
    
    public int getmax_weight(){
    return max_weight;
    }
    
    //Updated the objects
    public void setid( int id){
    this.id=id;
    }
    
    public void setmodel(String model){
    this.model=model;
    }
    
    public void setseats(int seats){
    this.seats=seats;
    }
    
    public void setbathrooms(int bathrooms){
    this.bathrooms=bathrooms;
    }
    
    public void setmax_weight(int max_weight){
    this.max_weight=max_weight;
    }
    // TODO Destroy methods
}
