package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.dto;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.*;

import java.time.LocalDate;
import java.util.List;

public class companyQuotationDto extends CommonFieldsDTO {
    private String quotationReference;
    private EmployeesDTO employees;
    private LocalDate quotationDate;
    private ValidityPeriodDTO validityPeriod;
    private ProductDTO product;
    private List<ContactDetailsDTO> contactDetails;
    private DescriptionDTO businessAgent;
    private List<ParticipantDTO> participants;
    private DescriptionDTO status;

    public String getQuotationReference() {
        return quotationReference;
    }

    public void setQuotationReference(String quotationReference) {
        this.quotationReference = quotationReference;
    }

    public EmployeesDTO getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeesDTO employees) {
        this.employees = employees;
    }

    public LocalDate getQuotationDate() {
        return quotationDate;
    }

    public void setQuotationDate(LocalDate quotationDate) {
        this.quotationDate = quotationDate;
    }

    public ValidityPeriodDTO getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(ValidityPeriodDTO validityPeriod) {
        this.validityPeriod = validityPeriod;
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
