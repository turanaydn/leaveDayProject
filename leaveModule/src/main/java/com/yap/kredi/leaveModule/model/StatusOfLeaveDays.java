package com.yap.kredi.leaveModule.model;

enum StatusOfLeaveDay {

    APPROVED(1, "APPROVED", "Approved", "green"),
    PENDING_REQUEST(2, "PDN", "Pending", "yellow"),
    REJECT(3, "REJECT", "Rejected", "red");

    private final Integer statusId;

    private final String statusCode;

    private final String statusDescription;

    private final String color;


    StatusOfLeaveDay(Integer statusId, String statusCode, String statusDescription, String color) {
        this.statusId = statusId;
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
        this.color = color;
    }


    public Integer getStatusId() {
        return statusId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public String getColor() {
        return color;
    }

}
