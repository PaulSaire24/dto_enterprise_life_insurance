package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.dao;

public class InsuranceQuotationDAO {
    private String policyQuotaInternalId;

    public String getPolicyQuotaInternalId() {
        return policyQuotaInternalId;
    }

    public void setPolicyQuotaInternalId(String policyQuotaInternalId) {
        this.policyQuotaInternalId = policyQuotaInternalId;
    }
    @Override
    public String toString() {
        return "ValidityPeriodDTO{" +
                "startDate=" + policyQuotaInternalId +
                '}';
    }
}
