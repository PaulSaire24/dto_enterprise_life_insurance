package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

public class BankDTO extends DescriptionDTO {
    private DescriptionDTO branch;

    public DescriptionDTO getBranch() {
        return branch;
    }

    public void setBranch(DescriptionDTO branch) {
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "CoverageDTO{" +
                "id='" + this.getId() + '\'' +
                ", branch=" + branch +
                '}';
    }
}
