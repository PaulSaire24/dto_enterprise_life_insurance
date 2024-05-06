package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

public class CoverageDTO extends DescriptionDTO {
    private DescriptionDTO coverageType;
    private AmountDTO insuredAmount;

    public DescriptionDTO getCoverageType() {
        return coverageType;
    }

    public void setCoverageType(DescriptionDTO coverageType) {
        this.coverageType = coverageType;
    }

    public AmountDTO getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(AmountDTO insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    @Override
    public String toString() {
        return "CoverageDTO{" +
                "id='" + this.getId() + '\'' +
                ", name='" + this.getName() + '\''+
                ", description='"+this.getDescription()+'\''+
                ", coverageType=" + coverageType +
                ", insuredAmount=" + insuredAmount +
                '}';
    }
}
