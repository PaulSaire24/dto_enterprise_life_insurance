package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dao;

import java.math.BigDecimal;

public class InsuranceProductDAO {
    private BigDecimal insuranceProductId;
    private String productShortDesc;
    private String insuranceProductType;
    private String insuranceBusinessName;

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

    public String getInsuranceProductType() {
        return insuranceProductType;
    }

    public void setInsuranceProductType(String insuranceProductType) {
        this.insuranceProductType = insuranceProductType;
    }

    public String getInsuranceBusinessName() {
        return insuranceBusinessName;
    }

    public void setInsuranceBusinessName(String insuranceBusinessName) {
        this.insuranceBusinessName = insuranceBusinessName;
    }
}
