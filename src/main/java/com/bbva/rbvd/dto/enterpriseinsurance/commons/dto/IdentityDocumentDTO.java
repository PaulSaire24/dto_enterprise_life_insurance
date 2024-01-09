package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;

public class IdentityDocumentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private DescriptionDTO documentType;
    private String documentNumber;

    public DescriptionDTO getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DescriptionDTO documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public IdentityDocumentDTO(DescriptionDTO documentType, String documentNumber) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
    }

    public IdentityDocumentDTO() { }


    @Override
    public String toString() {
        return "IdentityDocumentDTO{" +
                "documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                '}';
    }
}
