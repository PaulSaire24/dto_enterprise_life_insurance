package com.bbva.rbvd.dto.enterpriseinsurance.commons;

public class DocumentTypeDTO extends CommonFieldsDTO {
    @Override
    public String toString() {
        return "DocumentTypeDTO{" +
                "id='" + this.getId()+ + '\''+
                ", description='" + this.getDescription()+ '\''+
                "}";
    }
}
