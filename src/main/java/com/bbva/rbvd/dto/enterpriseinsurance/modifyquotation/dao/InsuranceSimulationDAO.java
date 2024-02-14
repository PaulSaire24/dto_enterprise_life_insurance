package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dao;

import java.math.BigDecimal;

public class InsuranceSimulationDAO {
    private BigDecimal insuranceSimulationId;
    private String customerId;
    private String personalDocType;
    private String participantPersonalId;

    public BigDecimal getInsuranceSimulationId() {
        return insuranceSimulationId;
    }

    public void setInsuranceSimulationId(BigDecimal insuranceSimulationId) {
        this.insuranceSimulationId = insuranceSimulationId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
}
