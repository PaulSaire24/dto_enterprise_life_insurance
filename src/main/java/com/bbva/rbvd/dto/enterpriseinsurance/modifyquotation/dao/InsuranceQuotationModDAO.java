package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dao;

import java.math.BigDecimal;

public class InsuranceQuotationModDAO {

    private String policyQuotaInternalId;
    private BigDecimal insuranceProductId;
    private String insuranceModalityType;
    private String saleChannelId;
    private BigDecimal paymentTermNumber;
    private String policyPaymentFrequencyType;
    private String financingStartDate;
    private String financingEndDate;
    private BigDecimal premiumAmount;
    private String premiumCurrencyId;
    private String savedQuotationIndType;
    private String lastChangeBranchId;
    private String sourceBranchId;
    private String policyQuotaStatusType;
    private String creationUserId;
    private String creationDate;
    private String userAuditId;
    private String auditDate;
    private String dataTreatmentIndType;
    private String contactEmailDesc;
    private String customerPhoneDesc;
    private String contactTimeType;
    private String domicileContractId;


    public String getPolicyQuotaInternalId() {
        return policyQuotaInternalId;
    }

    public BigDecimal getInsuranceProductId() {
        return insuranceProductId;
    }

    public String getInsuranceModalityType() {
        return insuranceModalityType;
    }

    public String getSaleChannelId() {
        return saleChannelId;
    }

    public BigDecimal getPaymentTermNumber() {
        return paymentTermNumber;
    }

    public String getPolicyPaymentFrequencyType() {
        return policyPaymentFrequencyType;
    }

    public String getFinancingStartDate() {
        return financingStartDate;
    }

    public String getFinancingEndDate() {
        return financingEndDate;
    }

    public BigDecimal getPremiumAmount() {
        return premiumAmount;
    }

    public String getPremiumCurrencyId() {
        return premiumCurrencyId;
    }

    public String getSavedQuotationIndType() {
        return savedQuotationIndType;
    }

    public String getLastChangeBranchId() {
        return lastChangeBranchId;
    }

    public String getSourceBranchId() {
        return sourceBranchId;
    }

    public String getPolicyQuotaStatusType() {
        return policyQuotaStatusType;
    }

    public String getCreationUserId() {
        return creationUserId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getUserAuditId() {
        return userAuditId;
    }

    public String getAuditDate() {
        return auditDate;
    }

    public String getDataTreatmentIndType() {
        return dataTreatmentIndType;
    }

    public String getContactEmailDesc() {
        return contactEmailDesc;
    }

    public String getCustomerPhoneDesc() {
        return customerPhoneDesc;
    }

    public String getContactTimeType() {
        return contactTimeType;
    }

    public String getDomicileContractId() {
        return domicileContractId;
    }


    public static final class InsuranceQuotationModDAOBuilder{

        private final InsuranceQuotationModDAO insuranceQuotationModDAO;

        public InsuranceQuotationModDAOBuilder(){this.insuranceQuotationModDAO = new InsuranceQuotationModDAO(); }

        public static InsuranceQuotationModDAOBuilder an(){ return new InsuranceQuotationModDAOBuilder(); }


        public InsuranceQuotationModDAOBuilder policyQuotaInternalId(String policyQuotaInternalId){
            insuranceQuotationModDAO.policyQuotaInternalId = policyQuotaInternalId;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder insuranceProductId(BigDecimal insuranceProductId){
            insuranceQuotationModDAO.insuranceProductId = insuranceProductId;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder insuranceModalityType(String insuranceModalityType){
            insuranceQuotationModDAO.insuranceModalityType = insuranceModalityType;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder saleChannelId(String saleChannelId){
            insuranceQuotationModDAO.saleChannelId = saleChannelId;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder paymentTermNumber(BigDecimal paymentTermNumber){
            insuranceQuotationModDAO.paymentTermNumber = paymentTermNumber;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder policyPaymentFrequencyType(String policyPaymentFrequencyType){
            insuranceQuotationModDAO.policyPaymentFrequencyType = policyPaymentFrequencyType;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder financingStartDate(String financingStartDate){
            insuranceQuotationModDAO.financingStartDate = financingStartDate;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder financingEndDate(String financingEndDate){
            insuranceQuotationModDAO.financingEndDate = financingEndDate;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder premiumAmount(BigDecimal premiumAmount){
            insuranceQuotationModDAO.premiumAmount = premiumAmount;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder premiumCurrencyId(String premiumCurrencyId){
            insuranceQuotationModDAO.premiumCurrencyId = premiumCurrencyId;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder savedQuotationIndType(String savedQuotationIndType){
            insuranceQuotationModDAO.savedQuotationIndType = savedQuotationIndType;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder lastChangeBranchId(String lastChangeBranchId){
            insuranceQuotationModDAO.lastChangeBranchId = lastChangeBranchId;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder sourceBranchId(String sourceBranchId){
            insuranceQuotationModDAO.sourceBranchId = sourceBranchId;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder policyQuotaStatusType(String policyQuotaStatusType){
            insuranceQuotationModDAO.policyQuotaStatusType = policyQuotaStatusType;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder creationUserId(String creationUserId){
            insuranceQuotationModDAO.creationUserId = creationUserId;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder creationDate(String creationDate){
            insuranceQuotationModDAO.creationDate = creationDate;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder userAuditId(String userAuditId){
            insuranceQuotationModDAO.userAuditId = userAuditId;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder auditDate(String auditDate){
            insuranceQuotationModDAO.auditDate = auditDate;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder dataTreatmentIndType(String dataTreatmentIndType){
            insuranceQuotationModDAO.dataTreatmentIndType = dataTreatmentIndType;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder contactEmailDesc(String contactEmailDesc){
            insuranceQuotationModDAO.contactEmailDesc = contactEmailDesc;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder customerPhoneDesc(String customerPhoneDesc){
            insuranceQuotationModDAO.customerPhoneDesc = customerPhoneDesc;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder contactTimeType(String contactTimeType){
            insuranceQuotationModDAO.contactTimeType = contactTimeType;
            return InsuranceQuotationModDAOBuilder.this;
        }

        public InsuranceQuotationModDAOBuilder domicileContractId(String domicileContractId){
            insuranceQuotationModDAO.domicileContractId = domicileContractId;
            return InsuranceQuotationModDAOBuilder.this;
        }


        public InsuranceQuotationModDAO build() {
            return insuranceQuotationModDAO;
        }




    }


}
