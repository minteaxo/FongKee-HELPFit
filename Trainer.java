/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mint
 */

import java.util.ArrayList;

public class Trainer extends User {
    
    private String specialty;
    private double rating;
    
    public Trainer(String username, String password, String name, 
            String email, String specialty){
    
        super(username, password, name, email);
        setSpecialty(specialty);
        setRating(0);
    }

    /**
     * @return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * @param specialty the specialty to set
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * @return the rating
     */
    public double getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(double rating) {
        this.rating = rating;
    }


}
