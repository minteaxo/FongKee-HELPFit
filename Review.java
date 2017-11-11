
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
public class Review {
    private LocalTime timeStamp;
    private int rating;
    private String comment;
    private Member member;
    
    public Review(LocalTime timeStamp, int rating, String comment, Member member){
        setTimeStamp(timeStamp);
        setRating(rating);
        setComment(comment);
        setMember(member);
    }

    /**
     * @return the timeStamp
     */
    public LocalTime getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(LocalTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the member
     */
    public Member getMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(Member member) {
        this.member = member;
    }
}
