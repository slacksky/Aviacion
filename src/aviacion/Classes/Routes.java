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
public class Routes {
    private int id;
    private Airports origin;
    private Airports destiny;
    private int estimated_time;
    
    public Routes(int id, Airports origin, Airports destiny, int estimated_time) {
    this.id=id;
    this.origin=origin;
    this.destiny=destiny;
    this.estimated_time=estimated_time;

    }
//TODO make the rest of the (c)RUD
    //get methods (Read)
    
    public int getid(){
        return id;
    }
    
    public Airports getorigin(){
        return origin;
    }
    
    public Airports getdestiny(){
        return destiny;
    }
    
    public int getestimated_time(){
        return estimated_time;
    }
    //set methods (update)
    
    public void setid(int id){
        this.id=id;
    }
    
    public void setorigin(Airports origin){
        this.origin=origin;
    }
    
    public void getdestiny(Airports destiny){
        this.destiny=destiny;
    }
    
    public void getestimated_time(int estimated_time){
        this.estimated_time=estimated_time;
    }    
   
    //TODO Destroy  functions
    
}
