package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;

public class IdentityDocumentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private DocumentTypeDTO documentType;
    private String documentNumber;

    public DocumentTypeDTO getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentTypeDTO documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public IdentityDocumentDTO(DocumentTypeDTO documentType, String documentNumber) {
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
