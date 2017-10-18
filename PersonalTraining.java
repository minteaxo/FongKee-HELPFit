
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
public class PersonalTraining extends TrainingSession{
    
    private String notes;
    
    public PersonalTraining(String title, LocalDate date,
            LocalTime time, double fee, String status, String notes){
        super(title, date, time, fee, status);
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
