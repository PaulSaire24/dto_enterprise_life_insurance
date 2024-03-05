package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dao;

import java.math.BigDecimal;

public class InsuranceQuotationDAO {

    private String policyQuotaInternalId;
    private BigDecimal insuranceSimulationId;
    private String insuranceCompanyQuotaId;
    private String quoteDate;
    private String quotaHmsDate;
    private String policyQuotaEndValidityDate;
    private String customerId;
    private String policyQuotaStatusType;
    private String lastChangeBranchId;
    private String sourceBranchId;
    private String creationUserId;
    private String creationDate;
    private String userAuditId;
    private String auditDate;
    private String personalDocType;
    private String participantPersonalId;
    private String policyQuotaCancellationDate;
    private String insuredCustomerName;
    private String clientLastName;
    private BigDecimal issuedReceiptNumber;
    private String lastFourPanId;


    public String getPolicyQuotaInternalId() {
        return policyQuotaInternalId;
    }

    public BigDecimal getInsuranceSimulationId() {
        return insuranceSimulationId;
    }

    public String getInsuranceCompanyQuotaId() {
        return insuranceCompanyQuotaId;
    }

    public String getQuoteDate() {
        return quoteDate;
    }

    public String getQuotaHmsDate() {
        return quotaHmsDate;
    }

    public String getPolicyQuotaEndValidityDate() {
        return policyQuotaEndValidityDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getPolicyQuotaStatusType() {
        return policyQuotaStatusType;
    }

    public String getLastChangeBranchId() {
        return lastChangeBranchId;
    }

    public String getSourceBranchId() {
        return sourceBranchId;
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

    public String getPersonalDocType() {
        return personalDocType;
    }

    public String getParticipantPersonalId() {
        return participantPersonalId;
    }

    public String getPolicyQuotaCancellationDate() {
        return policyQuotaCancellationDate;
    }

    public String getInsuredCustomerName() {
        return insuredCustomerName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public BigDecimal getIssuedReceiptNumber() {
        return issuedReceiptNumber;
    }

    public String getLastFourPanId() {
        return lastFourPanId;
    }


    public static final class InsuranceQuotationDAOBuilder{

        private final InsuranceQuotationDAO insuranceQuotationDAO;

        public InsuranceQuotationDAOBuilder() {
            this.insuranceQuotationDAO = new InsuranceQuotationDAO();
        }

        public static InsuranceQuotationDAOBuilder an(){
            return new InsuranceQuotationDAOBuilder();
        }

        public InsuranceQuotationDAOBuilder policyQuotaInternalId(String policyQuotaInternalId){
            insuranceQuotationDAO.policyQuotaInternalId = policyQuotaInternalId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder insuranceSimulationId(BigDecimal insuranceSimulationId){
            insuranceQuotationDAO.insuranceSimulationId = insuranceSimulationId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder insuranceCompanyQuotaId(String insuranceCompanyQuotaId){
            insuranceQuotationDAO.insuranceCompanyQuotaId = insuranceCompanyQuotaId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder quoteDate(String quoteDate){
            insuranceQuotationDAO.quoteDate = quoteDate;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder quotaHmsDate(String quotaHmsDate){
            insuranceQuotationDAO.quotaHmsDate = quotaHmsDate;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder policyQuotaEndValidityDate(String policyQuotaEndValidityDate){
            insuranceQuotationDAO.policyQuotaEndValidityDate = policyQuotaEndValidityDate;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder customerId(String customerId){
            insuranceQuotationDAO.customerId = customerId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder policyQuotaStatusType(String policyQuotaStatusType){
            insuranceQuotationDAO.policyQuotaStatusType = policyQuotaStatusType;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder lastChangeBranchId(String lastChangeBranchId){
            insuranceQuotationDAO.lastChangeBranchId = lastChangeBranchId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder sourceBranchId(String sourceBranchId){
            insuranceQuotationDAO.sourceBranchId = sourceBranchId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder creationUserId(String creationUserId){
            insuranceQuotationDAO.creationUserId = creationUserId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder creationDate(String creationDate){
            insuranceQuotationDAO.creationDate = creationDate;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder userAuditId(String userAuditId){
            insuranceQuotationDAO.userAuditId = userAuditId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder auditDate(String auditDate){
            insuranceQuotationDAO.auditDate = auditDate;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder personalDocType(String personalDocType){
            insuranceQuotationDAO.personalDocType = personalDocType;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder participantPersonalId(String participantPersonalId){
            insuranceQuotationDAO.participantPersonalId = participantPersonalId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder policyQuotaCancellationDate(String policyQuotaCancellationDate){
            insuranceQuotationDAO.policyQuotaCancellationDate = policyQuotaCancellationDate;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder insuredCustomerName(String insuredCustomerName){
            insuranceQuotationDAO.insuredCustomerName = insuredCustomerName;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder clientLastName(String clientLastName){
            insuranceQuotationDAO.clientLastName = clientLastName;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder issuedReceiptNumber(BigDecimal issuedReceiptNumber){
            insuranceQuotationDAO.issuedReceiptNumber = issuedReceiptNumber;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAOBuilder lastFourPanId(String lastFourPanId){
            insuranceQuotationDAO.lastFourPanId = lastFourPanId;
            return InsuranceQuotationDAOBuilder.this;
        }

        public InsuranceQuotationDAO build() {
            return insuranceQuotationDAO;
        }


    }


}
