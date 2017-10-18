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
    private ArrayList<TrainingSession> trainingsession;
    
    public Trainer(String username, String password, String name, 
            String email, String specialty){
    
        super(username, password, name, email);
        setSpecialty(specialty);
        trainingsession = new ArrayList<TrainingSession>();
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
     * @return the trainingsession
     */
    public ArrayList<TrainingSession> getTrainingsession() {
        return trainingsession;
    }

    /**
     * @param trainingsession the trainingsession to set
     */
    public void setTrainingsession(ArrayList<TrainingSession> trainingsession) {
        this.trainingsession = trainingsession;
    }
    
}
