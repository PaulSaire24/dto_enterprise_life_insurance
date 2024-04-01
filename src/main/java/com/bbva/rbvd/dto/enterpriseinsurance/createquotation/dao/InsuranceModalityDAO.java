package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.dao;

public class InsuranceModalityDAO {
    private String insuranceCompanyModalityId;
    private String insuranceModalityType;
    private String insuranceModalityName;

    public String getInsuranceCompanyModalityId() {
        return insuranceCompanyModalityId;
    }

    public void setInsuranceCompanyModalityId(String insuranceCompanyModalityId) {
        this.insuranceCompanyModalityId = insuranceCompanyModalityId;
    }

    public String getInsuranceModalityType() {
        return insuranceModalityType;
    }

    public void setInsuranceModalityType(String insuranceModalityType) {
        this.insuranceModalityType = insuranceModalityType;
    }

    public String getInsuranceModalityName() {
        return insuranceModalityName;
    }

    public void setInsuranceModalityName(String insuranceModalityName) {
        this.insuranceModalityName = insuranceModalityName;
    }
}
