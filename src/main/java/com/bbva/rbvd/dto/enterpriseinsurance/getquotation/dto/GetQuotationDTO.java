package com.bbva.rbvd.dto.enterpriseinsurance.getquotation.dto;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.EmployeesDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.ProductDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.ValidityPeriodDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.DescriptionDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.ContactDetailsDTO;
import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.ParticipantDTO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class GetQuotationDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    private String quotationId;
    private String id;
    private Date quotationDate;
    private EmployeesDTO employees;
    private ProductDTO product;
    private List<ContactDetailsDTO> contactDetails;
    private ValidityPeriodDTO validityPeriod;
    private DescriptionDTO businessAgent;
    private List<ParticipantDTO> participants;
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

    public Date getQuotationDate() {
        return quotationDate;
    }

    public void setQuotationDate(Date quotationDate) {
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

    @Override
    public String toString() {
        return "GetQuotationDTO{" +
                "quotationId='" + quotationId + '\'' +
                ", id='" + id + '\'' +
                ", quotationDate=" + quotationDate +
                ", employees=" + employees +
                ", product=" + product +
                ", contactDetails=" + contactDetails +
                ", validityPeriod=" + validityPeriod +
                ", businessAgent=" + businessAgent +
                ", participants=" + participants +
                ", status=" + status +
                ", quotationReference='" + quotationReference + '\'' +
                '}';
    }
}
