package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dao;

public class InsuranceSimulationDAO extends CommonsDAO{

    private String personalDocType;
    private String participantPersonalId;

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
