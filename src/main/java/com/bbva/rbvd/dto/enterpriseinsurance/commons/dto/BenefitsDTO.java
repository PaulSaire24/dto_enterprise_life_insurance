package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

public class BenefitsDTO extends DescriptionDTO{

    @Override
    public String toString() {
        return "BenefitsDTO{" +
                "id='" + this.getId()+ + '\''+
                ", name='" + this.getName()+ '\''+
                ", description='" + this.getDescription()+ '\''+
                "}";
    }


}
