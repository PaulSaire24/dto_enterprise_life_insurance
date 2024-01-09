package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dto;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.*;

import java.time.LocalDate;
import java.util.List;

public class ModifyQuotationDTO extends CommonFieldsDTO {

    private LocalDate quotationDate;
    private EmployeesDTO employees;
    private ProductDTO product;
    private List<ContactDetailsDTO> contactDetails;
    private ValidityPeriodDTO validityPeriod;
    private DescriptionDTO businessAgent;
    private List<ParticipantDTO> participants;
    private String quotationReference;
    private DescriptionDTO status;

    public LocalDate getQuotationDate() {
        return quotationDate;
    }

    public void setQuotationDate(LocalDate quotationDate) {
        this.quotationDate = quotationDate;
    }

    public EmployeesDTO getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeesDTO employees) {
        this.employees = employees;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }

    public List<ContactDetailsDTO> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(List<ContactDetailsDTO> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public ValidityPeriodDTO getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(ValidityPeriodDTO validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public DescriptionDTO getBusinessAgent() {
        return businessAgent;
    }

    public void setBusinessAgent(DescriptionDTO businessAgent) {
        this.businessAgent = businessAgent;
    }

    public List<ParticipantDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantDTO> participants) {
        this.participants = participants;
    }

    public String getQuotationReference() {
        return quotationReference;
    }

    public void setQuotationReference(String quotationReference) {
        this.quotationReference = quotationReference;
    }

    public DescriptionDTO getStatus() {
        return status;
    }

    public void setStatus(DescriptionDTO status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "ModifyQuotationDTO{" +
                "id='" + this.getId() + '\'' +
                ", quotationId='" + this.getQuotationId() + '\'' +
                ", quotationDate=" + quotationDate +
                ", employees=" + employees +
                ", product=" + product +
                ", contactDetails=" + contactDetails +
                ", validityPeriod=" + validityPeriod +
                ", businessAgent=" + businessAgent +
                ", participants=" + participants +
                ", quotationReference='" + quotationReference + '\'' +
                ", status=" + status +
                '}';
    }
}
