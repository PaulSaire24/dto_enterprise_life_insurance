package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.dao;

import java.math.BigDecimal;

public class InsrncParticipantDAO {

    private BigDecimal participantRoleId;
    private BigDecimal orderNumber;
    private String personalDocType;
    private String participantPersonalId;
    private String customerId;

    public BigDecimal getParticipantRoleId() {
        return participantRoleId;
    }

    public void setParticipantRoleId(BigDecimal participantRoleId) {
        this.participantRoleId = participantRoleId;
    }

    public BigDecimal getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(BigDecimal orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getPersonalDocType() {
        return personalDocType;
    }

    public void setPersonalDocType(String personalDocType) {
        this.personalDocType = personalDocType;
    }

    public String getParticipantPersonalId() {
        return participantPersonalId;
    }

    public void setParticipantPersonalId(String participantPersonalId) {
        this.participantPersonalId = participantPersonalId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "InsrncParticipantDAO{" +
                "participantRoleId=" + participantRoleId +
                ", orderNumber=" + orderNumber +
                ", personalDocType='" + personalDocType + '\'' +
                ", participantPersonalId='" + participantPersonalId + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
