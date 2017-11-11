
import java.time.LocalDate;
import java.time.LocalTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mint
 */
public class GroupTraining extends TrainingSession{
    
    private String classType;
    private int maxParticipants;
    private int numParticipants = 0;
    
    public GroupTraining(String title, LocalDate date,
            LocalTime time, double fee, String status, String classType,
            int maxParticipants){
        super(title, date, time, fee, status);
        setClassType(classType);
        setMaxParticipants(maxParticipants);
    }

    /**
     * @return the classType
     */
    public String getClassType() {
        return classType;
    }

    /**
     * @param classType the classType to set
     */
    public void setClassType(String classType) {
        this.classType = classType;
    }

    /**
     * @return the maxParticipants
     */
    public int getMaxParticipants() {
        return maxParticipants;
    }

    /**
     * @param maxParticipants the maxParticipants to set
     */
    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    /**
     * @return the numParticipants
     */
    public int getNumParticipants() {
        return numParticipants;
    }

    /**
     * @param numParticipants the numParticipants to set
     */
    public void setNumParticipants(int numParticipants) {
        this.numParticipants = numParticipants;
    }
    
}
