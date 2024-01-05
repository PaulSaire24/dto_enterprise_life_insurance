package com.bbva.rbvd.dto.enterpriseinsurance.commons;

public class BenefitsDTO extends CommonFieldsDTO{
    @Override
    public String toString() {
        return "BenefitsDTO{" +
                "id='" + this.getId()+ + '\''+
                ", name='" + this.getName()+ '\''+
                ", description='" + this.getDescription()+ '\''+
                "}";
    }



}
