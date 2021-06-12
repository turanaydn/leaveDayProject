package com.yap.kredi.leaveModule.dto;

import java.util.Date;

public class LeaveDayRequestDTO2 {

    private Date startDate;

    private Date endDate;

    private Date dateApproved;

    private String leaveType;

    private String description;

    private String leaveStatus;


    public LeaveDayRequestDTO2() {
    }

    public LeaveDayRequestDTO2(Date startDate, Date endDate, Date dateApproved, String leaveType, String description, String leaveStatus) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateApproved = dateApproved;
        this.leaveType = leaveType;
        this.description = description;
        this.leaveStatus = leaveStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getDateApproved() {
        return dateApproved;
    }

    public void setDateApproved(Date dateApproved) {
        this.dateApproved = dateApproved;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLeaveStatus() {
        return leaveStatus;
    }

    public void setLeaveStatus(String leaveStatus) {
        this.leaveStatus = leaveStatus;
    }

    @Override
    public String toString() {
        return "LeaveDayRequestDTO2{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", dateApproved=" + dateApproved +
                ", leaveType='" + leaveType + '\'' +
                ", description='" + description + '\'' +
                ", leaveStatus='" + leaveStatus + '\'' +
                '}';
    }
}
