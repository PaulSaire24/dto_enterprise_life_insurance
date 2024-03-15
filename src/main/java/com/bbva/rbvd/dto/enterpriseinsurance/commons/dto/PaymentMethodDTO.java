package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;
import java.util.List;

public class PaymentMethodDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String paymentType;
    private String installmentFrequency;
    private List<RelatedContractsDTO> relatedContracts;

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getInstallmentFrequency() {
        return installmentFrequency;
    }

    public void setInstallmentFrequency(String installmentFrequency) {
        this.installmentFrequency = installmentFrequency;
    }

    public List<RelatedContractsDTO> getRelatedContracts() {
        return relatedContracts;
    }

    public void setRelatedContracts(List<RelatedContractsDTO> relatedContracts) {
        this.relatedContracts = relatedContracts;
    }
    @Override
    public String toString() {
        return "PlanDTO{" +
                "paymentType='" + paymentType+ + '\''+
                ", installmentFrequency='" + installmentFrequency+ '\''+
                ", relatedContracts=" + relatedContracts +
                '}';
    }
}
