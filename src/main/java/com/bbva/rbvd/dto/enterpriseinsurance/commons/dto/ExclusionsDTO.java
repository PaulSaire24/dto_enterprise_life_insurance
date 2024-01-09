package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

public class ExclusionsDTO extends DescriptionDTO{

    @Override
    public String toString() {
        return "ExclusionsDTO{" +
                "id='" + this.getId()+ + '\''+
                ", name='" + this.getName()+ '\''+
                ", description='" + this.getDescription()+ '\''+
                "}";
    }
}
