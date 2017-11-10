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

public class EnrollTableModel extends AbstractTableModel {
    
    private HELPFit helpfit;
    private Member member;
    
    public TrainingSession sessionSelected(int row){
        TrainingSession trainingsession = helpfit.getSession().get(row);
        if (!member.getTrainingsession().isEmpty()){
            for (TrainingSession session: getMember().getTrainingsession()){
                if (trainingsession == session){
                    ++row;
                }
            }
        }
        for (int i=0; i==row; i++){
            if (!helpfit.getSession().get(i).getStatus().equalsIgnoreCase("Available")){
                ++row;
            }
        }
        return helpfit.getSession().get(row);
    }
    
    public EnrollTableModel(HELPFit helpfit, Member member) {
        setHelpfit(helpfit);
        setMember(member);
    }

    
    public String getColumnName(int col) {
        switch(col) {
            case 0:
                return "Session ID";
            case 1:
                return "Title";
            case 2:
                return "Date";
            case 3:
                return "Time";
            case 4:
                return "Fee";
            case 5:
                return "Type";
            default:
                return "Status";
        }
    }
    
    public Object getValueAt(int row, int col) {
        
        TrainingSession trainingsession = helpfit.getSession().get(row);
        if (!member.getTrainingsession().isEmpty()){
            for (TrainingSession session: getMember().getTrainingsession()){
                if (trainingsession == session){
                    return null;
                }
            }
        }
        if (trainingsession.getStatus().equalsIgnoreCase("Available")){
        
            switch(col) {
                case 0:
                    return trainingsession.getSessionID();
                case 1:
                    return trainingsession.getTitle();
                case 2:
                    return trainingsession.getDate();
                case 3:
                    return trainingsession.getTime();
                case 4:
                    return trainingsession.getFee();
                case 5:
                    if (trainingsession instanceof PersonalTraining)
                        return "Personal";
                    else
                        return "Group";
                default:
                    return trainingsession.getStatus();
            }
        }
        return null;
    }
    
    public void removeRow(int row){
        helpfit.getSession().remove(row);
    }
    
    public int getRowCount() {
        return getHelpfit().getSession().size();
    }
    
    public int getColumnCount() {
        return 7;
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


