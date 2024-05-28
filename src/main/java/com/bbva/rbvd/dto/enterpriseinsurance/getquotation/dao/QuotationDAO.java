package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.dao;

import java.math.BigDecimal;

public class QuotationDAO {

    private String quoteDate;
    private String insuranceModalityType;
    private String insuranceProductType;
    private String insuranceModalityName;
    private String insurModalityDesc;
    private String insuranceCompanyModalityId;
    private String userAuditId;
    private String customerId;
    private String policyQuotaStatusType;
    private String personalDocType;
    private String participantPersonalId;
    private String contactEmailDesc;
    private String customerPhoneDesc;
    private String rfqInternalId;
    private BigDecimal payrollAmount;
    private String payrollCurrencyId;
    private BigDecimal employeeNumber;
    private String employeesIndType;


    public String getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(String quoteDate) {
        this.quoteDate = quoteDate;
    }

    public String getInsuranceModalityType() {
        return insuranceModalityType;
    }

    public void setInsuranceModalityType(String insuranceModalityType) {
        this.insuranceModalityType = insuranceModalityType;
    }

    public String getInsuranceProductType() {
        return insuranceProductType;
    }

    public void setInsuranceProductType(String insuranceProductType) {
        this.insuranceProductType = insuranceProductType;
    }

    public String getInsuranceModalityName() {
        return insuranceModalityName;
    }

    public void setInsuranceModalityName(String insuranceModalityName) {
        this.insuranceModalityName = insuranceModalityName;
    }

    public String getInsurModalityDesc() {
        return insurModalityDesc;
    }

    public void setInsurModalityDesc(String insurModalityDesc) {
        this.insurModalityDesc = insurModalityDesc;
    }

    public String getInsuranceCompanyModalityId() {
        return insuranceCompanyModalityId;
    }

    public void setInsuranceCompanyModalityId(String insuranceCompanyModalityId) {
        this.insuranceCompanyModalityId = insuranceCompanyModalityId;
    }

    public String getUserAuditId() {
        return userAuditId;
    }

    public void setUserAuditId(String userAuditId) {
        this.userAuditId = userAuditId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPolicyQuotaStatusType() {
        return policyQuotaStatusType;
    }

    public void setPolicyQuotaStatusType(String policyQuotaStatusType) {
        this.policyQuotaStatusType = policyQuotaStatusType;
    }

    public String getPersonalDocType() {
        return personalDocType;
    }

    public void setPersonalDocType(String personalDocType) {
        this.personalDocType = personalDocType;
    }

    public String getParticipantPersonalId() {
        return participantPersonalId;
    }

    public void setParticipantPersonalId(String participantPersonalId) {
        this.participantPersonalId = participantPersonalId;
    }

    public String getContactEmailDesc() {
        return contactEmailDesc;
    }

    public void setContactEmailDesc(String contactEmailDesc) {
        this.contactEmailDesc = contactEmailDesc;
    }

    public String getCustomerPhoneDesc() {
        return customerPhoneDesc;
    }

    public void setCustomerPhoneDesc(String customerPhoneDesc) {
        this.customerPhoneDesc = customerPhoneDesc;
    }

    public String getRfqInternalId() {
        return rfqInternalId;
    }

    public void setRfqInternalId(String rfqInternalId) {
        this.rfqInternalId = rfqInternalId;
    }

    public BigDecimal getPayrollAmount() {
        return payrollAmount;
    }

    public void setPayrollAmount(BigDecimal payrollAmount) {
        this.payrollAmount = payrollAmount;
    }

    public String getPayrollCurrencyId() {
        return payrollCurrencyId;
    }

    public void setPayrollCurrencyId(String payrollCurrencyId) {
        this.payrollCurrencyId = payrollCurrencyId;
    }

    public BigDecimal getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(BigDecimal employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeesIndType() {
        return employeesIndType;
    }

    public void setEmployeesIndType(String employeesIndType) {
        this.employeesIndType = employeesIndType;
    }

    @Override
    public String toString() {
        return "QuotationDAO{" +
                "quoteDate='" + quoteDate + '\'' +
                ", insuranceModalityType='" + insuranceModalityType + '\'' +
                ", insuranceProductType='" + insuranceProductType + '\'' +
                ", insuranceModalityName='" + insuranceModalityName + '\'' +
                ", insurModalityDesc='" + insurModalityDesc + '\'' +
                ", insuranceCompanyModalityId='" + insuranceCompanyModalityId + '\'' +
                ", userAuditId='" + userAuditId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", policyQuotaStatusType='" + policyQuotaStatusType + '\'' +
                ", personalDocType='" + personalDocType + '\'' +
                ", participantPersonalId='" + participantPersonalId + '\'' +
                ", contactEmailDesc='" + contactEmailDesc + '\'' +
                ", customerPhoneDesc='" + customerPhoneDesc + '\'' +
                ", rfqInternalId='" + rfqInternalId + '\'' +
                ", payrollAmount=" + payrollAmount +
                ", payrollCurrencyId='" + payrollCurrencyId + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", employeesIndType='" + employeesIndType + '\'' +
                '}';
    }
}
