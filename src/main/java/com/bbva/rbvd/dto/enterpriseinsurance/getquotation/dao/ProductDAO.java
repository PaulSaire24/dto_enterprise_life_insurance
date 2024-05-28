package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.dao;

import java.math.BigDecimal;

public class ProductDAO {

    private String insuranceCompanyQuotaId;
    private String productShortDesc;
    private String insuranceBusinessName;
    private BigDecimal insuranceProductId;

    public String getInsuranceCompanyQuotaId() {
        return insuranceCompanyQuotaId;
    }

    public void setInsuranceCompanyQuotaId(String insuranceCompanyQuotaId) {
        this.insuranceCompanyQuotaId = insuranceCompanyQuotaId;
    }

    public String getProductShortDesc() {
        return productShortDesc;
    }

    public void setProductShortDesc(String productShortDesc) {
        this.productShortDesc = productShortDesc;
    }

    public String getInsuranceBusinessName() {
        return insuranceBusinessName;
    }

    public void setInsuranceBusinessName(String insuranceBusinessName) {
        this.insuranceBusinessName = insuranceBusinessName;
    }

    public BigDecimal getInsuranceProductId() {
        return insuranceProductId;
    }

    public void setInsuranceProductId(BigDecimal insuranceProductId) {
        this.insuranceProductId = insuranceProductId;
    }

    @Override
    public String toString() {
        return "ProductDAO{" +
                "insuranceCompanyQuotaId='" + insuranceCompanyQuotaId + '\'' +
                ", productShortDesc='" + productShortDesc + '\'' +
                ", insuranceBusinessName='" + insuranceBusinessName + '\'' +
                ", insuranceProductId=" + insuranceProductId +
                '}';
    }
}
