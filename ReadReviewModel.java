
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mint
 */
public class ReadReviewModel extends AbstractTableModel {
    
    private TrainingSession session;
    
    public ReadReviewModel(TrainingSession session){
        this.session = session;
    }
    
    public String getColumnName(int col) {
        switch(col) {
            case 0:
                return "No";
            case 1:
                return "Member Name";
            case 2:
                return "Time Stamp";
            case 3:
                return "Rating";
            default:
                return "Comment";
        }
    }
    
    public Object getValueAt(int row, int col) {
        
        
        Review review = session.getReview().get(row);
        
        switch(col) {
            case 0:
                return row + 1;
            case 1:
                return review.getMember().getName();
            case 2:
                return review.getTimeStamp();
            case 3:
                return review.getRating();
            default:
                return review.getComment();
        }
    }

    public int getRowCount() {
        return session.getReview().size();
    }

    public int getColumnCount() {
        return 5;
    }
}
