package com.bbva.rbvd.dto.enterpriseinsurance.commons.dto;

import java.io.Serializable;
import java.util.List;

public class RelatedContractsDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String contractId;
    private String number;
    private DescriptionDTO numberType;
    private DescriptionDTO product;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public DescriptionDTO getNumberType() {
        return numberType;
    }

    public void setNumberType(DescriptionDTO numberType) {
        this.numberType = numberType;
    }

    public DescriptionDTO getProduct() {
        return product;
    }

    public void setProduct(DescriptionDTO product) {
        this.product = product;
    }
    @Override
    public String toString() {
        return "PlanDTO{" +
                "contractId='" + contractId+ + '\''+
                ", number='" + number+ '\''+
                ", numberType=" + numberType +
                ", product=" + product +
                '}';
    }
}
