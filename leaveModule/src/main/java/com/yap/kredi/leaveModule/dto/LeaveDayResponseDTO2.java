package com.yap.kredi.leaveModule.dto;

import java.util.Date;

public class LeaveDayResponseDTO2 {

    private long id;

    private Date startDate;

    private Date dateApproved;

    private String leaveType;

    private String description;

    private String leaveStatus;

    private Date createdAt;

    private Date updatedAt;

    private Integer year;


    public LeaveDayResponseDTO2() {

    }

    public LeaveDayResponseDTO2(long id, Date startDate, Date dateApproved, String leaveType, String description, String leaveStatus, Date createdAt, Date updatedAt, Integer year) {
        this.id = id;
        this.startDate = startDate;
        this.dateApproved = dateApproved;
        this.leaveType = leaveType;
        this.description = description;
        this.leaveStatus = leaveStatus;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "LeaveDayResponseDTO2{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", dateApproved=" + dateApproved +
                ", leaveType='" + leaveType + '\'' +
                ", description='" + description + '\'' +
                ", leaveStatus='" + leaveStatus + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", year=" + year +
                '}';
    }
}
