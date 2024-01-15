package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.dto;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.DescriptionDTO;


public class StatusDTO extends DescriptionDTO {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatusDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
