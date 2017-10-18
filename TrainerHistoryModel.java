/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TrainerHistoryModel extends AbstractTableModel {
    private HELPFit helpfit;
    
    public TrainerHistoryModel(HELPFit helpfit) {
        setHelpfit(helpfit);
    }

    /**
     * @return the helpfit
     */
    public HELPFit getHelpfit() {
        return helpfit;
    }

    /**
     * @param helpfit the helpfit to set
     */
    public void setHelpfit(HELPFit helpfit) {
        this.helpfit = helpfit;
    }
    
    public String getColumnName(int col) {
        switch(col) {
            case 0:
                return "No";
            case 1:
                return "Session ID";
            case 2:
                return "Title";
            case 3:
                return "Date";
            case 4:
                return "Time";
            default:
                return "Type";
        }
    }
    
    public Object getValueAt(int row, int col) {
        TrainingSession trainingsession = getHelpfit().getSession().get(row);
        
        switch(col) {
            case 0:
                return row + 1;
            case 1:
                return trainingsession.getSessionID();
            case 2:
                return trainingsession.getTitle();
            case 3:
                return trainingsession.getDate();
            case 4:
                return trainingsession.getTime();
            default:
                if (trainingsession instanceof PersonalTraining)
                    return "Personal";
                else
                    return "Group";
        }
    }
    
    public int getRowCount() {
        return getHelpfit().getSession().size();
    }
    
    public int getColumnCount() {
        return 6;
    }
}
