/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aviacion;

import aviacion.Classes.*;

import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author sky
 */
public class Aviacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList<Car> carros = new ArrayList();
        
        Planes[] aviones = {new Planes(1,"airbus 999", 90,3,3000),new Planes(2,"boeing 747", 30,1,1000)};
        Airports[] aeropuertos ={new Airports(1,"Aeropuerto Internacional Ernesto Cortissoz", "barranquilla","Colombia",74565544,10532206),new Airports(2,"Aeropuerto Internacional El Dorado", "bogota","Colombia",74084904,4420577) };
        
        
        System.out.println("pruebas");
        System.out.println(aviones[0].getmodel());
        System.out.println(aeropuertos[1].getname());
        //TODO revies if the arry works
        
        
        
    }
    
}
