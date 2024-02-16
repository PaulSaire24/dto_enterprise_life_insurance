package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.dto;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.EmployeesDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.ProductDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.ValidityPeriodDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.DescriptionDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.ContactDetailsDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.ParticipantDTO;
import java.util.List;

public class GetQuotationDTO {
    private String quotationId;
    private String id;
    private String quotationDate;
    private EmployeesDTO employees;
    private ProductDTO product;
    private List <ContactDetailsDTO> contactDetailsDTO;
    private ValidityPeriodDTO validityPeriodDTO;
    private DescriptionDTO businessAgent;
    private List<ParticipantDTO> participantDTO;
    private DescriptionDTO status;
    private String quotationReference;

    public DescriptionDTO getStatus() {
        return status;
    }

    public void setStatus(DescriptionDTO status) {
        this.status = status;
    }

    public String getQuotationReference() {
        return quotationReference;
    }

    public void setQuotationReference(String quotationReference) {
        this.quotationReference = quotationReference;
    }

    public String getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(String quotationId) {
        this.quotationId = quotationId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuotationDate() {
        return quotationDate;
    }

    public void setQuotationDate(String quotationDate) {
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

    public List<ContactDetailsDTO> getContactDetailsDTO() {
        return contactDetailsDTO;
    }

    public void setContactDetailsDTO(List<ContactDetailsDTO> contactDetailsDTO) {
        this.contactDetailsDTO = contactDetailsDTO;
    }

    public ValidityPeriodDTO getValidityPeriodDTO() {
        return validityPeriodDTO;
    }

    public void setValidityPeriodDTO(ValidityPeriodDTO validityPeriodDTO) {
        this.validityPeriodDTO = validityPeriodDTO;
    }

    public DescriptionDTO getBusinessAgent() {
        return businessAgent;
    }

    public void setBusinessAgent(DescriptionDTO businessAgent) {
        this.businessAgent = businessAgent;
    }

    public List<ParticipantDTO> getParticipantDTO() {
        return participantDTO;
    }

    public void setParticipantDTO(List<ParticipantDTO> participantDTO) {
        this.participantDTO = participantDTO;
    }

    @Override
    public String toString() {
        return "GetQuotationDTO{" +
                "quotationId='" + quotationId + '\'' +
                ", id='" + id + '\'' +
                ", quotationDate='" + quotationDate + '\'' +
                ", employees=" + employees +
                ", product=" + product +
                ", contactDetailsDTO=" + contactDetailsDTO +
                ", validityPeriodDTO=" + validityPeriodDTO +
                ", businessAgent=" + businessAgent +
                ", participantDTO=" + participantDTO +
                ", quotationReference='" + quotationReference + '\'' +
                ", status=" + status +
                '}';
    }
}
