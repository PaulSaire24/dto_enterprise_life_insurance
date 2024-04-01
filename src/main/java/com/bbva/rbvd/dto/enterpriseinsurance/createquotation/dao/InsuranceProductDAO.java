package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.dao;

import java.math.BigDecimal;

public class InsuranceProductDAO {
    private BigDecimal insuranceProductId;
    private String productShortDesc;


    public BigDecimal getInsuranceProductId() {
        return insuranceProductId;
    }

    public void setInsuranceProductId(BigDecimal insuranceProductId) {
        this.insuranceProductId = insuranceProductId;
    }

    public String getProductShortDesc() {
        return productShortDesc;
    }

    public void setProductShortDesc(String productShortDesc) {
        this.productShortDesc = productShortDesc;
    }

}
