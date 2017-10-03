
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mint
 */
public class PersonalTraining extends TrainingSession{
    
    private String notes;
    
    public PersonalTraining(String sessionID, String title, LocalDateTime date,
            LocalDateTime time, double fee, String status, String notes){
        super(sessionID, title, date, time, fee, status);
        setNotes(notes);
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
