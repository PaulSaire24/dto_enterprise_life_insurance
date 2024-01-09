package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

public class ParticipantDTO extends CommonFieldsDTO{

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

    @Override
    public String toString() {
        return "ParticipantDTO{" +
                "id='" + this.getId() + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", identityDocument=" + identityDocument +
                ", participantType=" + participantType +
                '}';
    }
}
