package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.rimac;

public class InsuranceEnterpriseInputBO {
    private QuotationInputBO payload;
    public InsuranceEnterpriseInputBO() {
    }

    public QuotationInputBO getPayload() {
        return payload;
    }

    public void setPayload(QuotationInputBO payload) {
        this.payload = payload;
    }
}
