package com.yap.kredi.leaveModule.model;

public enum Status {

    APPROVED(1, "APPROVED", "Approved"),
    PENDING_REQUEST(2, "PDN", "Pending"),
    REJECT(3, "REJECT", "Rejected");

    private final Integer statusId;

    private final String statusCode;

    private final String statusDescription;

    Status(Integer statusId, String statusCode, String statusDescription) {
        this.statusId = statusId;
        this.statusCode = statusCode;
        this.statusDescription = statusDescription;
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
}
