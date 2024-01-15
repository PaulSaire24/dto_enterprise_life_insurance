package com.bbva.rbvd.dto.enterpriseinsurance.createquotation.dto;

import com.bbva.rbvd.dto.enterpriseinsurance.commons.dto.DescriptionDTO;

public class ExclusionsDTO extends DescriptionDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExclusionsDto{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
