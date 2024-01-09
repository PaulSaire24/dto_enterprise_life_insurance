package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;

public class ParticipantDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    private String id;
    private String firstName;
    private String lastName;
    private String secondLastName;

    private IdentityDocumentDTO identityDocument;

    private ParticipantTypeDTO participantType;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public IdentityDocumentDTO getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(IdentityDocumentDTO identityDocument) {
        this.identityDocument = identityDocument;
    }

    public ParticipantTypeDTO getParticipantType() {
        return participantType;
    }

    public void setParticipantType(ParticipantTypeDTO participantType) {
        this.participantType = participantType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ParticipantDTO{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", identityDocument=" + identityDocument +
                ", participantType=" + participantType +
                '}';
    }
}
