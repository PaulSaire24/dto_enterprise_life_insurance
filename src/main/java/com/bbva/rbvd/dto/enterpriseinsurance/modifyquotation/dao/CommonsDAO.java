package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dao;

import java.math.BigDecimal;

public class CommonsDAO {
    private String insuranceCompanySimulationId;
    private BigDecimal insuranceProductId;
    private String insuranceProductType;
    private String insuranceBusinessName;
    private BigDecimal insuranceSimulationId;
    private String customerId;

    public String getInsuranceCompanySimulationId() {
        return insuranceCompanySimulationId;
    }

    public void setInsuranceCompanySimulationId(String insuranceCompanySimulationId) {
        this.insuranceCompanySimulationId = insuranceCompanySimulationId;
    }

    public BigDecimal getInsuranceProductId() {
        return insuranceProductId;
    }

    public void setInsuranceProductId(BigDecimal insuranceProductId) {
        this.insuranceProductId = insuranceProductId;
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

    public BigDecimal getInsuranceSimulationId() {
        return insuranceSimulationId;
    }

    public void setInsuranceSimulationId(BigDecimal insuranceSimulationId) {
        this.insuranceSimulationId = insuranceSimulationId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
