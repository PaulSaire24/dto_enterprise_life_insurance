package com.bbva.rbvd.dto.enterpriseinsurance.modifyquotation.dto;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.*;

import java.util.Date;
import java.util.List;

public class ModifyQuotationDTO extends CommonFieldsDTO {

    private Date quotationDate;
    private EmployeesDTO employees;
    private ProductDTO product;
    private List<ContactDetailsDTO> contactDetails;
    private ValidityPeriodDTO validityPeriod;
    private BusinessAgentDTO businessAgent;
    private List<ParticipantDTO> participants;
    private String quotationReference;
    private StatusDTO status;

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
