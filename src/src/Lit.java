/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

public class Lit {
    //public int key;
    private int type;  // {"Soins intensifs", "Soins paliatifs", "Traumatologie", "Autre"}
    private boolean libre = true;
    private Patient patient;
    
    public Lit(int type){ //int type
        this.type = type;
    }
    
    public int gettype(){
    	return type;
    }
    
    public boolean getlibre(){
        return libre;
    }
    
    public Patient getpatient(){
        return patient;
    }
    
    public void addPatient(Patient patient){
        if (libre == true){ // deja verif au dessus
            this.patient = patient;
            libre = false;
        } else {
            // print "occupé"
        }
    }
}
