/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hopital {
    //public int key;
	private String nom;
    private Adresse adresse; // code postal
    private ArrayList<Lit> listelit = null;
    
    public Hopital(String nom, Adresse adresse){
        this.nom = nom;
        this.adresse = adresse; 
    }
    
    public int placedispo(int type){
        int place = 0;
        for (int i = 0; i < listelit.size();i++){
            if (listelit.get(i).getlibre() == true && listelit.get(i).gettype() == type){
                place++;
            }           
        }
        return place;
    }
    
    public void addpatient(Patient patient){
        for (int i = 0; i < listelit.size();i++){
            if (listelit.get(i).getlibre() == true && listelit.get(i).gettype() == patient.gettype()){
                listelit.get(i).addPatient(patient);
                // break
            }           
        }
        
    }
}
