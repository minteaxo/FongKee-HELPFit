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

public class Member extends User{

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
    
    private String level;
    private ArrayList<TrainingSession> trainingsession;
    
    public Member(String username, String password, String name, 
            String email, String level){
        
        super(username, password, name, email);
        setLevel(level);
    }

    /**
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(String level) {
        this.level = level;
    }
    
}
