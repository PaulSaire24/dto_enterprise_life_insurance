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

    public static final class Builder {
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

        private Builder() {
        }

        public static Builder an() {
            return new Builder();
        }

        public Builder withPolicyQuotaInternalId(String policyQuotaInternalId) {
            this.policyQuotaInternalId = policyQuotaInternalId;
            return this;
        }

        public Builder withInsuranceProductId(BigDecimal insuranceProductId) {
            this.insuranceProductId = insuranceProductId;
            return this;
        }

        public Builder withInsuranceModalityType(String insuranceModalityType) {
            this.insuranceModalityType = insuranceModalityType;
            return this;
        }

        public Builder withIncomesPayrollAmount(BigDecimal incomesPayrollAmount) {
            this.incomesPayrollAmount = incomesPayrollAmount;
            return this;
        }

        public Builder withCurrencyId(String currencyId) {
            this.currencyId = currencyId;
            return this;
        }

        public Builder withPayrollEmployeeNumber(int payrollEmployeeNumber) {
            this.payrollEmployeeNumber = payrollEmployeeNumber;
            return this;
        }

        public Builder withEmployeeEmailName(String employeeEmailName) {
            this.employeeEmailName = employeeEmailName;
            return this;
        }

        public Builder withYearsOldEmployeesIndType(int yearsOldEmployeesIndType) {
            this.yearsOldEmployeesIndType = yearsOldEmployeesIndType;
            return this;
        }

        public Builder withCreationUserId(String creationUserId) {
            this.creationUserId = creationUserId;
            return this;
        }

        public Builder withCreationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder withUserAuditId(String userAuditId) {
            this.userAuditId = userAuditId;
            return this;
        }

        public Builder withAuditDate(String auditDate) {
            this.auditDate = auditDate;
            return this;
        }

        public InsuranceQuoteCoLifeDAO build() {
            InsuranceQuoteCoLifeDAO insuranceQuoteCoLifeDAO = new InsuranceQuoteCoLifeDAO();
            insuranceQuoteCoLifeDAO.setPolicyQuotaInternalId(policyQuotaInternalId);
            insuranceQuoteCoLifeDAO.setInsuranceProductId(insuranceProductId);
            insuranceQuoteCoLifeDAO.setInsuranceModalityType(insuranceModalityType);
            insuranceQuoteCoLifeDAO.setIncomesPayrollAmount(incomesPayrollAmount);
            insuranceQuoteCoLifeDAO.setCurrencyId(currencyId);
            insuranceQuoteCoLifeDAO.setPayrollEmployeeNumber(payrollEmployeeNumber);
            insuranceQuoteCoLifeDAO.setEmployeeEmailName(employeeEmailName);
            insuranceQuoteCoLifeDAO.setYearsOldEmployeesIndType(yearsOldEmployeesIndType);
            insuranceQuoteCoLifeDAO.setCreationUserId(creationUserId);
            insuranceQuoteCoLifeDAO.setCreationDate(creationDate);
            insuranceQuoteCoLifeDAO.setUserAuditId(userAuditId);
            insuranceQuoteCoLifeDAO.setAuditDate(auditDate);
            return insuranceQuoteCoLifeDAO;
        }
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
