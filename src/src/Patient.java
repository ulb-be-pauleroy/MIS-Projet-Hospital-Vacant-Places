/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;
public class Patient {
    //public int key;
    private int typebesoin;
    private Adresse adresse; // code postal
    private String nom; // + info perso (âge, sexe)
    // + Numéro national (NISS)
    
    public Patient(String nom, int typebesoin, Adresse adresse){
        this.nom = nom;
        this.typebesoin = typebesoin;
        this.adresse = adresse; 
    }
    
    public int gettype(){
        return typebesoin;
    }
    
    public Adresse getadresse(){
        return adresse;
    }    
}
