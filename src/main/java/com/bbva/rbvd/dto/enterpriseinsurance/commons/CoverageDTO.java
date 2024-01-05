package com.bbva.rbvd.dto.enterpriseinsurance.commons;

public class CoverageDTO extends CommonFieldsDTO {
    private CoverageTypeDTO coverageType;

    public CoverageTypeDTO getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(CoverageTypeDTO coverageType) {
        this.coverageType = coverageType;
    }

    @Override
    public String toString() {
        return "CoverageDTO{" +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\''+
                ", description='"+this.getDescription()+'\''+
                ", coverageType=" + coverageType +
                '}';
    }
}
