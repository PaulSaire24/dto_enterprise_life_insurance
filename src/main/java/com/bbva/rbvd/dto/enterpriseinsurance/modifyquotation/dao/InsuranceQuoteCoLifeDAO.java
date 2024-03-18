package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dao;

import java.math.BigDecimal;

public class InsuranceQuoteCoLifeDAO {
    private String policyQuotaInternalId;
    private BigDecimal insuranceProductId;
    private String insuranceModalityType;
    private BigDecimal incomesPayrollAmount;
    private String currencyId;
    private int payrollEmployeeNumber;
    private String employeeEmailName;
    private int yearsOldEmployeesIndType;
    private String creationUserId;
    private String creationDate;
    private String userAuditId;
    private String auditDate;

    public String getPolicyQuotaInternalId() {
        return policyQuotaInternalId;
    }

    public void setPolicyQuotaInternalId(String policyQuotaInternalId) {
        this.policyQuotaInternalId = policyQuotaInternalId;
    }

    public BigDecimal getInsuranceProductId() {
        return insuranceProductId;
    }

    public void setInsuranceProductId(BigDecimal insuranceProductId) {
        this.insuranceProductId = insuranceProductId;
    }

    public String getInsuranceModalityType() {
        return insuranceModalityType;
    }

    public void setInsuranceModalityType(String insuranceModalityType) {
        this.insuranceModalityType = insuranceModalityType;
    }

    public BigDecimal getIncomesPayrollAmount() {
        return incomesPayrollAmount;
    }

    public void setIncomesPayrollAmount(BigDecimal incomesPayrollAmount) {
        this.incomesPayrollAmount = incomesPayrollAmount;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public int getPayrollEmployeeNumber() {
        return payrollEmployeeNumber;
    }

    public void setPayrollEmployeeNumber(int payrollEmployeeNumber) {
        this.payrollEmployeeNumber = payrollEmployeeNumber;
    }

    public String getEmployeeEmailName() {
        return employeeEmailName;
    }

    public void setEmployeeEmailName(String employeeEmailName) {
        this.employeeEmailName = employeeEmailName;
    }

    public int getYearsOldEmployeesIndType() {
        return yearsOldEmployeesIndType;
    }

    public void setYearsOldEmployeesIndType(int yearsOldEmployeesIndType) {
        this.yearsOldEmployeesIndType = yearsOldEmployeesIndType;
    }

    public String getCreationUserId() {
        return creationUserId;
    }

    public void setCreationUserId(String creationUserId) {
        this.creationUserId = creationUserId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getUserAuditId() {
        return userAuditId;
    }

    public void setUserAuditId(String userAuditId) {
        this.userAuditId = userAuditId;
    }

    public String getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(String auditDate) {
        this.auditDate = auditDate;
    }

    @Override
    public String toString() {
        return "InsuranceQuoteCoLifeDAO{" +
                "policyQuotaInternalId='" + policyQuotaInternalId + '\'' +
                ", insuranceProductId=" + insuranceProductId +
                ", insuranceModalityType='" + insuranceModalityType + '\'' +
                ", incomesPayrollAmount=" + incomesPayrollAmount +
                ", currencyId='" + currencyId + '\'' +
                ", payrollEmployeeNumber=" + payrollEmployeeNumber +
                ", employeeEmailName='" + employeeEmailName + '\'' +
                ", yearsOldEmployeesIndType=" + yearsOldEmployeesIndType +
                ", creationUserId='" + creationUserId + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", userAuditId='" + userAuditId + '\'' +
                ", auditDate='" + auditDate + '\'' +
                '}';
    }
}
