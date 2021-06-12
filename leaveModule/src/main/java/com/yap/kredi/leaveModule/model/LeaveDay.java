package com.yap.kredi.leaveModule.model;

import io.swagger.annotations.ApiModel;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "leave_day")
@ApiModel(description = "All details about the LeaveDay.")
public class LeaveDay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "username")
    private String username;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date endDate;

    @Column(name = "dateapproved")
    private Date dateApproved;

    @Column(name = "description")
    private String description;

    @Column(name = "leavestatus")
    private String leaveStatus;

    @NotEmpty(message = "Please select type of leave!")
    @Column(name = "leave_type")
    private String leaveType;

    @NotEmpty(message = "Please provide a reason for the leave!")
    @Column(name = "reason")
    private String reason;

    @Column(name = "duration")
    private int duration;

    @Column(name = "accept_reject_flag")
    private boolean acceptRejectFlag;

    @Column(name = "active")
    private boolean active;

    @Column(name = "createdat")
    private Date createdAt;

    @Column(name = "updateat")
    private Date updateAt;


    public LeaveDay() {
    }

    public LeaveDay(long id, String username, String employeeName, Date startDate, Date endDate, Date dateApproved, String description, String leaveStatus, String leaveType, String reason, int duration, boolean acceptRejectFlag, boolean active, Date createdAt, Date updateAt) {
        this.id = id;
        this.username = username;
        this.employeeName = employeeName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateApproved = dateApproved;
        this.description = description;
        this.leaveStatus = leaveStatus;
        this.leaveType = leaveType;
        this.reason = reason;
        this.duration = duration;
        this.acceptRejectFlag = acceptRejectFlag;
        this.active = active;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isAcceptRejectFlag() {
        return acceptRejectFlag;
    }

    public void setAcceptRejectFlag(boolean acceptRejectFlag) {
        this.acceptRejectFlag = acceptRejectFlag;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "LeaveDay{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", dateApproved=" + dateApproved +
                ", description='" + description + '\'' +
                ", leaveStatus='" + leaveStatus + '\'' +
                ", leaveType='" + leaveType + '\'' +
                ", reason='" + reason + '\'' +
                ", duration=" + duration +
                ", acceptRejectFlag=" + acceptRejectFlag +
                ", active=" + active +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
