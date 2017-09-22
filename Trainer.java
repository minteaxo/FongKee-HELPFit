/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mint
 */
public class Trainer extends User {
    
    private String specialty;
    
    public Trainer(String username, String password, String name, 
            String email, String specialty){
    
        super(username, password, name, email);
        setSpecialty(specialty);
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
    
}
