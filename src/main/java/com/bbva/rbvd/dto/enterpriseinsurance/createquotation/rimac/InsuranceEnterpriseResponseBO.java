package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.rimac;

public class InsuranceEnterpriseResponseBO {
    private QuotationResponseBO payload;
    public InsuranceEnterpriseResponseBO() {
    }

    public QuotationResponseBO getPayload() {
        return payload;
    }

    public void setPayload(QuotationResponseBO payload) {
        this.payload = payload;
    }
}
