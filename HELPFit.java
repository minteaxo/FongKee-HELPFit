
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
public class HELPFit {
    
    private ArrayList<User> user;
    private ArrayList<TrainingSession> session;
    
    public HELPFit(){
        user = new ArrayList<User>();
        session = new ArrayList<TrainingSession>();
    }
    
    public HELPFit(ArrayList<User> user, ArrayList<TrainingSession> session){
        setUser(user);
        setSession(session);
    }

    /**
     * @return the user
     */
    public ArrayList<User> getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    /**
     * @return the session
     */
    public ArrayList<TrainingSession> getSession() {
        return session;
    }

    /**
     * @param session the session to set
     */
    public void setSession(ArrayList<TrainingSession> session) {
        this.session = session;
    }
    
}
