package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

public class CoverageTypeDTO extends DescriptionDTO{

    @Override
    public String toString() {
        return "CoverageTypeDTO{" +
                "id='" + this.getId()+ + '\''+
                ", name='" + this.getName()+ '\''+
                "}";
    }
}
