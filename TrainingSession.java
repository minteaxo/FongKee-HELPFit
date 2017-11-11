
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mint
 */
public abstract class TrainingSession {
    
    private static int id = 0001; 
    private String sessionID;
    private String title;
    private LocalDate date;
    private LocalTime time;
    private double fee;
    private String status;
    private Trainer user;
    private ArrayList<Review> review;
    
    public TrainingSession(String title, LocalDate date,
            LocalTime time, double fee, String status){
        
        setSessionID();
        setTitle(title);
        setDate(date);
        setTime(time);
        setFee(fee);
        setStatus(status);
        review = new ArrayList<Review>();
        
    }

    /**
     * @return the sessionID
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * @param sessionID the sessionID to set
     */
    public void setSessionID() {
        this.sessionID = "S" + id++;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(LocalTime time) {
        this.time = time;
    }

    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the user
     */
    public Trainer getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Trainer user) {
        this.user = user;
    }

    /**
     * @return the review
     */
    public ArrayList<Review> getReview() {
        return review;
    }

    /**
     * @param review the review to set
     */
    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }
    
}
